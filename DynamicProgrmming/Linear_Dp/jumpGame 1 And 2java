// jump game 1       https://leetcode.com/problems/jump-game/ 55

class Solution {  // recursion solution use 1d dp 
    public boolean canJump(int[] arr) {
        
        return solve(arr,0);
    }
    public boolean solve(int[] arr,int idx){
        
        if(idx>=arr.length-1)
            return true;

        boolean a=false;
        for(int i=1;i<=arr[idx];i++){
            
            a=solve(arr,i+idx);
            if(a) return true;
        }
        return a;
    }
}
// greedy method.
class Solution {
    public boolean canJump(int[] arr) {
        
        for(int i=1;i<arr.length;i++){
            arr[i]=Math.max(arr[i]+i,arr[i-1]);
        }
       
        int i=0;
        int p=-1;
        System.out.print(Arrays.toString(arr));
        while(i<arr.length-1){

            i=arr[i];
            if(p==i)  // tle se bachne ke liye ye lagye hai. (agar dubra same same element aata hai then repeat kar gaya hence cycle loop me fas jayega so usko bachane ke liye hai.
                return false;
            p=i;
        }

        if(i>=arr.length-1)
            return true;
        return false;
    }
}


// jump game 2.
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
