// Partition Array for Maximum Sum
// https://leetcode.com/problems/partition-array-for-maximum-sum/description/?envType=list&envId=rfrf1ewe

class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        Integer[] memo = new Integer[arr.length];
        return maxSumAfterPartitionin(arr, k, 0, memo);
    }

    private int maxSumAfterPartitionin(int[] arr, int k, int i, Integer[] memo) {
        if (i == arr.length) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }

        int currMax = 0;
        int sumMax = 0;
        for (int j = 0; j < k; j++) {

            int to = i + j;
            if (to < arr.length) {
                
                currMax = Math.max(currMax, arr[to]);
                sumMax = Math.max(sumMax, (currMax * (j + 1)) + maxSumAfterPartitionin(arr, k, to + 1, memo));
            }
        }
        return memo[i] = sumMax;
    }
}

// method 2  same hai bas for loop me changining hai patrtaion ke liye.

class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        Integer[] memo = new Integer[arr.length];
        return maxSumAfterPartitionin(arr, k, 0, memo);
    }

    private int maxSumAfterPartitionin(int[] arr, int k, int i, Integer[] memo) {
        if (i == arr.length) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }

        int currMax = 0;
        int sumMax = 0;
        for (int j = i; j < arr.length && j-i+1<=k; j++) { // j-i karne se j=0 se ho jayega. since j=i hai and so j=j ho gaya hence j-j=0 isly j-i kiye hai.
            currMax = Math.max(currMax, arr[j]);
            sumMax = Math.max(sumMax, (currMax * ( j-i + 1)) + maxSumAfterPartitionin(arr, k, j + 1, memo));
            
        }
        return memo[i] = sumMax;
    }
}
