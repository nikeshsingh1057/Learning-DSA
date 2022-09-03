import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/* 
 *  find the K closest element with given number of k leet code 658.
 *  smg nahi aaya hai abhi.(code dekh kar likh liye hai.)
 */
public class K_closestElement {

    static class Mypair implements Comparable<Mypair>
    {
        int diff;
        int index;
        Mypair(int diff,int index)
        {
            this.diff=diff;
            this.index=index;
        }
        //@Override
        public int compareTo(Mypair o) {
            
                return this.diff-o.diff;
        }

    }
    public static void main(String[] args) {
        
        int arr[]={20,40,5,100,150};

        int x=100; /* x ke closest kitna k number hai */
        int k=3;

        System.out.println(KclosestNumber(arr,x,k));
    }

    static ArrayList<Integer> KclosestNumber(int[] arr, int x, int k)
    {
        PriorityQueue<Mypair> pq=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> LL=new ArrayList<>();

        for(int i=0;i<k;i++)
            pq.add(new Mypair(Math.abs(arr[i]-x), i));
        
        for(int i=k;i<arr.length;i++)
        {
            int diff=Math.abs(arr[i]-x);

            if(pq.peek().diff>diff)
            {
                pq.poll();
                pq.add(new Mypair(diff,i));
            }
        }
        while(!pq.isEmpty())
            LL.add(arr[pq.poll().index]);
        
        Collections.sort(LL);
        return LL;
    }
}
