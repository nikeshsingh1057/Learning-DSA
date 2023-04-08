//Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

class Solution {
    public int longestValidParentheses(String str) {
        
        Stack<Integer> st=new Stack<>();
        
         //We push -1 so that if the whole str is ans then we will get ans by 'i - st.peek()' e.g: '(())' = 3 - (-1) = 3 + 1 = 4
        st.push(-1);
        int max=0;
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='('){ //If it's an opening bracket then push  index i in the stack
                
                st.push(i);
            }
            
            else{
                
                st.pop();
                //If the stack is empty, push the current index as a base for the next valid substring.
                if(st.isEmpty())
                    st.push(i);
                
                else{
    //If the stack is not empty, then find the length of current valid substring by taking the difference between the current index and top of the stack.                
                    max=Math.max(max,i-st.peek());
                }
            }
        }
        return max;
    }
}
//https://leetcode.com/problems/longest-valid-parentheses/
