package Graph;

import java.util.ArrayList;

public class DFSTraversal {

    public void dfsTraversal(ArrayList<ArrayList<Integer>> adj, int V, int s) {
        boolean[] visited = new boolean[V + 1];
        dfsRecursive(adj, s, visited);
    }

    public void dfsDis(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V + 1];
        int count = 0;
        for (int i = 0; i <= V; i++) {
            if (!visited[i]) {
                count++;
                dfsRecursive(adj, i, visited);
            }
        }
        System.out.println("Connected components:" + count);
    }

    private void dfsRecursive(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");

        for (int u : adj.get(s)) {
            if (!visited[u]) {
                dfsRecursive(adj, u, visited);
            }
        }
    }
}
