import java.util.*;
/* 
 *  print the Celing on left side of input array.
 */
public class CelingInLeftSide {
    public static void main(String[] args) {
        
        int arr[] ={2,8,30,15,25,12,30};

        celing_Of(arr);
    }
    static void celing_Of(int [] arr)
    {
        TreeSet<Integer> t=new TreeSet<>();

        t.add(arr[0]);  /* first wala ko add kar lenge. our iska celing outside print karenge. */
        System.out.print(null+ " "); /* because first ka hamesa celing null reghaga. */
        for(int i=1;i<arr.length;i++)
        {
            System.out.print(t.ceiling(arr[i])+ " ");

            t.add(arr[i]);
        }
    }
}
