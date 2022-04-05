package Graph;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GraphOperations operations = new GraphOperations();
        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
//        operations.addEdge(adj, 0, 1);
//        operations.addEdge(adj, 0, 2);
//        operations.addEdge(adj, 1, 2);
//        operations.addEdge(adj, 1, 3);
//        operations.addEdge(adj, 2, 3);
//        ShortestPathInAnUnweightedGraph obj = new ShortestPathInAnUnweightedGraph();
//        obj.getShortestPath(adj, v, 1);

//        operations.addEdge(adj, 0, 1);
//        operations.addEdge(adj, 1, 3);
//        operations.addEdge(adj, 1, 2);
//        operations.addEdge(adj, 2, 3);
//        CycleInAnUndirectedGraph obj = new CycleInAnUndirectedGraph();
//        System.out.println(obj.bfsDistinct(adj, v));

        operations.addDirectedEdge(adj, 5, 3);
        operations.addDirectedEdge(adj, 3, 1);
        operations.addDirectedEdge(adj, 1, 2);
        operations.addDirectedEdge(adj, 2, 4);
        operations.addDirectedEdge(adj, 4, 0);
        DetectCycleInADirectedGraph obj = new DetectCycleInADirectedGraph();
        System.out.println(obj.isCyclic(v, adj));
//        operations.printAdjacencyList(adj);
    }
}
