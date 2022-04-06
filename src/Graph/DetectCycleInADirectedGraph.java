package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInADirectedGraph {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visited = new boolean[V];
        boolean[] recSt = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!visited[i]) {
                if(dfs(adj, i, visited, recSt))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, boolean[] recSt) {
        visited[s] = true;
        recSt[s] = true;
        for(int u: adj.get(s))
        {
            if(!visited[u]) {
                if(dfs(adj, u, visited, recSt)) {
                    return true;
                }
            } else if(recSt[u])
            {
                return true;
            }
        }
        recSt[s] = false;
        return false;
    }

    public boolean detectCycleUsingKahn(int V, ArrayList<ArrayList<Integer>> adj) {
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
        int count = 0;
        while(!queue.isEmpty()) {
            int u = queue.poll();
            list.add(u);
            for(int v: adj.get(u)) {
                // if(inDeg[v] != 0)
                inDeg[v] -= 1;
                if(inDeg[v] == 0)
                    queue.add(v);
            }
            count++;
        }
        return count != V;
    }
}
