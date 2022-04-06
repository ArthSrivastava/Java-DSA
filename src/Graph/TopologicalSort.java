package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort {
    public int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        int[] inDeg = new int[V];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < adj.size(); i++) {
            for(int j = 0; j < adj.get(i).size(); j++)
            {
                inDeg[adj.get(i).get(j)]++;
            }
        }
        // for(int i = 0; i < inDeg.length; i++)
        // {
        //     System.out.println(i + ": " + inDeg[i]);
        // }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < inDeg.length; i++) {
            if(inDeg[i] == 0)
                queue.add(i);
        }
        while(!queue.isEmpty()) {
            int u = queue.poll();
            list.add(u);
            for(int v: adj.get(u)) {
                // if(inDeg[v] != 0)
                inDeg[v] -= 1;
                if(inDeg[v] == 0)
                    queue.add(v);
            }
        }
        int[] arr = new int[V];
        for(int i = 0; i < list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public int[] topoSortUsingDFS(int V, ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfsRecursive(adj, i, visited, stack);
            }
        }
        int[] arr = new int[V];
        int i = 0;
        while (!stack.isEmpty()) {
            arr[i] = stack.pop();
            i++;
        }
        return arr;
    }

    private void dfsRecursive(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, Stack<Integer> stack) {
        visited[s] = true;
        for (int v : adj.get(s)) {
            if (!visited[v]) {
                dfsRecursive(adj, v, visited, stack);
            }
        }
        stack.push(s);
    }
}
