/* 
 *  stack impelementation by using linkLIst.
 */
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class MyStack3
{
    Node head;
    int size;

    MyStack3()
    {
        head=null;
        size=0;
    }
    int size()
    {
        return size;
    }
    boolean isEmpty()
    {
        return (head==null);
    }
    void push(int x)
    {
        Node temp=new Node(x); /* adding element in linkList in begning */
        temp.next=head;
        head=temp;

        size++;
    }
    int pop()
    {
        if(head==null) return Integer.MAX_VALUE;

        int res=head.data;
        head=head.next;
        size--;
        return res;
    }
    int peak()
    {
        if(head==null)
        return Integer.MAX_VALUE;

        return head.data;
    }
}
public class stack3 {
    public static void main(String[] args) {
        
      MyStack3 st=new MyStack3();

        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop());
        System.out.println(st.size());

    }
   
}
