//print all the index of the target element in array.
import java.util.ArrayList;
import java.util.List;

public class recursion12 {
    static List<Integer>list=new ArrayList<>(); // taking static list which is outside the main function
    public static void main(String [] args)
    {
        int [] arr={4,5,6,4,3,4,34,4};
        int i=0,target=4;
        SearchAllOccurance(arr, target, i);
        System.out.println(list);
    }
    static void SearchAllOccurance(int [] arr,int target,int i)
    {
        if(i==arr.length)
        return;
        if(arr[i]==target)
        list.add(i);    // adding index to list.
        SearchAllOccurance(arr, target, ++i);

    }
}

// by using returning list note in avobe we not reutrn list we use static ArrayList.

public class recursion12 {
    public static void main(String [] args)
    {
        List<Integer>list=new ArrayList<>();
        int [] arr={4,5,6,4,3,4,34,4};
        int i=0,target=4;
        list = SearchAllOccurance(arr, target, i, list); //note use arrayList this will give warning
        System.out.println(list);
    }
    static List SearchAllOccurance(int [] arr,int target,int i,List<Integer> list)
    {
        if(i==arr.length)
        return list;
        if(arr[i]==target)
        list.add(i);    // adding index to list.
        return SearchAllOccurance(arr, target, ++i, list);

    }
}
