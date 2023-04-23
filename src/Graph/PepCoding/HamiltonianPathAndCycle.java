package Graph.PepCoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HamiltonianPathAndCycle {
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

        int src = Integer.parseInt(br.readLine());

        // write all your codes here
        Set<Integer> visited = new HashSet<>();
        hamiltonian(graph, src, visited, src + "", src);
    }

    private static void hamiltonian(ArrayList<Edge>[] graph, int src, Set<Integer> visited, String psf, int osrc) {
        if(visited.size() == graph.length - 1) {
            System.out.print(psf);

            //check for hamiltonian cycle: edge from final node to source
            boolean hasEdgeToSrc = false;
            for(Edge e: graph[src]) {
                if(e.nbr == osrc) {
                    hasEdgeToSrc = true;
                    break;
                }
            }
            if(hasEdgeToSrc) {
                //it means that it is a cycle
                System.out.println("*");
            } else {
                //path
                System.out.println(".");
            }
        }
        visited.add(src);
        for(Edge e: graph[src]) {
            if(!visited.contains(e.nbr)) {
                hamiltonian(graph, e.nbr, visited, psf + e.nbr, osrc);
            }
        }
        visited.remove(src);
    }
}
