// Maximum Number of Jumps to Reach the Last Index
// https://leetcode.com/problems/maximum-number-of-jumps-to-reach-the-last-index/

// solution link
https://leetcode.com/problems/maximum-number-of-jumps-to-reach-the-last-index/discuss/3740079/Java-Recursive-Memoization-and-Tabulation-Approach-DP-Solution

class Solution {
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
}
