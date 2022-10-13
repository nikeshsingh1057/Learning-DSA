// Write a function to find the longest common prefix string amongst an array of strings.
//leetcode
class Solution {
    public String longestCommonPrefix(String[] str) {
        
        if(str.length==1)
            return str[0]+"";
        
        String st=str[0];
        int max=Integer.MAX_VALUE;
        
        for(int i=1;i<str.length;i++)
        {
            if(str[i]=="")
                return "";
            
            String str2=str[i];
            int count=0;
            for(int j=0;j<st.length() && j<str2.length();j++)
            {
                if(st.charAt(j)!=str2.charAt(j))
                    break;
                else
                {
                    count++;
                }
            }
            max=Math.min(max,count);
        }
        
        String ans="";
        for(int i=0;i<max;i++)
           ans+=st.charAt(i);
        
        return ans;
    }
}
