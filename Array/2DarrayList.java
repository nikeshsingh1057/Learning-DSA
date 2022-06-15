//2d array list in java.

import java.util.*; //util.ArrayList;
public class arrayList {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>>List=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<2;i++)
        List.add(new ArrayList<Integer>()); //etering two row in 2d array list.    
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
           // List.get(i).add(j);
            List.get(i).add(sc.nextInt());           //at each row we add element in it.
        }
        for(int i=0;i<List.size();i++)                // this run row size of array list      
        {
            for(int j=0;j<List.get(i).size();j++)          //for ieach row this run column size of 2d list.
            {
                System.out.println(" " +List.get(i).get(j));   //to print element in 2d array list.
            }
        }   
    }
    
}
