// https://leetcode.com/problems/dungeon-game/
// Dungeon Game LeetCode_174

class Solution {
    public int calculateMinimumHP(int[][] arr) { // monu bhaiya.
        
        int dp[][]=new int[arr.length+1][arr[0].length+1];
        return solve(arr,0,0,dp);
    }
    public int solve(int[][] arr,int r,int c,int[][] dp){
        
        if(r==arr.length-1 && c==arr[0].length-1)
            return arr[r][c]>0 ? 1 : 1-arr[r][c];
        
        if(r>=arr.length || c>=arr[0].length)
            return Integer.MAX_VALUE;
        
        if(dp[r][c]!=0)
            return dp[r][c];
        
        int left=solve(arr,r,c+1,dp);
        int right=solve(arr,r+1,c,dp);
        
        int p=Math.min(left,right)-arr[r][c];
        
        return dp[r][c] = p>0 ? p: 1;
    }
}
