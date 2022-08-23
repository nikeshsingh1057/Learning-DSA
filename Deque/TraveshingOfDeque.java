import java.util.*;
/*
 *  Travesing of Deque
 */
public class Travesing {
    public static void main(String[] args) {
        
        Deque<Integer> d=new LinkedList<Integer>();
        d.addFirst(56);
        d.addLast(45);
        d.addFirst(89);
        d.addLast(34);

        Iterator it=d.iterator(); /* use to iterate */

        while(it.hasNext())
        System.out.print(it.next()+ " ");
        System.out.println();

        /* using simple for each loop */
        for(int x: d)
        System.out.print(x+ " ");

    }
}
