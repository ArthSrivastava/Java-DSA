package Graph.PepCoding;

public class GraphAdjMatrix {
    private int[][] adjMatrix;
    private int numVertices;

    GraphAdjMatrix(int numVertices) {
        this.numVertices = numVertices;
        this.adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        adjMatrix[source][destination] = 1;
        adjMatrix[destination][source] = 1;
    }

    public void removeEdge(int source, int destination) {
        adjMatrix[source][destination] = 0;
        adjMatrix[destination][source] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Creating a new graph
        GraphAdjMatrix graph = new GraphAdjMatrix(7);

        //Adding the edges
        graph.addEdge(0, 3);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(4, 6);

        //Printing the graph
        graph.printGraph();

        //Removing an edge
        graph.removeEdge(0, 1);

        System.out.println("Removed 0->1 edge:");
        graph.printGraph();
    }

}
