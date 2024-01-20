// method 1st using dp 

class Solution {  // dp seen.

     public int jump(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        int result=helper(0, nums.length - 1, nums, dp);
        return result;
        
    }
    

    public int helper(int index, int len, int nums[], int dp[]) {

        int result=Integer.MAX_VALUE/2;
       
        if(index>=len) 
            return 0;
        if(dp[index]!=-1)
            return dp[index];
            
        for (int i = 1; i <= nums[index]; i++) {
            
            int jump = 1 + helper(index + i, len, nums, dp);
            result=Math.min(result,jump);
            dp[index]=result;
         
        }
        return result;
    }
}
