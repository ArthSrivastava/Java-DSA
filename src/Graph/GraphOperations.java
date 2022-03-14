package Graph;

import java.lang.reflect.Array;
import java.util.*;

public class GraphOperations {
    public void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }

    public void printAdjacencyList(ArrayList<ArrayList<Integer>> list) {
//        for (List<Integer> li : list) {
//            System.out.println(li);
//        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + ":");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

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

    private void bfsTraversal(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
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
                bfsTraversal(adj, i, visited);
            }
        }
        System.out.println("Number of connected components:" + count);
    }

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
