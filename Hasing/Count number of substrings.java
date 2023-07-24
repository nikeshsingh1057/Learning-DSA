// count all possible substrings that have exactly k distinct characters.
//https://practice.geeksforgeeks.org/problems/count-number-of-substrings4528/1   (gfg Question link).

// same question is present on leetcode  but in form of array element.
//https://leetcode.com/problems/subarrays-with-k-different-integers/  Leetcode_992

// method 1st using atmost k but this give tle on gfg plateform.
class Solution
{
    long substrCount (String S, int K) {
        
        return longestkSubstr(S,K)-longestkSubstr(S,K-1);
    }
    public long longestkSubstr(String s, int k) {
       
       HashMap<Character,Integer> hs=new HashMap<>();
       int j=0,i=0;
       long ans=0;
       for(i=0;i<s.length();i++){
           
           hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
           
           while(hs.size()>k){    
              
                if(hs.get(s.charAt(j))==1)    
                    hs.remove(s.charAt(j));
                else
                    hs.put(s.charAt(j) , hs.get(s.charAt(j))-1);
                j++;
                
            }
            ans+=i-j+1;
       }
       return ans;
    }
}
