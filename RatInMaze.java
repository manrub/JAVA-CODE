/*public class RatInMaze
{
    static int N;
    void print(int[][] sol)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
                System.out.print(" "+sol[i][j]+" ");
        System.out.println();
        }
        System.out.println("\n");
    }
    boolean isSafe(int[][] maze,int i,int j)
    {
        return (i>=0  &&i<N &&j>=0 &&j<N &&maze[i][j]==1);
    }
    boolean solMaze(int[][] maze)
    {
        int[][] sol=new int[N][N];
        if(solMazeUtil(maze,0,0,sol)==false)
        {
            System.out.println("Solution doesn't exist");
            return false;
        }
        print(sol);
        return true;
    }
    boolean solMazeUtil(int[][] maze,int i ,int j,int[][] sol)
    {
        if(i==N-1 &&j==N-1)
        {
            sol[i][j]=1;
            return true;
        }
        else {
            if (isSafe(maze, i, j) == true) {
                sol[i][j]=1;
                if (solMazeUtil(maze, i, j + 1, sol)) {
                    return true;
                }
                if (solMazeUtil(maze, i + 1, j, sol))
                    return true;
                sol[i][j] = 0;
                return false;
            }
            return false;
        }

    }
    public static void main(String[] args) {

        RatInMaze rat = new RatInMaze();
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 } };
        N=maze.length;
        rat.solMaze(maze);
    }
}*/


public class RatInMaze
{
    static int N;
    void print(int[][] sol)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
                System.out.print(" "+sol[i][j]+" ");
            System.out.println();
        }
        System.out.println("\n");
    }

    void solMazeUtil(int[][] maze,int i ,int j,int[][] sol) {
                 if (i == N - 1 && j == N - 1) {
                        sol[i][j] = 1;
                        print(sol);
                        return;
                     }
        if (i < 0 || i >=N || j < 0 || j >=N || maze[i][j]==0 || sol[i][j]==1) {
            return;
        }
        sol[i][j] = 1;
        solMazeUtil(maze, i+1, j, sol);
        solMazeUtil(maze, i-1 , j, sol);
        solMazeUtil(maze, i, j+1 , sol);
        solMazeUtil(maze, i, j-1 , sol);
        sol[i][j] = 0;

    }    public static void main(String[] args) {

        RatInMaze rat = new RatInMaze();
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 0, 1, 1, 0 },
                {0, 1, 1, 1 } };
        N=maze.length;
        int[][] sol=new int[N][N];
        rat.solMazeUtil(maze,0,0,sol);
    }
}