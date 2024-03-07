// Note: ye function tabhi work karega jab Graph_Implement hua hoga ya usko import karwan padega chalane ke liye.
// see graph implementaion in repo

// question 1.
public boolean IsPath(int src,int des,HashSet<Integer>visited) {
		
		if(src==des)
			return true;
		
		visited.add(src);
		for(int nbrs:map.get(src).keySet()) {
			
			if(!visited.contains(nbrs)) {                  // jo visited ho gaya hai usko mark karne ke liye.
				boolean ans=IsPath(nbrs, des,visited);
				if(ans)
					return ans;
			}
		}
		return false;
	}

	// question 2nd -> print all path
	public void print_All_Path(int src,int des,HashSet<Integer> visited,String ans) {
		
		if(src==des) {
			System.out.println(ans+des);
			return;
		}
		visited.add(src);
		for(int nbrs:map.get(src).keySet()) {
			
			if(!visited.contains(nbrs)) {                  
				print_All_Path(nbrs,des,visited,ans+"->"+nbrs);
			}
		}
		visited.remove(src);
	}
