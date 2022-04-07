package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    public void bfsTraversal(ArrayList<ArrayList<Integer>> adj, int V, int s) {
        boolean[] visited = new boolean[V + 1];
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");
            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
        System.out.println();
    }

    private void bfsTraversalDis(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");
            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
        System.out.println();
    }

    public void bfsDis(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v + 1];
        int count = 0;
        for (int i = 0; i <= v; i++) {
            if (!visited[i]) {
                count++;
                bfsTraversalDis(adj, i, visited);
            }
        }
        System.out.println("Number of connected components:" + count);
    }
}
