//Count pairs in array divisible by K
//https://www.geeksforgeeks.org/problems/count-pairs-in-array-divisible-by-k/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
// https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/   (leetcode).

// method 1st.

class Solution{
    public static long countKdivPairs(int arr[], int n, int k){
      
        long count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
      
        for(int item: arr){
          
            int rem = item % k;
            if(rem != 0){      //[24,24,24] k=24 jab iss type ka case aaye tab ke liye hai.
                count += map.getOrDefault((k-rem), 0);
            } else {
                count += map.getOrDefault(0, 0);
            }
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        
        return count;
    }
}

// method 2nd-------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public long countCompleteDayPairs(int[] arr) {
        int k=24;
        return cousGfg(arr,arr.length,k);
    }
    public static long cousGfg(int arr[], int n, int K)
    {
        
      int []freqq = new int[K];
      long ans = 0;
      for (int i = 0; i < n; i++)
      {
          int rem = arr[i] % K;
          ans += freqq[(K - rem)%K];    // yaha % K kiye hai because jab [24,24,24] case aayega then 24-0 =24 dega hence out of bond dega so to avoid it we do mod.
          freqq[rem]++;
      } 
      return ans;
  }
}
