package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleInAnUndirectedGraph {
    //BFS Based
    private boolean hasCycleByBFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int[] parent) {
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int x : adj.get(u)) {
                parent[x] = u;
                if (!visited[x]) {
                    visited[x] = true;
                    queue.add(x);
                } else if (x != parent[u]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean bfsDistinct(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        parent[0] = -1;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (hasCycleByBFS(adj, i, visited, parent)) {
                    return true;
                }
            }
        }
        return false;
    }

    //DFS Based
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++)
        {
            if(!visited[i]){
                if(dfsRec(adj, i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {

        visited[s] = true;
        for(int i: adj.get(s))
        {
            if(!visited[i]) {
                if(dfsRec(adj, i, visited, s))
                    return true;
            }
            else if(i != parent)
                return true;
        }
        return false;
    }
}
