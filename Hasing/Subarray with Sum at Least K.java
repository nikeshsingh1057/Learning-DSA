// Shortest Subarray with Sum at Least K
//https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/description/

class Solution {
    public int shortestSubarray(int[] arr, int k) {
        
        int ans=Integer.MAX_VALUE;
        Long sum=0l;

        TreeMap<Long,Integer> map=new TreeMap<>();

        for(int i=0;i<arr.length;i++){

            if(arr[i]>=k) return 1;

            sum += arr[i];
            if(sum>=k) 
                ans=Math.min(ans,i+1);
            Long rem=sum-k;

            Map.Entry<Long,Integer> entry = map.floorEntry(rem);
            while(entry!=null){

                int idx=entry.getValue();
                ans=Math.min(ans,i-idx);
                map.remove(entry.getKey());  // very imp line-> agar ussase index se answer mil gaya then remove kar do to avoid tle.
                entry=map.floorEntry(entry.getKey()-1);
            }
            map.put(sum,i);     // prefix sum ko key ke roop me dal rahe hai
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
