//  Number of Enclaves
// https://leetcode.com/problems/number-of-enclaves/

class Solution {
    public int numEnclaves(int[][] grid) {
        
        for(int i=0;i<grid.length;i++)    
        {
            for(int j=0;j<grid[0].length;j++)    // note hume sirf border par travesh karna hai 
            {
                if((i==0 || j==0 || i==grid.length-1 || j==grid[i].length-1) && grid[i][j]==1)
                    dfs(i,j,grid);
            }
        }
        
        int count=0;  // after removing all neighbour connection of 1 we count remaning 1 from gird.
        
        for(int i=0;i<grid.length;i++)    
        {
            for(int j=0;j<grid[0].length;j++)    
            {
               if(grid[i][j]==1)
                   count++;
            }
        }
        return count;
    }
    public static void dfs(int cr,int cc,int [][] grid)
    {
        
        if(cr<0 || cc<0 || cr>=grid.length || cc>=grid[0].length || grid[cr][cc]==0)             {
				return;
        }
        
        grid[cr][cc]=0;  // we are making zero so its neighbour connection is break.
        
        dfs(cr-1,cc,grid); // moving up
        dfs(cr+1,cc,grid); // moving down
        dfs(cr,cc-1,grid); // moving left
        dfs(cr,cc+1,grid); // moving right
    }
        
}
