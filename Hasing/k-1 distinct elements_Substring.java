// Substrings of length k with k-1 distinct elements
// https://practice.geeksforgeeks.org/problems/substrings-of-length-k-with-k-1-distinct-elements/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution {
    static int countOfSubstrings(String S, int K) {
        
        return solve(S,K);
    }
    public static int solve(String s,int k){
        
        int i=0;
        int j=0;
        int count=0;
        
        HashMap<Character,Integer> hs=new HashMap<>();
        
        while(i<s.length()){
            
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
            
            while(i-j+1>k){           // i-j+1 se length pata chalta jayega. (i.e K length mil jayega issase.)
                
                if(hs.get(s.charAt(j))==1)    
                    hs.remove(s.charAt(j));
                else
                    hs.put(s.charAt(j) , hs.get(s.charAt(j))-1);
                j++;
            }
            
            if((i-j+1)==k && hs.size()==(k-1))
                count++;
            i++;
        }
        
        return count;
    }
}
