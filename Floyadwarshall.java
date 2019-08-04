import java.util.Scanner;

import static java.lang.Math.*;

public class Floyadwarshall
{
    public static void  floyadwarshall(int[][] arr,int v)
    {
        for(int k=0;k<v;k++) {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                    arr[i][j] = min(arr[i][j], (arr[i][k] + arr[k][j]));
                }
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of vertices");
        int V=4;
        System.out.println("enter number of edges");
        int  INF=99999;
        int arr[][] = { {0,   5,  INF, 10},
                {INF, 0,   3, INF},
                {INF, INF, 0,   1},
                {INF, INF, INF, 0}
        };


        floyadwarshall(arr,4);
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+"                                    ");
            }
            System.out.println();

        }
    }

}
