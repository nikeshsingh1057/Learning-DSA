import java.util.Arrays;
/* 
 *  Heap sort in Java.  (heap sort is based on Buidl Max Heap.)
 */
public class HeapSort {

    static void MaxHeapify(int arr[], int i, int size) {

        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i; 

        if (left < size && arr[left] > arr[largest])
            largest = left;

        if (right < size && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            // swap karange
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            MaxHeapify(arr, largest, size);
        }
    }

    static void Build_max_heap(int arr[], int n) {
        for (int i = (n - 2) / 2; i >= 0; i--)
            MaxHeapify(arr, i, n);
    }
    /* 
     *  function for heap sort.
     */
    static void heapSort(int arr[],int n)
    {
        Build_max_heap(arr, n);  // first passing array to Build Max heap( which creat max heap tree)
        
        for(int i=n-1;i>=1;i--)
        {
             // we swap element here 
                int temp=arr[i];
                arr[i]=arr[0];
                arr[0]=temp;

                MaxHeapify(arr,0,i);  /* after swaping with 0 index element we call maxHeapify */
                //note yaha par size i ko pass karna hai.
        }
    }
    // function to display sorted array.
    static void display(int arr[])
    {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int arr[]={10,15,50,4,20};
        int n=arr.length;

        heapSort(arr, n);
        display(arr);
    }
}
