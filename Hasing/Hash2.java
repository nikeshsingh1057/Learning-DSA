import java.util.HashMap;
import java.util.Map;

/* 
 *  count the frequency of the element in array.
 */

public class Hash2 {
    public static void main(String[] args) {
        
        Integer arr[] ={10,20,20,10,30,10};
        frequency(arr);

    }
    static void frequency(Integer[] arr)
    {
        HashMap<Integer,Integer>  h=new HashMap<>();

        for(int x: arr)
        h.put(x,h.getOrDefault(x, 0)+1);

        for(Map.Entry<Integer,Integer> e: h.entrySet())
            System.out.println(e.getKey()+ " " +e.getValue());
    }
}
