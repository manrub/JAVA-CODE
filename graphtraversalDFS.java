import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
 class Graph
{int V;
LinkedList<Integer> adjlist[];
    Graph(int V)
    {
        this.V=V;
        adjlist=new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adjlist[i]=new LinkedList<Integer>();
        }
        
    }
    public void addEdge(int src,int dest)
    {
    adjlist[src].add(dest);
    }
    public void print()
    {
        for(int i=0;i<V;i++)
        {
            System.out.print("head"+i);
        for(int li :adjlist[i])
        {
            System.out.print("->"+li);
        }
        System.out.println("");
        }
        
    }
    public void DFS(int v)
    {
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++)
        {
        visited[i]=false;
        }
        DFSUtil(v,visited);
    }
    public void DFSUtil(int v,boolean[] visited)
    {
        visited[v]=true;
        System.out.print(v+" ");
        Iterator<Integer> i=adjlist[v].listIterator();
        while(i.hasNext())
        {
            int p=i.next();
            if(!visited[p])
            DFSUtil(p,visited);
        }
        
    }
}
class graphtraversalDFS
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        Graph g=new Graph(V);
        g.addEdge(0,1);
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        g.DFS(2);
        
  
    }
}