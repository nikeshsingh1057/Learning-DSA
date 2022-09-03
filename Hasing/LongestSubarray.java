import java.util.*;

/* 
 *  Longest Subarray with sum .
 */
public class LongestSubarray {
    public static void main(String[] args) {

        int[] arr = { 8, 3, 1, 5, -6, 6, 2, 2 };
        int sum = 4;

        System.out.println(LOngesTSubarray(arr, sum));
    }

    static int LOngesTSubarray(int[] arr, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int currsum = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];

            if (currsum == sum) {
                result = i + 1;
            }

            if (map.containsKey(currsum) == false) /* to avoid reptation  */
                map.put(currsum, i);      /* jo pahale wala aaya hai usko store karna hai jo badd me aaya hai usko discard karna hai. */

            if (map.containsKey(currsum - sum)) {
                result = Math.max(result, i - map.get(currsum - sum));
            }

        }
        return result;
    }
}
