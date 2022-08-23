import java.util.LinkedList;
import java.util.Queue;

/*
 *  reverse Queue using recursion
 */
public class RecursiveReverse {
    public static void main(String[] args) {

        Queue<Integer> Q = new LinkedList<Integer>();
        Q.add(56);
        Q.add(86);
        Q.add(46);
        Q.add(36);
        System.out.println(Q); /* before reverse */
        ReverseQueue(Q);
        System.out.println(Q);  /* after reverse Queue */

    }
    static void ReverseQueue(Queue<Integer> Q)
    {
        if(Q.isEmpty()==true)
        return;

        int x=Q.poll();

        ReverseQueue(Q);   /* recursive call  */

        Q.add(x);          /* adding element again in same Queue */
    }
}
