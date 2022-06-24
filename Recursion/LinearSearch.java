
//Linear search in array using recursion.
public class recursion11 {
    public static void main(String [] args)
    {
        int [] arr={43,5,56,23,6,78};
        int target=6;
        int i=0;
        int index=LinearSearch(arr,target,i); // we can make boolean return typo also.
        System.out.println(index);
    }
    static int LinearSearch(int [] arr, int target,int i)
    {
        if(arr[i]==target)
        return i;
        if(i==arr.length-1)
        return -1;
        return LinearSearch(arr, target, ++i);
    }
}
