// https://leetcode.com/problems/number-of-closed-islands/

class Solution {
    public int closedIsland(int[][] grid) {
       
/*step 1.
using DFS.
first isme hum boundary se connected sare 0 ko 1 bana denge because boundary se connected 0 aur uske sare linked 0 kabhi bhee 1 se nahi gira ho sakta hai.

step 2.
now ab sare matrix par travesh karenge and using dfs 0 ko 1 bana denge.
we check remaining zero if it is 0 then we mark it linked 0 to 1 so we remove dublicacy 
and increment answer by one.*/
        
        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j<grid[0].length;j++){
                
                if(i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1) //traveshing on boundary only
                    DFS(i,j,grid);
            }
        }
        int ans=0;
        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]==0){
                    
                    ans++;
                    DFS(i,j,grid);
                }
            }
        }
        return ans;            
    
    }
    public static void DFS(int i,int j,int [][] grid){
        
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==1)
            return;
        
        grid[i][j]=1; // isko 1 bana diye taki sare 0 se connected link 1 ho jaye.
            
        DFS(i-1,j,grid);
        DFS(i+1,j,grid);
        DFS(i,j-1,grid);
        DFS(i,j+1,grid);
    }
}
