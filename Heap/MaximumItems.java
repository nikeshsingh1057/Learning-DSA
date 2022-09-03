import java.util.*;
/* 
 *  Buy maimum items with given sum (geeks for geeks).
 *  method 1 using sorting
 *  method 2 using Min Heap.
 */
public class MaximumItems {
    public static void main(String[] args) {
        
        int [] cost={1, 12, 5, 111, 200, 1000, 10};
        int sum=50;

        System.out.println(toyCount(cost,sum));
    }
    static int toyCount(int [] cost,int sum)
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int res=0;

        for(int i=0;i<cost.length;i++)
            pq.add(cost[i]);

        while(pq.peek()<=sum)
        {
            sum=sum-pq.poll();
            res++;
        }
        return res;
    }
}
