/* 
 *  HashMap in java
 */
import java.util.*;
public class test3 {
    public static void main(String[] args) {
        HashMap<String,Integer> m=new HashMap<>();

        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("course", 20);

        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.containsKey("ide"));
        m.remove("ide");
        System.out.println(m);

        System.out.println(m.containsValue(20));

    }
}
