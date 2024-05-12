// https://leetcode.com/problems/taking-maximum-energy-from-the-mystic-dungeon/
// 3147. Taking Maximum Energy From the Mystic Dungeon ,(leetcode contest 12 may 2024)

class Solution { // seen
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int maxEnergy = Integer.MIN_VALUE;
        int[] memo = new int[n + 1];
        //turn all elements to -1
        Arrays.fill(memo, -1);
        for(int i = 0; i < n; i++) {
            //check for the every index and take out the max
            maxEnergy = Math.max(maxEnergy, solve(energy, k, i, memo));
        }
        return maxEnergy;
    }

    private int solve(int[] energy, int k, int idx, int[] memo) {
        //base case: If the index exceeds (len - 1) return 0
        if(idx >= energy.length) {
            return 0;
        }
        //If the sub problem has been already completed return it
        if(memo[idx] != -1) {
            return memo[idx];
        }
        //cache the answer for the current index and return it
        return memo[idx] = energy[idx] + solve(energy, k, idx + k, memo);
    }
}

// -----------------------------------------------------------

class Solution {
    public int maximumEnergy(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = nums[i];
            if (i + k < n) dp[i] += dp[i + k];
        }
        
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
