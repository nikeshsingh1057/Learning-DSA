// https://www.geeksforgeeks.org/problems/find-shortest-safe-route-in-a-matrix/1
// Find shortest safe route in a matrix

// without dp.
class Solution {
    int max=800000;
    boolean checkSideMine(int i,int j, int mat[][]){
        
        if(i-1>=0 && mat[i-1][j]==0) return false;   
        if(i+1<mat.length && mat[i+1][j]==0) return false;
        if(j+1<mat[0].length && mat[i][j+1]==0) return false;
        //if(j-1 >=0 && mat[i][j-1]==0)return false; redundent hai no need to check left becuase right move kar rahe hai hamesha.
        return true;
    }

   public int dfs(int i,int j,int mat[][]){
        
        if(i<0 || j<0 || i>=mat.length|| j>=mat[0].length||  mat[i][j]==-1 || mat[i][j]==0 )
            return max;
        
        if(checkSideMine(i,j,mat)==false)
            return max;
        
        if(j==mat[0].length-1) return 1; // column reach at end
        
        int orig=mat[i][j];  // current value orig me put kar diye
        
        mat[i][j]=-1;   // isko mark -1 kar diye so that dubara usi cell par nahi jaye(to avoid stack over flow)
        
         int right = 1+dfs(i,j+1,mat);
         int up = 1+dfs(i-1,j,mat);
         int down = 1+dfs(i+1,j,mat);
        
        mat[i][j]= orig; // backtrack karenge to original wala value add kar denge. because to check furter path
        int min = Math.min(right,Math.min(up,down));
        return min;
   }
    public  int findShortestPath(int[][] mat) {
        
        int n=mat.length;
        int min=max;
       
        for(int i=0;i<n;i++) // row par loop lagaye hai to that har eak row chcek ho sake
            min=Math.min(min,dfs(i,0,mat));
        return min==max?-1:min;
    }
}

// after memoziation or dp

class Solution {
    int max=800000;
    boolean checkSideMine(int i,int j, int mat[][]){
        
        if(i-1>=0 && mat[i-1][j]==0) return false;   
        if(i+1<mat.length && mat[i+1][j]==0) return false;
        if(j+1<mat[0].length && mat[i][j+1]==0) return false;
        //if(j-1 >=0 && mat[i][j-1]==0)return false; redundent hai no need to check left becuase right move kar rahe hai.
        return true;
    }

   public int dfs(int i,int j,int mat[][],int[][] dp){
        
        if(i<0 || j<0 || i>=mat.length|| j>=mat[0].length||  mat[i][j]==-1 || mat[i][j]==0 )
            return max;
        
        if(checkSideMine(i,j,mat)==false)
            return max;
        
        if(dp[i][j] !=-1)
            return dp[i][j];
        if(j==mat[0].length-1) return 1; // column reach at end
        
        int orig=mat[i][j];  // current value orig me put kar diye
        
        mat[i][j]=-1;   // isko mark -1 kar diye so that dubara usi cell par nahi jaye(to avoid stack over flow)
        
         int right = 1+dfs(i,j+1,mat,dp);
         int up = 1+dfs(i-1,j,mat,dp);
         int down = 1+dfs(i+1,j,mat,dp);
        
        mat[i][j]= orig; // backtrack karenge to original wala value add kar denge.
        int min = Math.min(right,Math.min(up,down));
        return  dp[i][j]= min;
   }
    public  int findShortestPath(int[][] mat) {
        
        int n=mat.length;
        int min=max;
        int dp[][]=new int[mat.length+1][mat[0].length+1];
        
        for(int a[]:dp)
            Arrays.fill(a,-1);
            
        for(int i=0;i<n;i++)
            min=Math.min(min,dfs(i,0,mat,dp));
        return min==max?-1:min;
    }
}
