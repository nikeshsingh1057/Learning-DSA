import java.util.Arrays;
/* 
 *  decrease key form heap (it means at given index add the given element and maintain the min heap).
 */
public class decrease_Key {
    
    static void DecreaseKey(int arr[],int x,int i)
    {
        if(i>arr.length)
        return;

        arr[i]=x;
        
        // now modify the heap or heapify the heap for newly added element.
        while(i!=0 && arr[parent(i)]>arr[i])
        {
            int temp=arr[parent(i)];
            arr[parent(i)]=arr[i];
            arr[i]=temp;

            i=parent(i);
        }
    }
    static int parent(int i)
    {
        return (i-1)/2;
    }
    static void display(int arr[])
    {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        
    //we have taken array here because internally heap element is stored inside array/or arrayList.
        int arr[]={10,20,40,80,100,70};

        int x=5;
        int i=3;  /* index fifth position par 899 dal do and heap maintain hona chaiye. */
        DecreaseKey(arr,x, i);
        display(arr);
    }
}
