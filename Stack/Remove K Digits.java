// 402. Remove K Digits
// https://leetcode.com/problems/remove-k-digits/

class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character> st=new Stack<>();
        int i;
        
        for(i=0;i<num.length();i++){
            
            while(!st.isEmpty() && st.peek()>num.charAt(i) && k>0){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        
        while(!st.isEmpty() && k>0){
                st.pop();
                k--;
        }
        
        String str="";
        while(!st.isEmpty()){
            str+=st.pop();
        }
        
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        
        str = sb+"";
        for(i=0;i<str.length();i++){     // removing leading i.e if num is 100000300 and k=1 
            if(str.charAt(i)!='0')
                break;
        }
        str=str.substring(i);
        
        if(str.length()==0)
            return "0";
        
        return str;
    }
}
