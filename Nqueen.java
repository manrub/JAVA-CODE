import java.util.Scanner;

public class Nqueen {
    static int N;
    boolean issafe(int[][] board,int i,int j,int N)
    {//check in column
        for(int row=0;row<N;row++)
        {
            if(board[row][j]==1)
                return false;
        }
        //check in left diagonal
        int x=i;
        int y=j;
        while(x>=0&&y>=0)
        {
            if(board[x][y]==1)
                return  false;
            x=x-1;
            y=y-1;
        }
        x=i;
        y=j;
        //check for right diagonal
        while(x>=0&&y<N)
        {
            if(board[x][y]==1)
                return  false;
            x--;
            y++;
        }
        return true;
    }
    boolean solveNQueen(int[][] board,int i,int N) {
        if (i == N)
            return true;
        else {//try to place the queen in current row and call on reamaining part;
            for (int j = 0; j < N; j++) {
                if (issafe(board, i, j, N)) {
                    board[i][j] = 1;
                    boolean nextQueenRakhpaye = solveNQueen(board, i + 1, N);
                    if (nextQueenRakhpaye == true)
                        return true;
                    board[i][j] = 0;

                }
            }
            //you could have tried for all position but could place it
            return false;

        }
    }

    public static void main(String[] args)
        {
            int N=5;
            Nqueen q = new Nqueen();
            int board[][] = { { 0, 0, 0, 0,0 },
                    { 0, 0, 0, 0,0},
                    { 0, 0, 0, 0 ,0},
                    { 0, 0, 0, 0,0 },
                    {0,0,0,0,0,0}
                };
            q.solveNQueen(board,0,N);
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                    System.out.print(" "+board[i][j]+" ");
                System.out.println();
            }

    }
}
