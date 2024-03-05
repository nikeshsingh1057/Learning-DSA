import java.util.*;

class Graph_Implement
{
	HashMap<Integer,HashMap<Integer,Integer>> hs; // it tell Node and vertices connected with how mnay cost 
	Graph_Implement(int v){   // passing number of vertices
	
	    hs=new HashMap<>();      // map ko Initialize kiye hai
	    for(int i=1;i<=v;i++)
	        hs.put(i,new HashMap<>());  // uske ke badd all vertices put kar diye hai (only veritces not neighbour)
	}
	public void AddEdge(int v1, int v2 ,int cost){
	    hs.get(v1).put(v2,cost);     // v1 ka neighbour connect kiye hai v2 se and edge ka cost bhee put kiye hai
	    hs.get(v2).put(v1,cost);    // since graph undirected ha hence both way connction hoga.
	}
	
	// is function se neighbour hai ya nahi v1 ka v2 se or vice versa
	public boolean ContainsEdge(int v1,int v2){
	    return hs.get(v1).containsKey(v2) && hs.get(v2).containsKey(v1); // note kisi eak se he ho jayega because graph undirected hai.
	}
	
	// vertices v1 exitst karta hai ya nahi graph me
	public boolean ContainVertices(int v1){
	    return hs.containsKey(v1);
	}
	// count number of edge in graph 
	public int NumberOfEdge(){
	    
	    int count=0;
	    for(int key:hs.keySet())
	        count += hs.size();
	    return count/2;          // count/2 since graph undirected hai hence do bar count ho jayega.
	}
	
	// remove edge i.e neighbour ko remove karna
	public void removeEdge(int v1,int v2){
	    
	    if(ContainsEdge(v1,v2)){
	        hs.get(v1).remove(v2);
	        hs.get(v2).remove(v1);    // since undirected hai hence dono traf se connection remove karna hoga.
	    }
	}
	
	// delete veritces v1
	public void removeVertices(int v1){   // v1 veritce ko graph se remove karna hai.
	    
	    for(int key:hs.get(v1).keySet()){ // note hum direct vertice delete nahi kar sakte hai humko pahele uske connected neighbour ko remove karna hoga.
	        if(ContainsEdge(key,v1)){
	            hs.get(key).remove(v1);
	        }
	    }
	    hs.remove(v1); // finally last  me v1 ko remove karenge.
	}
	
	// display graph
	public void display(){
	    
	    for(int key:hs.keySet()){
	        System.out.println(key+" "+hs.get(key));
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
        g.AddEdge(3,4,60);
        
        g.display();  
        System.out.println("----------------------");
        g.removeVertices(4);
        g.display(); 
        System.out.println(g.NumberOfEdge());
        
    }
}

/*     output

1 {2=12}
2 {1=12, 3=97, 4=15, 5=41}
3 {2=97, 4=60, 5=10}
4 {2=15, 3=60}
5 {2=41, 3=10}
----------------------
1 {2=12}
2 {1=12, 3=97, 5=41}
3 {2=97, 5=10}
5 {2=41, 3=10}
8

*/
