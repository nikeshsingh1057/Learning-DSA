import java.util.Stack;

/* 
 *  converting to infix to postfix.
 */
public class infix {
    public static void main(String[] args) {

        String str = "a*b/(d+c)*e";
       System.out.println(ConverPOstfix(str));
    }

    static String ConverPOstfix(String str) {

        Stack<Character> s = new Stack<>();
        String ans = "";      /* temporary liye ans store karane ke liye */

        for (int i = 0; i < str.length(); i++) {
            
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                ans += str.charAt(i);

            else if (str.charAt(i) == '(')
                s.add(str.charAt(i));

            else if (str.charAt(i) == ')') {

                while (s.peek() != '(') {
                    ans += s.peek();
                    s.pop();
                }
                s.pop();
            }
            // else if(s.empty()==true) s.add(str.charAt(i));
            // else if(Precedence(str.charAt(i))>Precedence(s.peek()))
            // s.add(str.charAt(i));

            else  {
                while (s.empty() == false && Precedence(str.charAt(i)) <= Precedence(s.peek()))
                {
                    ans += s.peek();
                    s.pop();
                }
                s.add(str.charAt(i));
            }
        }
            
        /* pop all the remaining element from the stack */
        while(s.empty()==false)
        {
            ans+=s.peek();
            s.pop();
        }
        return ans;

    }

    static int Precedence(char ch) {
        if (ch == '^')
            return 3; /* precedence diye hai operator ka integer ke madhayam se */

        else if (ch == '*' || ch == '/')
            return 2;

        else if (ch == '+' || ch == '-')
            return 1;

        else return -1;
    }
}
