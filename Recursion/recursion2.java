import java.io.PrintStream;

//printing natural number using recursion.
//Q.1 in reverse order
   public class recursion2 {
    public static void main(String [] args)
    {
        int n=5;
        print(n);
    }
    static void print(int n)
    {
        if(n==0)
        return;
        System.out.printf("%d ",n);
        print(n-1);
    }
}  
// Q.2 print up to 1 to n like 1,2,3,4,5....n 
   public class recursion2 {
    public static void main(String [] args)
    {
        int n=5;
        print(n);
    }
    static void print(int n)
    {
        if(n==0)
        return;
        print(n-1);
        System.out.printf("%d ",n);
    }
} 
// Q.3 print both reverse and not reverse ie  both case.
  public class recursion2 {
    public static void main(String [] args)
    {
        int n=5;
        print(n);
    }
    static void print(int n)
    {
        if(n==0)
        return;
        System.out.printf("%d ",n);
        print(n-1);
        System.out.printf("%d ",n);
    }
}