import java.util.*;
/* 
 *  Breadth first search. //and count the no. disconnected in graph
 */
public class BFS {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {

        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static int count=0;// to count the no. of disconnected graph. or provinces.
    public static void main(String[] args) {
        
        int v = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i=0;i<v;i++)
            adj.add(new ArrayList<>());

            addEdge(adj, 0, 1);
            addEdge(adj, 0, 2);
            addEdge(adj, 1, 3);
            addEdge(adj, 1, 2);
            addEdge(adj, 2, 3);
            addEdge(adj, 2, 4);
            addEdge(adj, 3, 4);
            addEdge(adj, 5, 6);

            BFS_ifGraphIsConnected(adj, v, 3);
            System.out.println();

            BSF_ifGraphNotConnect(adj, v);
    }
    /* 
     *   BFS using queue  and each vertex of graph is connected.
     */
    static void BFS_ifGraphIsConnected(ArrayList<ArrayList<Integer>> adj,int v,int s)
    {
        Queue<Integer> q=new LinkedList<>();

        boolean visited[] =new boolean[v+1]; // maintain visited element.
        q.add(s);
        visited[s]=true;
        while(q.isEmpty()==false)
        {
            int u=q.poll();
            System.out.print(u+ " ");

            for(int ele:adj.get(u))  // iterator ke trah work karega.
            {
                if(visited[ele]==false)
                {
                    visited[ele]=true;
                    q.add(ele);
                }
            }
        }
    }
    /* 
     *  if graph is not connected
     *  v is size if Arraylist and s=source from which start.
     */
    static void BSF_ifGraphNotConnect(ArrayList<ArrayList<Integer>> adj, int v) 
    {
        boolean [] visited=new boolean[v+1];
        
        for(int i=3;i<v;i++)
        {
            if(visited[i]==false){

                count++;  //to count the no. of disconnected graph.
                bfs(adj, i, visited);   //function pass kiye hai bfs.
            }
        }
    }
    static void bfs(ArrayList<ArrayList<Integer>> adj,int s,boolean [] visited)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        visited[s]=true;
        while(q.isEmpty()==false)
        {
            int u=q.poll();
            System.out.print(u+ " ");

            for(int v:adj.get(u))  // iterator ke trah work karega.
            {
                if(visited[v]==false)
                {
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
    }
}
