package Graph.PepCoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SpreadInfection {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
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
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        // write your code here
        boolean[] visited = new boolean[vtces];
        System.out.println(countInfectedPeople(graph, src, t, visited));

    }

    static class Pair {
        int v;
        int time;
        public Pair(int v, int time) {
            this.v = v;
            this.time = time;
        }
    }
    private static int countInfectedPeople(ArrayList<Edge>[] graph, int src, int t, boolean[] visited) {

        int count = 0;
        Deque<Pair> deque = new ArrayDeque<>();
        deque.offer(new Pair(src, 1));
        while(deque.size() > 0) {
            Pair rem = deque.pollFirst();
            if(visited[rem.v]) continue;
            visited[rem.v] = true;
            if(rem.time > t) break;
            count++;
            for(Edge e: graph[rem.v]) {
                if(!visited[e.nbr]) {
                    deque.offer(new Pair(e.nbr, rem.time + 1));
                }
            }
        }

        return count;
    }
}
