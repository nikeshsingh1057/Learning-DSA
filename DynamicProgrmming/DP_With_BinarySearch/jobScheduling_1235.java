//1235. Maximum Profit in Job Scheduling
//https://leetcode.com/problems/maximum-profit-in-job-scheduling/

class Solution { // seen
    
    public int jobScheduling(int[] s, int[] e, int[] p) {
        
        int arr[][]=new int[s.length][3];
        for(int i=0;i<s.length;i++){
            
            arr[i][0]=s[i];
            arr[i][1]=e[i];
            arr[i][2]=p[i];
        }
        
        Arrays.sort(arr,(a,b)->{
            return a[0]-b[0];
        });
        
        // for(int i=0;i<arr.length;i++)
        //     System.out.print(arr[i][0]+" "+arr[i][1]+" "+arr[i][2]+", ");
        int dp[]=new int[s.length+1];
        
        return solve(arr,0,dp);
    }
    public static int solve(int [][] arr,int i,int dp[]){
        
        if(i>=arr.length)
            return 0;
        
        if(dp[i]!=0)
            return dp[i];
        
        int a=0,b=0;
    
        int next= BinarySearch(arr,i+1,arr[i][1]); 
        
        a += arr[i][2]+solve(arr,next,dp);     // pick
        b =  solve(arr,i+1,dp);  // not pick
        
        return dp[i] = Math.max(a,b);
    }
    
    // binary search laga ke next possible job select karnege 
    // because array sorted hai so binary search lag jayega.
    
    public static int BinarySearch(int [][] arr,int low,int target){
        
        int high=arr.length-1;
        int result= Integer.MAX_VALUE;
        
        while(low<=high){
            
            int mid=low + (high-low)/2;
            
            if(arr[mid][0]>=target){
                
                result = mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return result;
    }
}
