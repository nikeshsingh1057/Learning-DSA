// Check If Word Is Valid After Substitutions 
// logic  of this question is we try to make string empty by removing "abc" from string if string become empty than it is true.
// method 1 without stack.
class Solution {
    public boolean isValid(String s) {
    
        while(true){
            if(s.contains("abc")){ 
                s=s.replace("abc","");
            }
            else break;
        }
        if(s.length()==0)
            return true;
        return false;
    }
}

// method 2 using stack.

class Solution {
    public boolean isValid(String s) {
        
        // try to make string empty.
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='c'){      // removing abc 
                
                char c1;
                char c2;
                if(!st.isEmpty() && st.size()>1){
                    
                    c1=st.pop();       // for storing b
                    c2=st.pop();       // for stroing a
                    
                    if(c1=='b' && c2=='a')    // if get abc than continue.
                        continue;
                    
                    else{                     // if not than we put as it all character in stack.
                        st.push(c2);
                        st.push(c1);
                        st.push('c');
                    }
                }
            }
            st.push(s.charAt(i));
        }
        if(st.size()==0)
            return true;
        return false;
    }
}
