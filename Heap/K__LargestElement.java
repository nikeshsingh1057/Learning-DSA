import java.util.ArrayList;
import java.util.PriorityQueue;

/*  print k largest element.  
 *  method 1 using min heap
 *  method 2 using man heap.
 */
public class K__LargestElement
{
    public static void main(String[] args) {
        
        int arr[]={8,4,10,6,9};
        int k=3;

        System.out.println(KLargestElement(arr, k));
    }
    /* 
     *  i solved using min Heap. 
     */
    static ArrayList<Integer> KLargestElement(int[] arr, int k)
    {
        PriorityQueue<Integer> pq= new PriorityQueue<>();

        ArrayList<Integer> li=new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);

            if(pq.size()>k)
                pq.poll();
        }
        while(pq.isEmpty()==false)
        {
            li.add(pq.poll());
        }
        return li;
    }
}
