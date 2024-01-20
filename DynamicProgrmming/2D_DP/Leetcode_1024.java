// https://leetcode.com/problems/video-stitching/
//  Video Stitching_1024.
// this can also be solved using greedy.

class Solution {  

    public int videoStitching(int[][] arr, int time) {
        
        Arrays.sort(arr,(a,b)->a[0]==b[0] ? a[1]-b[1] : a[0]-b[0] );
        int mini = (int)1e9;

        int dp[][]=new int[arr.length+1][arr.length+1];
        for(int a[]:dp)
            Arrays.fill(a,-1);

        for(int i =0; i <arr.length ;i++){

            if(arr[i][0]==0)
                mini =  Math.min(mini, 1 + solve(i + 1, i, arr, time, dp));
        }
        if(mini==1e9)
            return -1;

        return mini;
    }
    public static int solve(int i,int prev,int[][] arr,int time,int dp[][]){

        if(i==arr.length){

            if(arr[prev][1]>=time)
                return 0;
            return (int)1e9;
        }

        //if(arr[prev][1]>=time) return 0; // jav beech ke koi [0,t] mil jaye.
        if(dp[i][prev]!=-1) return dp[i][prev];

        int take=(int)1e9;

        if(arr[i][0]<=arr[prev][1])
            take = 1+solve(i + 1, i, arr, time, dp);
        
        int notTake= solve(i + 1, prev, arr, time, dp);

        return dp[i][prev]=Math.min(take,notTake);
    }
}

// method 2 using greedy_1 (prakash_sukla youtube.)----------------------------------------------------------------------------------

class Solution {

    public int videoStitching(int[][] arr, int time) {

        int leftMax=0;
        int rightMax=0;
        int count=0;

        while(rightMax<time){

            for(int i=0;i<arr.length;i++){

                int left=arr[i][0];
                int right=arr[i][1];

                if(left<=leftMax && right>rightMax){
                    rightMax=right;
                }
            }

            if(rightMax==leftMax)  // if  not update  then return false.
                return -1;

            leftMax=rightMax;
            count++;
        }
        return count;
    }
}
