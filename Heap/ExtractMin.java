
/* 
 *  Extract min element form heap. (use concept of heapify.)
 */
import java.util.*;
import java.io.*;


class ExtractMin {

    public static class MinHeap {
        int arr[];
        int size;
        int capacity;

        MinHeap(int c) {
            size = 0;
            capacity = c;
            arr = new int[c];
        }

        int left(int i) {
            return (2 * i + 1);
        }

        int right(int i) {
            return (2 * i + 2);
        }

        int parent(int i) {
            return (i - 1) / 2;
        }

        public void insert(int x) {
            if (size == capacity)
                return;
            size++;
            
            arr[size - 1] = x;

            for (int i = size - 1; i != 0 && arr[parent(i)] > arr[i];) {
                int temp = arr[i];
                arr[i] = arr[parent(i)];
                arr[parent(i)] = temp;
                i = parent(i);
            }
        }
    /* 
     *  after deleting first ndoe now fixing smallest element at first node.
     */
        public void minHeapify(int i) {

            int lt = left(i);
            int rt = right(i);

            int smallest = i;

            if (lt < size && arr[lt] < arr[i])
                smallest = lt;

            if (rt < size && arr[rt] < arr[smallest])
                smallest = rt;

            if (smallest != i) {

                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;

                minHeapify(smallest);
            }
        
        }
        /* 
         *  function to get min heap element.
         */
        public int extractMin() {
            if (size <= 0)
                return Integer.MAX_VALUE;
            if (size == 1) {
                size--;
                return arr[0];
            }

            int temp = arr[0];
            arr[0] = arr[size - 1];
            arr[size - 1] = temp;
            size--;

            minHeapify(0);       /* calling function of heapify. */

            return arr[size];
        }

    }

    public static void main(String args[]) {
        MinHeap h = new MinHeap(11);
        h.insert(3);
        h.insert(2);
        h.insert(15);
        h.insert(20);
        System.out.print(h.extractMin());
    }

}
