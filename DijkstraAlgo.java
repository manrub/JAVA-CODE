import java.util.Scanner;

public class DijkstraAlgo
{
    static final int V=9;
    public static int minDistance(int[] dist,boolean[] b)
    {
        int min = Integer.MAX_VALUE, minindex = -1;
        for (int i = 0; i < dist.length; i++)
        {
            if (b[i] == false &&min > dist[i])
            {
                min = dist[i];
                minindex = i;
            }

        }
        return minindex;
    }
     public static void printSolution(int dist[], int n)
    {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i+" tt "+dist[i]);
    }


    public static void dijk(int[][] graph,int src) {
        int[] dist = new int[9];
        boolean[] b = new boolean[9];
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            b[i] = false;
        }
        dist[src] = 0;
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, b);
            b[u] = true;
            for (int v = 0; v < V; v++) {

                if (!b[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
            }

        }
        printSolution(dist, V);
    }
        public static void main(String[] args)
{

        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}};
        dijk(graph, 1);
    }

}

