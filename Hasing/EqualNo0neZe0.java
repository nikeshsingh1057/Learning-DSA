import java.util.*;
/* 
 *  Longest subarray with equal no. of zero and ones.
 */
public class EqualNo0neZe0 {
    public static void main(String[] args) {
        
        int arr[]={1,0,1,1,1,0,0};
        System.out.println(LargestSub(arr));
    }
    static int LargestSub(int[] arr)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;                        /* sum zero ko check karange ab.*/
        int currsum=0;
        int res=0;

        for(int i=0;i<arr.length;i++) /* sara zero ko minus one bana diye */
            if(arr[i]==0)
                arr[i]=-1;

        for(int i=0;i<arr.length;i++)
        {
            currsum+=arr[i];

            if(currsum==sum)
                res=i;

            if(map.containsKey(currsum)==false)
                map.put(currsum, i);

            if(map.containsKey(currsum-sum))
                res=Math.max(res, i-map.get(currsum-sum));
        }
        return res;
    }
}
