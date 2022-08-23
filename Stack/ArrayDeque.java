import java.util.ArrayDeque;

/*
 *  ArrayDeque impelementation
 */

public class stack4 {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq=new ArrayDeque<>();

        dq.push(30);
        dq.push(39);
        dq.push(78);

        System.out.println(dq.size());
        System.out.println(dq.isEmpty());
        System.out.println(dq.pop());     /* delete and return deleted value. */
        
    }
}
