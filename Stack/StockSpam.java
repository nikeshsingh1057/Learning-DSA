import java.util.Stack;
/*
 *  stock spam problem
 */
public class stack8 {
    public static void main(String[] args) {

        int arr[] ={60,10,20,15,35,650};
        spam(arr);
    }
    static void spam(int [] arr)
    {
        Stack<Integer> s=new Stack<>();
        s.add(0);
        System.out.print(1+ " "); /* first element spam is always one */

        for(int i=1;i<arr.length;i++)
        {
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i])
            s.pop();

            int spam=s.empty()?i+1:i-s.peek(); /* here is.empty if no element greater than it e.g 650 */
            System.out.print(spam+ " ");

            s.add(i);

            
        }
    }
}
