// Smallest Subsequence of Distinct Characters 1081
class Solution {
    public String smallestSubsequence(String s) {
        
        int frq[]=new int[26];
        boolean[] visited = new boolean[26];
        
        for(int i=0;i<s.length();i++)
            frq[s.charAt(i)-'a']++;
        
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            
            if(visited[ch-'a']==true){
                frq[ch-'a']--;
                continue;
            }
            
            while(!st.isEmpty() && st.peek()>=ch && frq[st.peek()-'a']>0){
               
                visited[st.pop()-'a']=false;
        
            }
            visited[ch-'a']=true;
            st.push(ch);
            frq[ch-'a']--;
        }
        
        String ans="";
        
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        StringBuilder sb=new StringBuilder(ans);
        
        return sb.reverse().toString();
    }
}
