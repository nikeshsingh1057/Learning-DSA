// The K Weakest Rows in a Matrix leetcode_1337
// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/

// iss question me compartor se sort kiye hai.
/* note comparator se sort karne ke liye alag se class banana hota . lekin agar comparable se karte to same yani pair class me he usko 
   implement karna padta i.e uska sortin logic likhana padta */
     
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        
        pair[] arr=new pair[mat.length];
        
        for(int i=0;i<mat.length;i++){
            
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1)
                    count++;
            }
            arr[i]=new pair(i,count);
        }
        //System.out.print(Arrays.toString(arr));System.out.println();
        
        Arrays.sort(arr,new sort());// we can use lamda also. same hai bas class nahi bana hota hai usme.
        
        //System.out.print(Arrays.toString(arr));
        
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            
            ans[i]=arr[i].i;
        }
        return ans;
    }
}
class pair{

    int i, count;
    
    pair(int i,int count){
        this.i=i;
        this.count=count;
    }
    // ye printing ke kamm me aayega. override kiye hai.
    public String toString() {
		return this.i+"=>"+this.count;
	}
}
class sort implements Comparator<pair>{
    
    public  int compare(pair o1, pair o2) {
		return o1.count-o2.count;
	}
}
