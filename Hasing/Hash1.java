import java.util.Arrays;
import java.util.HashSet;

/*
 *  count distint element in array
 */
public class Hash1
{
    public static void main(String[] args) {
        Integer arr [] ={15,12,13,12,13,13,18};
        int count=countDistint(arr);
        System.out.println(count);
    }
    /* 
     *  method 1st
     */
    static int countDistint(int [] arr)
    {
        HashSet<Integer> s= new HashSet<>();

        for(int i=0;i<arr.length;i++)
        s.add(arr[i]);
 
        return s.size();
    }
    /*
     *  method 2 only two line code
     * to call this make Integer class array
     */
    static int countDistint(Integer arr[])
    {
        HashSet<Integer> h2=new HashSet<>(Arrays.asList(arr));
        return h2.size();
    }
}
