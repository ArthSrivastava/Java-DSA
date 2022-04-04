package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInAnUnweightedGraph{
    public void getShortestPath(ArrayList<ArrayList<Integer>> adj, int v, int s) {
        boolean[] visited = new boolean[v + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        int[] dist = new int[v];
        for (int i = 0; i < v; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[s] = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int x : adj.get(u)) {
                if (!visited[x]) {
                    dist[x] = dist[u] + 1;
                    visited[x] = true;
                    queue.add(x);
                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }
}
