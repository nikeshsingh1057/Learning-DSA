import java.util.TreeSet;
/* 
 *  tree set in java ,note treeSet is self balance tree (red black tree)
 */
public class Tree_Set {
    public static void main(String[] args) {
        
        TreeSet<Integer> t=new TreeSet<>();
        t.add(5);
        t.add(15);
        t.add(50);
        t.add(55);
        t.add(78);
        System.out.println(t);
        t.remove(5);

        for(Integer x: t)   /* for each loop */
        System.out.print(x+ " ");
        System.out.println();

        System.out.println(t.first());
        System.out.println(t.floor(77));
        System.out.println(t.ceiling(56));
        System.out.println(t.higher(5));
        System.out.println(t.lower(90));
    }
}
