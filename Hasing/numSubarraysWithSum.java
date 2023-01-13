// 930. Binary Subarrays With Sum

class Solution {
    public int numSubarraysWithSum(int[] arr, int goal) {
        
        // 560. Subarray Sum Equals K  (same question )
        
        // 1st approch using Atmost k and AtMost k-1;
        // second arrroch using hashMap and sum equal k (see solution 560).
        return Atmost(arr,goal) - Atmost(arr,goal-1);
        
    }
    public static int Atmost(int arr[],int goal)
    {
        if(goal<0)
            return 0;
        
        int ans=0,sum=0,j=0;
        
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
            
            while(sum>goal)
            {
                if(arr[j]==1) //we can also remove it because arr contain 0, 1
                    sum -= arr[j];
                
                j++;
            }
            
            ans+=i-j+1;
            
        }
        return ans;
    }
}
