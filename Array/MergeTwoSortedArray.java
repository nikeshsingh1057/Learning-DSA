// Merge two sorted arrays with O(1) extra space
import java.util.*;
public class mergeSortedArray {
    public static void main(String [] args)
    {
        int [] arr1={1,4,7,8,10};
        int [] arr2={2,3,9};
        int i=0,temp;
        while(i<arr1.length)
        {
            if(arr1[i]<arr2[0])
            i++;
            else if(arr1[i]>arr2[0])
            {
                temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
                i++;
                Arrays.sort(arr2);
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    
}
