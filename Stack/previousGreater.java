import java.util.Arrays;
import java.util.Stack;

/*
 *  previous greater element 
 */
public class stack9 {
     public static void main(String[] args) {
        
        int [] arr={15,10,18,12,4,6,2,778};
        PreviousGreater(arr);
     }
     static void PreviousGreater(int [] arr)
     {
        Stack<Integer> s= new Stack<>();
        int prev [] =new int[arr.length]; // to store previous.
        prev[0]=-1;
        s.add(0); 


        for(int i=1;i<arr.length;i++)
        {
            if(arr[s.peek()]>arr[i])
            {
                prev[i]=arr[s.peek()];
                s.add(i);
            }
            else
            {
                while(s.empty()==false && arr[s.peek()]<arr[i])
                s.pop();
                
                if(s.empty()==true)
                prev[i]=-1;

                else 
                prev[i]=arr[s.peek()];

                s.add(i);
            }
        }
        System.out.println(Arrays.toString(prev));
     }
}
