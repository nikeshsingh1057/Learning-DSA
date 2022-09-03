import java.util.*;
import java.util.Map.Entry;
/* 
 *  treeMap in java (similar to hashMap)
 */
public class Tree_Map {
    public static void main(String[] args) {

        TreeMap<Integer,String> tm=new TreeMap<>();

        tm.put(5, "geeks");
        tm.put(10, "apple");
        tm.put(5, "ide");
        tm.put(16, "nikesh");

        System.out.println(tm);
        System.out.println(tm.containsKey(50));
        
        for(Entry<Integer, String> e:tm.entrySet())
            System.out.println(e.getKey()+ "  "+ e.getValue());

        // System.out.println();
        // System.out.println(tm.higherKey(5));
        // System.out.println(tm.lowerKey(50));

        System.out.println(tm.floorEntry(10));
        System.out.println(tm.ceilingEntry(16));
        System.out.println(tm.ceilingEntry(16).getValue()); /* 16 par konsa value hai vo bata dega. */
    }
}
