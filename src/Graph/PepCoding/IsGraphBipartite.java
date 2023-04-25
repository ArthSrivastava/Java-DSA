package Graph.PepCoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class IsGraphBipartite {
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
        int level;

        public Pair(int v, String psf, int level) {
            this.v = v;
            this.psf = psf;
            this.level = level;
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

        int[] visitedAtLevel = new int[vtces];
        Arrays.fill(visitedAtLevel, -1);

        for(int v = 0; v < vtces; v++) {
            if(visitedAtLevel[v] == -1) {
                boolean isComponentBipartite = checkComponentForBipartiteness(graph, v, visitedAtLevel);
                if(!isComponentBipartite) {
                    System.out.println("Not a bipartite graph!");
                    return;
                }
            }
        }
        System.out.println("Bipartite graph!");
    }

    private static boolean checkComponentForBipartiteness(ArrayList<Edge>[] graph, int src, int[] visited) {
        Deque<Pair> deque = new ArrayDeque<>();
        deque.offer(new Pair(src, src + "", 0));
        while(deque.size() > 0) {
            Pair rem = deque.pollFirst();

            if(visited[rem.v] != -1) {
                //cycle
                if(rem.level != visited[rem.v]) {
                    //implies odd cycle
                    return false;
                }
            } else {
                visited[rem.v] = rem.level;
            }

            for(Edge e: graph[rem.v]) {
                if(visited[e.nbr] == -1) {
                    deque.offer(new Pair(e.nbr, rem.psf + e.nbr, rem.level + 1));
                }
            }
        }
        return true;
    }

    }
