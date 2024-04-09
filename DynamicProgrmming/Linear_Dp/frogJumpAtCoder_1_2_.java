// https://www.codingninjas.com/studio/problems/frog-jump_3621012?leftPanelTabValue=DISCUSS

// method 1
public class Solution {

	private static int rec(int i, int heights[], int dp[]) {

		if (i == heights.length - 1)
			return 0;
		if(dp[i] != -1)
			return dp[i];
		
		// Two available choices.
		int oneJump = Integer.MAX_VALUE;
		int twoJump = Integer.MAX_VALUE;
	
		if (i + 1 < heights.length)
			oneJump = Math.abs(heights[i] - heights[i + 1]) + rec(i + 1, heights, dp);
		if (i + 2 < heights.length)
			twoJump = Math.abs(heights[i] - heights[i + 2]) + rec(i + 2, heights, dp);
		int ans = Math.min(oneJump, twoJump);
		dp[i] = ans;
		return ans;
	}
	public static int frogJump(int n, int heights[]) {
		int dp[] = new int[n+1];
		for (int i = 0; i <= n;i++)
			dp[i] = -1;
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

// method 3rd using for loop (valid for any kth jump)  i.e atcoder ka 2nd frog jump 2 (kth jump ka code).                 
// https://www.naukri.com/code360/problems/minimal-cost_8180930?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
import java.util.* ;
public class Solution {
    public static int frogJump(int n, int heights[]) {

        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(heights,0,2,dp);
	}

    public static int solve(int [] arr,int n,int k,int dp[]){

        if(n==arr.length-1)
            return 0;

        if(dp[n]!=-1) return dp[n];
        int a=8000000;

        for(int i=1;i<=k;i++){

            if(n+i<arr.length)
            	a=Math.min(a, Math.abs(arr[n]-arr[n+i])+ solve(arr,n+i,k,dp) );
        }
        return dp[n]=a;
    }
}

// same above code in opposite way
import java.util.* ;
public class Solution {
    public static int frogJump(int n, int heights[]) {

        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
	int k=2;                       // kth jump ke liye
        return solve(heights,n-1,k,dp);
	}

    public static int solve(int [] arr,int n,int k,int dp[]){
        if(n==0)
            return 0;
        if(dp[n]!=-1) return dp[n];
        int a=8000000;

        for(int i=1;i<=k;i++){
            if(n-i>=0)
            a=Math.min(a,Math.abs(arr[n]-arr[n-i])+solve(arr,n-i,k,dp));
        }
        return dp[n]=a;
    }
}
