// https://www.codingninjas.com/studio/problems/frog-jump_3621012?leftPanelTabValue=DISCUSS

// method 1
public class Solution {

	private static int rec(int i, int heights[], int dp[]) {

		if (i == heights.length - 1){
			// Reached the last stair.
			return 0;
		}
	
		if(dp[i] != -1){
			// Pre-computed value found.
			return dp[i];
		}
	
		// Two available choices.
		int oneJump = Integer.MAX_VALUE;
		int twoJump = Integer.MAX_VALUE;
	
		if (i + 1 < heights.length){
			oneJump = Math.abs(heights[i] - heights[i + 1]) + rec(i + 1, heights, dp);
		}
	
		if (i + 2 < heights.length){
			twoJump = Math.abs(heights[i] - heights[i + 2]) + rec(i + 2, heights, dp);
		}
	
		int ans = Math.min(oneJump, twoJump);
		dp[i] = ans;
		return ans;
	}

	public static int frogJump(int n, int heights[]) {
		int dp[] = new int[n+1];
		for (int i = 0; i <= n;i++){
			dp[i] = -1;
		}
		int ans = rec(0, heights,dp);
		return ans;
	}
}

// method 2
public class Solution {
    public static int frogJump(int n, int arr[]) {

        return solve(arr.length-1, arr, new int[n+1]);
    }
    static int solve(int ind,int[] height,int[] dp){
        
        if(ind==0) return 0;
    
        int jumpTwo = Integer.MAX_VALUE;
        int jumpOne= solve(ind-1, height,dp)+ Math.abs(height[ind]-height[ind-1]);
        if(ind>1)
            jumpTwo = solve(ind-2, height,dp)+ Math.abs(height[ind]-height[ind-2]);
        
        return Math.min(jumpOne, jumpTwo);
    }
}
