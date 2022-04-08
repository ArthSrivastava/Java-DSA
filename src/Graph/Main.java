package Graph;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int v = 6;
        Graph operations = new Graph();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

//        operations.addDirectedWeightedEdge(adj, 0, 1, 2);
//        operations.addDirectedWeightedEdge(adj, 0, 4, 1);
//        operations.addDirectedWeightedEdge(adj, 1, 2, 3);
//        operations.addDirectedWeightedEdge(adj, 4, 2, 2);
//        operations.addDirectedWeightedEdge(adj, 4, 5, 4);
//        operations.addDirectedWeightedEdge(adj, 2, 3, 6);
//        operations.addDirectedWeightedEdge(adj, 5, 3, 1);
//
//        ShortestPathInADirectedACyclicGraph sp = new ShortestPathInADirectedACyclicGraph();
//        sp.getPath(adj, v, 0);
    }
}
