/* 
 *  implementation of queue using Array
 */
class Array {
    int[] arr;
    int size;
    int rear = -1;

    Array(int x) {
        size = x;
        arr = new int[size];
    }

    Boolean isEmpty() {

        return (rear == -1);
    }
    Boolean full()
    {
       return (rear==size-1);
    }

    void Enqueu(int data) {

        if(full())
        {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    int Dequeu() {

        if (isEmpty()) {
            System.out.print("queue is empty");
            return 0;
        }

        int Dq_element = arr[0];

        for (int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];
        rear--;

        return Dq_element;
    }

}

public class ArrayImpl {
    public static void main(String[] args) {

        Array A = new Array(5);

        A.Enqueu(5);
        A.Enqueu(20);
        A.Enqueu(290);
        A.Enqueu(290);
        A.Enqueu(290);
        
        System.out.println(A.Dequeu());
        System.out.println(A.Dequeu());
        System.out.println(A.Dequeu());
        System.out.println(A.Dequeu());
    }
}
