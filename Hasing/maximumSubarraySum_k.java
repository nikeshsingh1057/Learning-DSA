// Maximum Sum of Distinct Subarrays With Length K
//https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k

class Solution {    // own
    
    public long maximumSubarraySum(int[] arr, int k) {
        
        int i=0, j=0;
        long sum=0;
        long ans=0;
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        while(i<arr.length){
            
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
            sum+=arr[i];
            
            while(i-j>=k || hs.get(arr[i])>=2){
                
                if(hs.get(arr[j])==1)
                    hs.remove(arr[j]);
                else
                    hs.put(arr[j],hs.get(arr[j])-1);
                
                sum-=arr[j];
                j++;
                
            }
            if(hs.size()==k)
                ans=Math.max(ans,sum);
            i++;
        }
        return ans;
    }
}
