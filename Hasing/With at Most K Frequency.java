//Length of Longest Subarray With at Most K Frequency
//https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/

class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        int ans=Integer.MIN_VALUE;
        int i=0,j=0;
        
        while(i<arr.length){
            
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
                
                while(j<i && hs.get(arr[i])>k){
                
                    if(hs.get(arr[j])==1)
                        hs.remove(arr[j]);
                    
                    else
                        hs.put(arr[j],hs.get(arr[j])-1);
                    j++;
                }
            ans=Math.max(ans,i-j+1);
            i++;
        }
        
        return ans;
    }
}
