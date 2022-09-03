import java.util.*;
/* 
 *  Priority Queue in java
 */
public class Priority_Queue1 {
    public static void main(String[] args) {
        
       // by default it is min Heap internally.
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       pq.add(10);
       pq.add(20);
       pq.add(15);

       System.out.println(pq.peek());
       System.out.println(pq.poll());
       System.out.println(pq.peek());
    }
}
