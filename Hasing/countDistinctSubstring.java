// count Substring Without repeating substring.
// pepcoding ka question ka hai.
// gfg par question hai leking ye code glat output de raha hai.(https://practice.geeksforgeeks.org/problems/count-of-distinct-substrings/1 

// method 1st (pepcoding)

class pepcoding
{
   public static int countDistinctSubstring(String s)
   {
        int i=-1;
        int j=-1;
        
        HashMap<Character,Integer> hs=new HashMap<>();
        int ans=0;
        while(true){
            
            boolean f1=false;
            boolean f2=false;
            
            while(i<s.length()-1){
                f1=true;
                
                i++;
                char ch=s.charAt(i);
                hs.put(ch,hs.getOrDefault(ch,0)+1);
                
                if(hs.get(ch)==2)
                    break;
                else
                    ans+=i-j;
            }
            while(j<i){
                f2=true;
                j++;
                
                char ch=s.charAt(j);
                hs.put(ch,hs.get(ch)-1);
                
                if(hs.get(ch)==1){
                    ans+=i-j;
                    break;
                }
            }
            if(f1==false && f2==false)
                break;
        }
        return ans;
   }
}

// mehtod 2nd    (ye code longest unique substring ke liye bhee valid hai only ans=Maht.max(ans,i-j) kar do to.)
// upper wala and ye wala same output de raha leking gfg par glat de raha hai.
// https://practice.geeksforgeeks.org/problems/count-of-distinct-substrings/1  (ggf question link).
class Solution {
    public int uniqueLetterString(String s) {
        
        HashMap<Character,Integer> hs=new HashMap<>();
        int j=-1;
        int ans=0;
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            hs.put(ch,hs.getOrDefault(ch, 0)+1);
           
            while(hs.get(ch)>1){
                
                j++;
                hs.put(s.charAt(j),hs.getOrDefault(s.charAt(j), 0)-1);
            }
            ans+=i-j;
        }
        return ans;
    }
}
