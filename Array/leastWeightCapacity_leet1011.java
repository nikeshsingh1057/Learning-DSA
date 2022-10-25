// Q. Capacity To Ship Packages Within D Days
// this question is based of bianry Search.

class Solution {
    static int leastWeightCapacity(int[] arr, int N, int D) {
    // we send randomly capacity to DayRequire function if it return day_need<=days than we get our answer.
        int total_weight=0;
        int max_weight=-1;
        
        for(int i=0;i<N;i++)
        {
            total_weight+=arr[i];
            max_weight=Math.max(max_weight,arr[i]);
        }
        // we use binary search to send random capacity to DayRequire function.
        int low=max_weight, high=total_weight;
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int d=DayRequire(mid,arr,N);  // jo function require day return karega.
            
            if(d>D)
                low=mid+1;
                
            else { 
                ans=mid;
                high=mid-1;
            }
                
        }
        return ans;
    }
    // function to calculate no. of days required if we give random capacity.
    public static int DayRequire(int capacity,int [] arr,int N)
    {
        int remaining_capacity=capacity;
        int day_need=1;  // we cannot take 0 because boat can ship minimum 1 item in one day.
        
        for(int i=0;i<N;i++)
        {
            if(arr[i]<=remaining_capacity)
                remaining_capacity-=arr[i];
                
            else {
                day_need++;
                remaining_capacity=capacity;
                remaining_capacity-=arr[i];   }
        }
        return day_need;
    }
};
