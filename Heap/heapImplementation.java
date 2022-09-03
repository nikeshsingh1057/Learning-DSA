/* 
 *  heap implementation using array.
 */
class heap {

    int[] arr;
    int size;
    int capacity;

    heap(int c) {

        arr = new int[c];
        size = 0;
        capacity = c;
    }
    /*
     * function to insert element in heap
     */
    public void insertInHeap(int x)
    {
        if(size==capacity)
        {
            System.out.println("heap is full");
            return;
        }
        size++;
        arr[size-1]=x;
        
        for(int i=size-1; i!=0 && arr[parent(i)]>arr[i];)
        {
            int temp=arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)]=temp;

            i=parent(i); /* we do not do i-- because we have to check it with parent not previous element */
        }
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }
}

public class heapImplementation {
    public static void main(String[] args) {

        heap hp =new heap(5); /* object create kiye hai. */

        hp.insertInHeap(45);
        hp.insertInHeap(4);
        hp.insertInHeap(50);
        hp.insertInHeap(3);
        hp.insertInHeap(30);
        
        for(int i=0;i<hp.size;i++)
        {
            System.out.print(hp.arr[i]+ " ");
        }
    }
}
