import java.util.LinkedList;
import java.util.Queue;
/*
 *  generation number using 5 and 6.
 */
public class Number5_6 {
    public static void main(String[] args) {
        
        Queue<String> Q=new LinkedList<>();

        Q.add("5");  
        Q.add("6");

        int n=1000000;  
        for(int i=0;i<n;i++)
        {
            String cur=Q.poll();
            System.out.print(cur+" ");

            Q.add(cur+"5");
            Q.add(cur+"6");
        }
    }
}
