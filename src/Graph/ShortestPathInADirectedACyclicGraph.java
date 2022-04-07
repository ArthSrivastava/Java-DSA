package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class ShortestPathInADirectedACyclicGraph {
    public void getPath(ArrayList<ArrayList<Integer>> adj, int V, int s) {
        TopologicalSort obj = new TopologicalSort();
        int[] arr = obj.topoSort(V, adj);
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        weightEdge wt = new weightEdge();
        dist[s] = 0;
        for (int i = 0; i < V; i++) {
            for (int v : adj.get(arr[i])) {
                System.out.println(wt.weight);
//                if (dist[v] > dist[i] + wt.weight)) {
//                    dist[v] = dist[i] + ob.weight.get(v);
//                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }

}
