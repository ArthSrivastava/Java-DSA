package Graph;

import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        GraphOperations operations = new GraphOperations();
        int v = 5;
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

        operations.addDirectedEdge(adj, 0, 2);
        operations.addDirectedEdge(adj, 0, 3);
        operations.addDirectedEdge(adj, 2, 3);
        operations.addDirectedEdge(adj, 1, 3);
        operations.addDirectedEdge(adj, 1, 4);
        DetectCycleInADirectedGraph obj = new DetectCycleInADirectedGraph();
        System.out.println(obj.isCyclic(v, adj));
//        operations.printAdjacencyList(adj);

        TopologicalSort obj1 = new TopologicalSort();
        System.out.println(Arrays.toString(obj1.topoSort(v, adj)));
    }
}
