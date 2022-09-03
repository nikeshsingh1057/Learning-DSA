import java.util.ArrayList;
/* 
 *  DFS traveshal.  // and count the no. of disconnected graph.
 */
public class DFS {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {

        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static int count=0;  // for counting disconnected.
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

        dfs_IfConnected(v, adj);
        System.out.println();
        DFS_Disconnected(v, adj);

        System.out.println(count);    //for display no. of disconnection in graph.
    }
    /* 
     *  dfs if graph is connected.
     */
    static void dfs_IfConnected(int v, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> ll=new ArrayList<Integer>();
        boolean [] visited=new boolean[v];  // v is size of Arraylist.
        
        dfs(adj,ll,0,visited);  //we can give s also 4,3 etc (which is present is graph.)

        System.out.println(ll);
    }
    static void dfs(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ll,int s, boolean[] visited)
    {
        visited[s]=true;
        ll.add(s);
         for(int u:adj.get(s))
         {
             if(visited[u]==false)
                dfs(adj,ll, u,visited);
         }
    }
    /* 
     *  if graph is disconnected.
     */
    static void DFS_Disconnected(int v, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> ll=new ArrayList<Integer>();
        boolean [] visited=new boolean[v];  // v is size of Arraylist.

        for(int i=0;i<v;i++)      //note hum i ko 2,3,5 se bhee chala sakte hai.
        {
            if(visited[i]==false){

                count ++; //to count the no. of disconnected in graph
                dfs(adj,ll,i,visited);
            }
        }
        System.out.println(ll);
    }
}
