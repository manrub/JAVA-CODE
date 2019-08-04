public class KnightTour {
    static int n=8;
    static int[] pathrow1={2, 1, -1, -2, -2, -1, 1, 2};
    static  int[] pathcol1={1,2,2,1,-1,-2,-2,-1};


    public static boolean issafe(int [][] board,int row,int col)
    {
        if((row>=0&&row<=n-1) && (col>=0 && col<=n-1) && (board[row][col]==0))
            return true;
        return false;
    }


    public static  boolean  knightTour1(int[][] board,int row ,int col,int  moves)
    {
        if(moves==64)
        {
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                    System.out.print(board[i][j] + "    ");
                System.out.println();
            }
            return true;
        }
            else
            {
                for(int i=0;i<pathrow1.length;i++)
                    {
                        int rowNew=row+pathrow1[i];
                        int colNew=col+pathcol1[i];
                        if(issafe(board,rowNew,colNew))
                        {
                            moves++;
                            board[rowNew][colNew]=moves;
                            if(knightTour1(board,rowNew,colNew,moves))
                                return true;
                            moves--;
                            board[rowNew][colNew]=0;
                        }
                    }
            }
            return false;





    }

    public static void main(String[] args) {
int[][] board=new int[8][8];
board[0][0]=1;
knightTour1(board,0,0,1);
    }
}
