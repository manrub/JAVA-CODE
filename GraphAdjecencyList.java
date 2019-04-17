import java.util.LinkedList;
import java.util.Scanner;
public class GraphAdjecencyList{

    static class Graph {
        int V;
        LinkedList<Integer> adjListArray[];

        Graph(int V) {
            this.V = V;
            adjListArray = new LinkedList[V];
            for (int i = 0; i < V; i++)
                adjListArray[i] = new LinkedList<Integer>();

        }

        static void addEdge(Graph graph, int src, int dest) {
            graph.adjListArray[src].add(dest);
            graph.adjListArray[dest].add(src);
        }

      static void printGraph(Graph graph) {
            for (int v = 0; v < graph.V; v++) {
                System.out.println("Adjacency list of vertex " + v);
                System.out.print("head");
                for (Integer i :graph.adjListArray[v])
                {
                    System.out.print("->"+i);
                }
                System.out.println();
            }
        }

        // Driver program to test above functions
        public static void main(String args[]) {
            // create the graph given in above figure
            int V = 5;
            Graph graph = new Graph(V);
            addEdge(graph, 0, 1);
            addEdge(graph, 0, 4);
            addEdge(graph, 1, 2);
            addEdge(graph, 1, 3);
            addEdge(graph, 1, 4);
            addEdge(graph, 2, 3);
            addEdge(graph, 3, 4);

            // print the adjacency list representation of
            // the above graph
            printGraph(graph);
        }
    }
}
