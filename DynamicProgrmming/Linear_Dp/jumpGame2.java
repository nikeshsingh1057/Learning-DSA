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

// method 2 using greedy 1

class Solution {

    public int jump(int[] arr) {
        
        for(int i=1;i<arr.length;i++){
            arr[i]=Math.max(arr[i]+i,arr[i-1]);
        }
        int i=0;
        int jump=0;

        while(i<arr.length-1){

            i=arr[i];
            jump++;
        }
        return jump;
    }
}

// method 2nd using greedy 2 _paraksh sukla method(youtube).

class Solution {    

    public int jump(int[] nums) {
         
        int l, r, res;
        l = r = res = 0;
         
        while(r < nums.length-1){

            int farthest = 0;

            for(int i=l; i<=r; i++)
                farthest = Math.max(farthest, i+nums[i]);
             
            l = r+1;
            r = farthest;
            res++;
        }
        return res;
    }
}
