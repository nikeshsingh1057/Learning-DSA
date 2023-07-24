// Longest K unique characters substring

class Solution {
    public int longestkSubstr(String s, int k) {
       
       HashMap<Character,Integer> hs=new HashMap<>();
       int j=0,i=0;
       int ans=-1;
       for(i=0;i<s.length();i++){
           
           hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
           
           while(hs.size()>k){    
                    
                if(hs.get(s.charAt(j))==1)    
                    hs.remove(s.charAt(j));
                else
                    hs.put(s.charAt(j) , hs.get(s.charAt(j))-1);
                j++;
            }
            if(hs.size()==k){
                ans=Math.max(ans,i-j+1);
            }
       }
       return ans;
    }
}
