//check array is sorted or not using recursion.
public class recursion10 {
    public static void main(String [] args)
    {
        int arr [] = {1,3,4,51,6,7,8};
        int i=0;
        boolean check=Arraysorted(arr,i);
        System.out.println(check);
    }
    static boolean Arraysorted(int [] arr,int i)
    {
        if(i==arr.length-1)
        return true;
        if(i<arr.length&& arr[i]>arr[i+1])
        return false;
        return Arraysorted(arr, ++i);
    }
}
