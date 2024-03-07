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
	// bfs traveshal
	public boolean BFS(int src,int des){
	    
	    Queue<Integer> q=new LinkedList<>(); // isme vertices keep karenge (i.e neighbour)
	    HashSet<Integer> visited=new HashSet<>();
	    q.add(src);
	    
	    while(!q.isEmpty()){
	        
	        // 1.remove
	        int r=q.poll(); // removing current vertice form Queue
	        
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
	                q.add(nbrs);
	        }
	    }
	    return false; // path nahi mila (not able to reach).
	}

	// bft traveshal  --------------------------------------------------------------------------------------------
	public void bft(){
	    
	    Queue<Integer> q=new LinkedList<>(); 
	    HashSet<Integer> visited=new HashSet<>();
	    
	    for(int src:hs.keySet()){
	        
	        if(visited.contains(src)==true){
	            continue;
	        }
	        q.add(src);
	        while(!q.isEmpty()){

    	        int r=q.poll(); 
    	        if(visited.contains(r))   
    	            continue; 
    	            
    	        visited.add(r); 
    	        System.out.print(r+" ");
    	        for(int nbrs:hs.get(r).keySet()){
    	            if(!visited.contains(nbrs)) 
    	                q.add(nbrs);
    	        }
    	   }
    	}
    }
}

class Main{
    
    public static void main(String[] args){
        
        Graph_Implement g=new Graph_Implement(5);
        g.AddEdge(1,2,12);
        g.AddEdge(3,5,10);
        g.AddEdge(2,4,15);
        g.AddEdge(5,2,41);
        g.AddEdge(3,2,97);
        g.AddEdge(1,4,60);
        
        //g.display();  
        // System.out.println(g.BFS(1,4));
        g.bft();
    }
}
