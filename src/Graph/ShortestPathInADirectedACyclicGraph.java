package Graph;

import java.util.*;

public class ShortestPathInADirectedACyclicGraph {

    static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    private static ArrayList<ArrayList<Edge>> createGraph(int V) {
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        return graph;
    }

    public static void addEdge(ArrayList<ArrayList<Edge>> adj, int source, int dest, int wt) {
        Edge addDirectedWeightedEdge = new Edge(source, dest, wt);
        adj.get(source).add(addDirectedWeightedEdge);
    }

    public static int[] topoSort(ArrayList<ArrayList<Edge>> adj, int V) {
        int[] inDeg = new int[V];
        for (List<Edge> bucket: adj) {
            for (Edge e : bucket) {
                inDeg[e.destination]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDeg[i] == 0) {
                queue.add(i);
            }
        }
        int[] topSort = new int[V];
        int index = 0;
        while (!queue.isEmpty()) {
            int u = queue.remove();
            topSort[index++] = u;
            for (Edge e : adj.get(u)) {
                inDeg[e.destination]--;
                if (inDeg[e.destination] == 0) {
                    queue.add(e.destination);
                }
            }
        }
        return topSort;
    }

    public static void getPath(ArrayList<ArrayList<Edge>> adj, int V, int s) {
        int[] dist = new int[V];
        int[] topSort = topoSort(adj, V);
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[s] = 0;
        for (int i = 0; i < V; i++) {
            int nodeIndex = topSort[i];
            for (Edge e: adj.get(nodeIndex)) {
                if (dist[e.destination] > dist[nodeIndex] + e.weight) {
                    dist[e.destination] = dist[nodeIndex] + e.weight;
                }
            }
        }
        System.out.println("Topological Sort:" + Arrays.toString(topSort));
        System.out.println("Shortest Path:" + Arrays.toString(dist));
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Edge>> adj = createGraph(V);
        addEdge(adj, 0, 1, 2);
        addEdge(adj, 0, 4, 1);
        addEdge(adj, 1, 2, 3);
        addEdge(adj, 4, 2, 2);
        addEdge(adj, 4, 5, 4);
        addEdge(adj, 2, 3, 6);
        addEdge(adj, 5, 3, 1);
        getPath(adj, V, 0);
    }
}
