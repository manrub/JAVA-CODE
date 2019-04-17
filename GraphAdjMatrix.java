import java.util.Scanner;
class graphIntilialize {
    int V;
    int[][] adjmatrix;

    graphIntilialize(int V) {
        this.V = V;
        adjmatrix = new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                adjmatrix[i][j] = 0;
            }

        }
    }
        public void addEdge ( int src, int dest)
        {
            adjmatrix[src][dest] = 1;
        }
        public void printadjmatrix ()
        {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    System.out.print(adjmatrix[i][j] + " ");
                }
                System.out.println();
            }
        }



}

public class GraphAdjMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of vertices:");
        int v=sc.nextInt();
        graphIntilialize g=new graphIntilialize(v);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.printadjmatrix();


    }
}
