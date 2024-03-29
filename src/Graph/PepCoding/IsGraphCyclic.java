package Graph.PepCoding;

import java.io.*;
import java.util.*;

public class IsGraphCyclic {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    static class Pair {
        int v;
        String psf;
        public Pair(int v, String psf) {
            this.v = v;
            this.psf = psf;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        // write your code here
        boolean[] visited = new boolean[vtces];
        for(int i = 0; i < vtces; i++) {
            if(!visited[i]) {
                boolean hasCycle = bfs(graph, i, visited);
                if(hasCycle) {
                    System.out.println("Cycle detected!");
                    return;
                }
            }
        }
        System.out.println("No cycle found!");
    }

    private static boolean bfs(ArrayList<Edge>[] graph, int src, boolean[] visited) {

        Deque<Pair> deque = new ArrayDeque<>();
        deque.offer(new Pair(src, src + ""));
        while(!deque.isEmpty()) {
            Pair p = deque.pollFirst();
            if(visited[p.v]) {
                return true;
            }
            visited[p.v] = true;
            for(Edge e: graph[p.v]) {
                if(!visited[e.nbr]) {
                    deque.offer(new Pair(e.nbr, p.psf + e.nbr));
                }
            }
        }
        return false;
    }


}
