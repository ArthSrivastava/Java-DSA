package Graph;

import java.util.ArrayList;

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
}
