// Longest K unique characters substring
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

// 2nd method

class Solution {
    public int longestkSubstr(String s, int k) {
        
        HashMap<Character,Integer> hs=new HashMap<>();
        
        int i=-1;
        int j=-1;
        int ans=-1;
        
        while(true){
            
            boolean f1=false;
            boolean f2=false;
            
            while(i<s.length()-1){
                f1=true;
                
                i++;
                char ch=s.charAt(i);
                hs.put(ch,hs.getOrDefault(ch,0)+1);
                if(hs.size()<k)
                    continue;
                else if(hs.size()==k)
                    ans=Math.max(ans,i-j);
                else
                    break;
            }
            while(j<i){
                f2=true;
                
                j++;
                char ch=s.charAt(j);
                if(hs.get(ch)>1)
                    hs.put(ch,hs.getOrDefault(ch,0)-1);
                else if(hs.get(ch)==1)
                    hs.remove(ch);
                if(hs.size()==k)
                    break;
                
            }
            if(f1==false && f2==false)
                break;
        }
        return ans;
    }
}
