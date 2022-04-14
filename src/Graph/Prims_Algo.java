package Graph;
import java.util.Arrays;
public class Prims_Algo {
    private static void addEdge(int u, int v, int wt, int[][] adjMatrix) {
        adjMatrix[u][v] = wt;
        adjMatrix[v][u] = wt;
    }

    private static void printAdjMatrix(int[][] adjMatrix) {
        int V = adjMatrix.length;
        for (int[] matrix : adjMatrix) {
            for (int e : matrix) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    private static int selectMinVertex(int[] dist, boolean[] mstSet) {
        int vertex = -1;
        int minimum = Integer.MAX_VALUE;
        int V = dist.length;
        for (int i = 0; i < V; i++) {
            if (!mstSet[i] && dist[i] < minimum) {
                vertex = i;
                minimum = dist[i];
            }
        }
        return vertex;
    }

    private static void findMST(int[][] graph, int V) {
        int[] parent = new int[V];
        boolean[] mstSet = new boolean[V];
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        parent[0] = -1;  //Starting vertex has no parent
        dist[0] = 0;     //Starting vertex has dist = 0 to get picked first

        //Form MST with V - 1 edges
        for (int i = 0; i < V - 1; i++) {
            int u = selectMinVertex(dist, mstSet); //Select best vertex by applying greedy approach
            mstSet[u] = true;  //Add vertex u to MST set

            //Relax all the adjacent edges of u that are not yet included in MST set
            for (int j = 0; j < V; j++) {
                /* 3 constraints to relax:-
			      1.Edge is present from u to j.
			      2.Vertex j is not included in MST
			      3.Edge weight is smaller than current edge weight
			    */
                if (graph[u][j] != 0 && !mstSet[j] && graph[u][j] < dist[j]) {
                    dist[j] = graph[u][j];
                    parent[j] = u;
                }
            }
        }

        //Printing the MST
        int totalCost = 0;
        for (int i = 1; i < V; i++) {
            System.out.println("U -> V:" + parent[i] + "->" + i + " wt = " + graph[parent[i]][i]);
            totalCost += dist[i];
        }
        System.out.println("Total Cost:" + totalCost);
    }


    public static void main(String[] args) {
        int V = 6;
        int[][] adjMatrix = new int[V][V];
        addEdge(0, 1, 4, adjMatrix);
        addEdge(0, 2, 6, adjMatrix);
        addEdge(1, 2, 6, adjMatrix);
        addEdge(1, 3, 3, adjMatrix);
        addEdge(1, 4, 4, adjMatrix);
        addEdge(2, 3, 1, adjMatrix);
        addEdge(3, 4, 2, adjMatrix);
        addEdge(3, 5, 3, adjMatrix);
        addEdge(4, 5, 7, adjMatrix);
        printAdjMatrix(adjMatrix);
        findMST(adjMatrix, V);
    }
}
