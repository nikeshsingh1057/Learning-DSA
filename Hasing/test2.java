import java.util.*;
public class test2 {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("gfg");
        h.add("courses");
        h.add("ide");

        System.out.println(h.remove("ide"));

        System.out.println(h.size());

        for(String s : h)
        System.out.println(s+" ");
    }
}
