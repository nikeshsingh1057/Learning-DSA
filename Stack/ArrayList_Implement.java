import java.util.ArrayList;

/*
 *  ArrayList based impelementation
 */
class MyStack2
{
    ArrayList<Integer> s =new ArrayList<>();

    void push(int x)
    {
        s.add(x);
    }
    int pop()
    {
        int res=s.get(s.size()-1);
        s.remove(s.size()-1);
        return res;
    }
    int peek()
    {
        return s.get(s.size()-1);
    }
    boolean isEmpty()
    {
        return s.isEmpty();
    }
    int size()
    {
        return s.size();
    }
}
public class stack2 {
    public static void main(String[] args) {

        MyStack2 st =new MyStack2();

        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop());
        System.out.println(st.size());
    }

}
