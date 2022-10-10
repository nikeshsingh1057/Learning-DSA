// leetcode 1328 break a palindrome 

class Solution {
    public String breakPalindrome(String s) {
        
       if(s.length()==1)
           return "";
        
        if(s.length()%2!=0)
            return oddStr(s);
        
        else 
            return evenStr(s);
        
    }
    public String oddStr(String s)
    {
        String str="";
        int f=1;           //flag value
        for(int i=0;i<s.length();i++)
        {
            if(i==s.length()/2)
            {
                str+=s.charAt(i);      //to avoid changing value of mid if length is odd.
                continue;
            }
            
            if(s.charAt(i)>'a' && f==1)
            {
                str+='a';              // only one change made in string.
                f=-1;
            }
            else if(i==s.length()-1 && f==1) //if flag value is not change until last length
                str+='b';
            
            else 
                str+=s.charAt(i);
        }
    
        return str;
    }
    
    public String evenStr(String s)
    {
        String str="";
        int f=1;
        
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)>'a' && f==1)
            {
                str+='a';
                f=-1;
            }
           else if(i==s.length()-1 && f==1)
                str+='b';
            
            else 
                str+=s.charAt(i);
        }
        return str;
    }
        
}
