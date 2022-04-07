package Graph;

import java.util.*;

public class Graph {

    public void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }

    public void addDirectedEdge(ArrayList<ArrayList<Integer>> list, int u, int v) {
        list.get(u).add(v);
    }

    public void addDirectedWeightedEdge(ArrayList<ArrayList<Integer>> list, int u, int v, int w) {
        weightEdge edge = new weightEdge(u, v, w);
        list.get(u).add(v);
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

}
