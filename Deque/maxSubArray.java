import java.util.*;
public class maxSubArr {
    public static void main(String[] args) {
        
        int arr[] ={100,30,21,32,200,89,78};
        int k=3;
        PrintKmax(arr,k);

    }
    static void PrintKmax(int[] arr,int k)
    {
        Deque<Integer> d=new LinkedList<>();
        for(int i=0;i<k;i++)
        {
            while(!d.isEmpty() && arr[i]>=arr[d.peekLast()])   /* for first k element */
            d.removeLast();
            d.add(i);
        }
        for(int i=k;i<arr.length;i++)
        {
            System.out.print(arr[d.peekFirst()]+ " ");

            while(!d.isEmpty() && d.peek()<=i-k) /* to remove the item whose work is done  */
            d.removeLast();

            while(!d.isEmpty() && arr[i]>=arr[d.peekLast()])   /* for first k element */
            d.removeLast();
            d.add(i);
        }
        System.out.print(arr[d.peek()]); /* to extract last element form deque. */
    }
}
