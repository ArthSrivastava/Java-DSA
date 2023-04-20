package Graph.PepCoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Set;

public class TotalConnectedComponents {
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

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

        // write your code here
        int count = 0;
        boolean[] visited = new boolean[vtces];
        for(int i = 0; i < vtces; i++) {
            ArrayList<Integer> component = new ArrayList<>();
            if(!visited[i]) {
                count++;
                dfs(graph, i, visited, component);
                comps.add(component);
            }
        }

        System.out.println(count);
        System.out.println(comps);
    }

    public static void dfs(ArrayList<Edge>[] graph, int src, boolean[] visited, ArrayList<Integer> component) {
        visited[src] = true;
        component.add(src);
        for(Edge e: graph[src]) {
            if(!visited[e.nbr])
                dfs(graph, e.nbr, visited, component);
        }
    }
}
