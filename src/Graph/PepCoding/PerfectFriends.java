package Graph.PepCoding;

import java.util.*;

public class PerfectFriends {
    static class Edge {
        int src;
        int nbr;
        public Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        boolean[] visited = new boolean[n];
        List<Edge>[] graph = new ArrayList[n];
        for(int v = 0; v < n; v++) {
            graph[v] = new ArrayList<>();
        }

        for(int e = 0; e < k; e++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }
        List<List<Integer>> comps = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> comp = new ArrayList<>();
                dfs(graph, i, comp, visited);
                comps.add(comp);
            }
        }
        int pairs = 0;
        for(int i = 0; i < comps.size(); i++) {
            for(int j = i + 1; j < comps.size(); j++) {
                int count = comps.get(i).size() * comps.get(j).size();
                pairs += count;
            }
        }
        System.out.println(pairs);
    }

    private static void dfs(List<Edge>[] graph, int src, List<Integer> comp, boolean[] visited) {

        visited[src] = true;
        comp.add(src);
        for(Edge e: graph[src]) {
            if(!visited[e.nbr]) {
                dfs(graph, e.nbr, comp, visited);
            }
        }
    }
}
