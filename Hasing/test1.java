/*
 *  checking working of hashset
 */
import java.util.*;
public class test1 {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("gfg");
        h.add("courses");
        h.add("ide");
        h.add("gfg");   /* it will not add dublicate */

        System.out.println(h);
        System.out.println(h.contains("ide"));

        Iterator<String> i= h.iterator();
        while(i.hasNext())
        System.out.println(i.next());
    }
}
/* add() function -- this function use add element in hashset this will return ture if element is not
 *  present but in case element present this will return false and element will not add in has table.
 */
/* travesing printing will be in any order */
