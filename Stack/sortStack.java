import java.util.Stack;

/* 
 *  sort stack
 */
public class sortStack {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(41);
        s.push(6);
        s.push(32);
        s.push(2);
        s.push(41);
        s.push(0);

        sort(s);
    }
    static void sort(Stack<Integer> s)
    {
        Stack<Integer> st=new Stack<>();

        while(s.isEmpty()==false)
        {
            int ele=s.pop();

            if(st.isEmpty()){
            st.push(ele);
            continue;}

            if(ele<st.peek())
            {
                st.add(ele);
            }
            else{
                while(st.isEmpty()==false && ele>st.peek())
                {
                    s.push(st.peek());
                    st.pop();
                }
                st.push(ele);
            }
            
        }
        System.out.println(st);
    }

}
