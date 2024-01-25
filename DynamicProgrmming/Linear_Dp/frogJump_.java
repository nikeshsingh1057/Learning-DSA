// https://www.codingninjas.com/studio/problems/frog-jump_3621012?leftPanelTabValue=DISCUSS

// method 1
int frogJump(int n, int [] heights)
{
    int  dp [] =new int [n];

    dp[0] = 0;
    dp[1] = abs(heights[0]-heights[1]);

    for(int i=2;i<n;i++){
        int a = abs(heights[i]-heights[i-1])+dp[i-1];
        int b = abs(heights[i]-heights[i-2])+dp[i-2];

        dp[i] = min(a,b);
    }

    return dp[n-1];
}


// method 2
/*
    Time Complexity: O(N)
    Space Complexity: O(N)

    where 'N' is the number of staris in the staircase.
*/


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

// method 3
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int heights[]) {
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return findMin(n-1, dp, heights);
    }

    private static int findMin(int n, int[] dp, int heights[]){
        if(dp[n] != -1){
            return dp[n];
        }

        if(n==0){
            return 0;
        }

        if(n==1){
            return Math.abs(heights[1] - heights[0]);
        }

        int minOne = findMin(n-1, dp, heights) + Math.abs(heights[n-1] - heights[n]);
        int minTwo = findMin(n-2, dp, heights) + Math.abs(heights[n-2] - heights[n]);

        return dp[n] = Math.min(minOne,minTwo);

    }

}
