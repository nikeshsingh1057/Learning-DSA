import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/* 
 *  sortest path in an unweighted graph.
 *  same as BFS just make a distance array and count distance in it.
 */
public class sortestPath {
    
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {

        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {

        int v = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<>());

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);
    
        int dis[] =BFS(adj, v, 0);

        System.out.println(Arrays.toString(dis));
    }
    static int[]  BFS(ArrayList<ArrayList<Integer>> adj,int v,int s)
    {
        Queue<Integer> q=new LinkedList<>();

        boolean visited[] =new boolean[v]; // maintain visited element.
        int [] distance=new int[v];  // to add distance of node how far connected to source.

        distance[s]=0;
        q.add(s);
        visited[s]=true;
        while(q.isEmpty()==false)
        {
            int u=q.poll();
    
            for(int ele:adj.get(u))  // iterator ke trah work karega.
            {
                if(visited[ele]==false)
                {
                    distance[ele]=distance[u]+1;

                    visited[ele]=true;
                    q.add(ele);
                }
            }
        }
        return distance;
    }
}
