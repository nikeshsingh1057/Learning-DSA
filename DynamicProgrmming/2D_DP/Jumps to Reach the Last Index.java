// Maximum Number of Jumps to Reach the Last Index _ 2270
//https://leetcode.com/problems/maximum-number-of-jumps-to-reach-the-last-index/

class Solution { // own solved 45 minute take.
    
    // apply 2d dp int idx and prevIdx 
    public int maximumJumps(int[] arr, int target) {
        
        int dp[][]=new int[arr.length+1][arr.length+1];
        for(int a []:dp)
            Arrays.fill(a,-1);
        
        int ans=solve(arr,1,0,target,dp);
        
        if(ans<0) return -1;
        return ans+1;
    }
    public static int solve(int[] arr,int idx,int prevIdx,int t,int dp[][]){
        
        if(idx==arr.length-1){
            
            int d=arr[idx]-arr[prevIdx];// last me bhee check karnga hoga.
            if(-t<=d && d<=t)
                return 0;
            return Integer.MIN_VALUE;
        }
        
        if(dp[idx][prevIdx]!=-1) 
                return dp[idx][prevIdx];
        
        int diff = arr[idx]-arr[prevIdx];     // calculation difference to chcek range.
        
        int a= Integer.MIN_VALUE, b=-Integer.MIN_VALUE;
        
        if(-t<=diff && diff<=t)
            a = 1+ solve(arr,idx+1,idx,t,dp); // pick 
        b = solve(arr,idx+1,prevIdx,t,dp);  // unpick
        
        return dp[idx][prevIdx] = Math.max(a,b);
    }
}

// this can also be solved by 1d dp.
  public int maximumJumps(int[] nums, int target) {
        if(target == 0) return -1;
    
        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        int ans = solveMem(nums, target, 0 ,dp);
        return ans < 0 ? -1 : ans;
     }
    public int solveMem(int[] nums, int target, int index, int[] dp){
        if(index == nums.length - 1) return 0;
        if(dp[index] != -1) return dp[index];
        
        int ans = Integer.MIN_VALUE;
        for(int i = index + 1; i < nums.length; i++){
            if(nums[i] - nums[index] <= target && nums[i] - nums[index] >= -target)
                ans = Math.max(ans, 1 + solveMem(nums, target, i, dp));
        }
        return dp[index] = ans;
    }
