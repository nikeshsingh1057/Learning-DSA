import java.util.*;
/* 
 *  Subarray with zero sum
 */
public class Subarray0 {
    public static void main(String[] args) {
        
        int arr[]={3,4,7,0,8};
        System.out.println(subarrayZero(arr));
    }
    static boolean subarrayZero(int [] arr)
    {
        HashSet<Integer> h=new HashSet<>();

        int perfix_sum=0;

        for(int i=0;i<arr.length;i++)
        {
            perfix_sum+=arr[i];
            if(perfix_sum==0) return true;

            if(h.contains(perfix_sum))
            return true;

            //else
            h.add(perfix_sum);
        }
        return false;
    }
}
