import java.util.*;
/* 
 *  check peek() PeekLast() , add() addLast() etc.
 */
public class test {
    public static void main(String[] args) {
        
        Deque<Integer> d=new LinkedList<Integer>();

        d.add(45);
        d.add(34);
        d.addFirst(67);
        d.addLast(322);
        System.out.println(d.peek());
        System.out.println(d.peekLast());
        System.out.println(d.peekFirst());
        System.out.println(d);
    }
}
