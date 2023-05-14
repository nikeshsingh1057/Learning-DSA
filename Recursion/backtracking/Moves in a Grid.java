// question link ->> https://leetcode.com/problems/maximum-number-of-moves-in-a-grid/
// 2684. Maximum Number of Moves in a Grid
class Solution {
    static int max;
    public int maxMoves(int[][] grid) {
        
        max=-1;
        int ans=0;
        
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            
            move(grid,i,0,0,-1,vis);
            ans=Math.max(max,ans);
        }
        return ans;
    }
    public static void move(int [][] grid,int r,int c,int prev,int count,boolean[][] vis){
        
         if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || vis[r][c]==true ||  prev>=grid[r][c]){
                     
            max=Math.max(max,count);
            return;
         }
            vis[r][c]=true; // marking visited 
            prev=grid[r][c];  // storing previous value in prev.
        
            move(grid,r-1,c+1,prev,count+1,vis);
            move(grid,r,c+1,prev,count+1,vis);
            move(grid,r+1,c+1,prev,count+1,vis);
        }
    
}
