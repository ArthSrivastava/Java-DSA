package Graph;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GraphOperations operations = new GraphOperations();
        int v = 8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        operations.addEdge(adj, 0, 1);
        operations.addEdge(adj, 0, 2);
        operations.addEdge(adj, 1, 3);
        operations.addEdge(adj, 2, 3);

        operations.addEdge(adj, 4, 5);
        operations.addEdge(adj, 4, 6);
        operations.addEdge(adj, 5, 6);

        operations.addEdge(adj, 7, 8);
//        operations.printAdjacencyList(adj);

        operations.bfsTraversal(adj, v, 0);
        operations.bfsDis(adj, v);

//        operations.addEdge(adj, 0, 1);
//        operations.addEdge(adj, 0, 2);
//        operations.addEdge(adj, 1, 3);
//        operations.addEdge(adj, 1, 4);
//        operations.addEdge(adj, 2, 3);
//        operations.addEdge(adj, 3, 4);

//        operations.dfsTraversal(adj, v, 0);
//        operations.dfsDis(adj, v);
    }
}
