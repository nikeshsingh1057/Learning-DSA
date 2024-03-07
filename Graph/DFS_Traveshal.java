import java.util.*;

class Graph_Implement
{
	HashMap<Integer,HashMap<Integer,Integer>> hs; 
	Graph_Implement(int v){   
	
	    hs=new HashMap<>();      
	    for(int i=1;i<=v;i++)
	        hs.put(i,new HashMap<>()); 
	}
	public void AddEdge(int v1, int v2 ,int cost){
	    hs.get(v1).put(v2,cost);   
	    hs.get(v2).put(v1,cost);    
	}
	public void display(){
	    
	    for(int key:hs.keySet()){
	        System.out.println(key+" "+hs.get(key));
	    }
	}
	// dfs traveshal Iterative.
	public boolean DFS(int src,int des){
	    
	    Stack<Integer> st=new Stack<>(); // isme vertices keep karenge (i.e neighbour)
	    HashSet<Integer> visited=new HashSet<>();
	    st.push(src);
	    
	    while(!st.isEmpty()){
	        
	        // 1.remove
	        int r=st.pop(); // removing current vertice form Queue
	        
	        // 2.Ignore if Already visited
	        if(visited.contains(r)){    // graph me cycle iss ye pata chal gaya since same vertice directly visited me mil gaya.
	            continue; 
	        }
	        // 3. mark visited
	        visited.add(r); // visted mark karna.
	        
	        // 4. work perform
	        if(r==des) return true;
	        
	        // 5. adding neighbour in queue (current verices ka neighbour)
	        for(int nbrs:hs.get(r).keySet()){
	            
	            if(!visited.contains(nbrs)) 
	                st.push(nbrs);
	        }
	    }
	    return false; // path nahi mila (not able to reach).
	}
	
	// dfs traveshal recursive
	public boolean dfs_recursive(int src,int des,HashSet<Integer> visited){
	    
	    if(src==des) return true;
	    
	    visited.add(src);
	    for(int nbrs:hs.get(src).keySet()){
	        
	        if(!visited.contains(nbrs)){
	            boolean find=dfs_recursive(nbrs,des,visited);
	            if(find==true)
	                return true;
	        }
	    }
	    return false;
	}
	// for dft traveshal we can loop on visited array .
	// https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1   (see gfg question).
}

class Main{
    
    public static void main(String[] args){
        
        Graph_Implement g=new Graph_Implement(7);
        g.AddEdge(1,4,12);
        g.AddEdge(1,2,10);
        g.AddEdge(2,3,15);
        g.AddEdge(4,3,41);
        g.AddEdge(4,1,71);
        g.AddEdge(4,5,97);
        g.AddEdge(5,6,60);
        g.AddEdge(5,7,60);
        g.AddEdge(5,4,41);
        g.AddEdge(6,7,80);
        g.AddEdge(6,5,21);
        g.AddEdge(7,6,34);
        g.AddEdge(7,5,23);
        
        g.display();  
        System.out.println(g.DFS(1,7));
        System.out.println(g.dfs_recursive(1,7,new HashSet<>())); 
    }
}
