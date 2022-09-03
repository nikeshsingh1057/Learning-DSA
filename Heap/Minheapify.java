import java.util.Arrays;

/* 
 *  given a binary heap with one possible violatation fix the heap.
 */
public class Minheapify {
    public static void main(String[] args) {

        /* we have taken array because heap element is sotord inside an array enternaly.*/
      
        int arr[] = { 40, 20, 30, 35, 25, 80, 32, 100, 70, 60 };
        int i=0;  //index pass kiye hai.;
        minHeapify(arr,i);

        System.out.println(Arrays.toString(arr));
    }

     static void minHeapify(int arr[],int i) {
        
        // recursive solution

        int lt=left(i);     // to check left element 
        int rt=right(i);     // to chek right element 
        int smallest=i;
        if(lt<arr.length && arr[lt]<arr[smallest])
            smallest=lt;

        if(rt<arr.length && arr[rt]<arr[smallest])
            smallest=rt;

        if(smallest!=i)
        {
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            
            minHeapify(arr,smallest);
        }

        // iterative solution

        /*int smallest;
        while(true)
        {
            int lt=left(i);     
            int rt=right(i);    
            smallest=i;

            if(lt<arr.length && arr[lt]<arr[i])
            smallest=lt;

            if(rt<arr.length && arr[rt]<arr[smallest])
            smallest=rt;

             if(smallest!=i)
            {
                  int temp = arr[smallest];
                  arr[smallest] = arr[i];
                  arr[i] = temp;
            
                  i=smallest;
             }
            else if(smallest==i) break;
        }*/
    }
    
    static int left(int i)
    {
        return 2*i+1;
    }
    static int right(int i)
    {
        return 2*i+2;
    }

}
