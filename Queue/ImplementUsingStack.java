import java.util.*;
/*
 *  implementation of Queue using stack.
 *  we use two stack to implement queue.
 */
class Queue{

    Stack<Integer> s1=new Stack<Integer>();
    Stack<Integer> s2=new Stack<Integer>();

    void push(int data)      /* t.c o(1) */
    {
        s1.push(data);
    }
    int pop()  /* time complexity o(n) */
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }

        int resust= s2.pop();

        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        return resust;
    }

}
class QueueImpUsingStack
{
    public static void main(String[] args) {

        Queue q=new Queue();
        q.push(45);
        q.push(78);
        q.push(90);
        q.push(67);

        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}
