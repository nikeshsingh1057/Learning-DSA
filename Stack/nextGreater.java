import java.util.Arrays;
import java.util.Stack;

/*
 *  next greater element.
 */
public class stack10 {
    public static void main(String[] args) {

        int[] arr = { 5, 15, 10, 8, 6, 12, 9, 18 };
        NextGreater(arr);
    }

    static void NextGreater(int[] arr) {

        Stack<Integer> s = new Stack<>();

        int great[] = new int[arr.length]; // to store next greater.
        great[arr.length - 1] = -1;
        s.add(arr[arr.length - 1]); /* adding last element */

        for (int i = arr.length - 2; i >= 0; i--) { //stack me element ulata store karayenge.
            while (s.empty() == false && s.peek() <= arr[i])
                s.pop();

            int ge = (s.empty()) ? -1 : s.peek();
            great[i] = ge;

            s.add(arr[i]);
        }
        System.out.println(Arrays.toString(great));
    }
}
