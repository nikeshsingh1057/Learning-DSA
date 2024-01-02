// Count Subarrays Where Max Element Appears at Least K Times
// https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/

class Solution {   // seen
    public long countSubarrays(int[] nums, int k) {
        
        int maxi=0,count=0;
        
        for(int i=0;i<nums.length;i++)
            maxi=Math.max(maxi,nums[i]);
        
        long ans=0;
        
        for(int i=0,j=0;i<nums.length;i++)
        {
            if(nums[i]==maxi)
                count++;
            
            while(count>=k){
                
                ans=ans+ (nums.length-i);   // ulta substract karenge.
                
                if(nums[j]==maxi)
                    count--;
                j++;
            }
        }
        return ans;
    }
}
