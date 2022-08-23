import java.util.Queue;
import java.util.LinkedList;

/*
 *  implementation of stack using Queue
 *  in this method use two queue.
 */
class stack {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    void push(int data) /* bigo of n t.c */
    {
        while (!q1.isEmpty()) {

            q2.add(q1.poll());
        }
        q1.add(data);    

        while (!q2.isEmpty()) {

            q1.add(q2.poll());
        }
    }

    int Pop() /* o(1) */
    {
        return q1.poll();
    }
    int Peek()
    {
        return q1.peek();
    }

}

class StackImplement1 {
    public static void main(String[] args) {

        stack s = new stack();
        s.push(45);
        s.push(65);
        s.push(85);
        
        System.out.println(s.Pop());
        System.out.println(s.Peek());
        System.out.println(s.Pop());
    }
}
