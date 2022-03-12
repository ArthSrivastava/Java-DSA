package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdjacencyList {
    private static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }

    private static void printAdjacencyList(ArrayList<ArrayList<Integer>> list) {
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

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);


        printAdjacencyList(adj);
    }
}
