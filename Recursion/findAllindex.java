// print all the index of the target element in array.
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
        if(i==arr.length-1)
        return;
        if(arr[i]==target)
        list.add(i);    // adding index to list.
        SearchAllOccurance(arr, target, ++i);

    }
}

// by using returning list in avobe we not reutrn list 

public class recursion12 {
    public static void main(String [] args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        int [] arr={4,5,6,4,3,4,34,4};
        int i=0,target=4;
        list = SearchAllOccurance(arr, target, i, list);
        System.out.println(list);
    }
    static ArrayList<Integer> SearchAllOccurance(int [] arr,int target,int i,ArrayList<Integer> list)
    {
        if(i==arr.length)
        return list;
        if(arr[i]==target)
        list.add(i);    // adding index to list.
        return SearchAllOccurance(arr, target, ++i, list);

    }
}

// by making arraylist in side function block means not call arraylist in argument but return arraylist.
public class recursion12 {
    public static void main(String [] args)
    {
        int [] arr={4,5,6,4,3,4};
        int i=0,target=4;
        System.out.println(SearchAllIndex(arr, target, i));
    }
    
    static ArrayList<Integer> SearchAllIndex(int [] arr,int target,int i) // note ArrayList argeument is not passed in Parameter, but return list.
    {
        // in every function call a new list created.it means it is not pointing the same list
        // so if we get target value in the array if will add those Arraylist which is currently called at that time.
        // again if new function will  call and again target value found than it will not add its index in perivious Arraylist because 
        // in every call new it does not referecnes to same object. to return list we do                                        
        ArrayList<Integer> list=new ArrayList<>(); //in every call ArrayList object refernces will be change.
        if(i==arr.length)                      
        return list;
        // this will contain answer for that function call only.
        if(arr[i]==target)
        list.add(i);       
        ArrayList<Integer> ansFromBelowCalls= SearchAllIndex(arr, target, ++i);
        list.addAll(ansFromBelowCalls);
        return list;

    }
}
