import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Of_ArrayList{
    public static void main(String[] args) {

        ArrayList<Integer> [] arr=new ArrayList[4];        // array of List
        // isme size dena zaruri hota hai.
        // isme hum array ke index par arraylist dalte hai jaise array me index se element fill karte hai.
        // ye eak array he hai bas hum isme arraylist store array ke indexes par.
        arr[0]=new  ArrayList<>();
        arr[1]=new  ArrayList<>();
        arr[2]=new  ArrayList<>();
        arr[3]=new  ArrayList<>();

        arr[0].add(4);
        arr[0].add(14);
        arr[0].add(4);

        arr[1].add(134);
        arr[1].add(334);

        arr[3].add(7);
        arr[3].add(21);

        System.out.println(Arrays.toString(arr)); // [[4, 14, 4], [134, 334], [], [7, 21]]
    }
}
