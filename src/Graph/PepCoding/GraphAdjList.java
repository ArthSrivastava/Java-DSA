package Graph.PepCoding;

import java.util.ArrayList;
import java.util.Arrays;

public class GraphAdjList {
    private ArrayList<Edge>[] adjList;
    private int numVertices;

    GraphAdjList(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList[numVertices];
        for (int vertex = 0; vertex < numVertices; vertex++) {
            adjList[vertex] = new ArrayList<>();
        }
    }

    public void addWeightedEdge(int source, int destination, int weight) {
        adjList[source].add(new Edge(source, destination, weight));
        adjList[destination].add(new Edge(destination, source, weight));
    }

    public void addUnweightedEdge(int source, int destination) {
        adjList[source].add(new Edge(source, destination));
        adjList[destination].add(new Edge(destination, source));
    }
    public void printGraph() {
        for (ArrayList<Edge> edges: adjList) {
            System.out.println(edges);
        }
    }

    public static void main(String[] args) {
        GraphAdjList graph = new GraphAdjList(7);
        graph.addWeightedEdge(0, 1, 10);
        graph.addWeightedEdge(0, 3, 20);
        graph.addWeightedEdge(1, 2, 30);
        graph.addWeightedEdge(2, 3, 40);
        graph.addWeightedEdge(2, 4, 50);
        graph.addWeightedEdge(4, 5, 60);
        graph.addWeightedEdge(4, 6, 70);
        graph.addWeightedEdge(5, 6, 80);

        //Unweighted edge
        graph.addUnweightedEdge(0, 4);
        graph.printGraph();
    }
}
