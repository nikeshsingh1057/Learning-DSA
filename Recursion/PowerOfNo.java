// calculate power of number method 1.
  public class recursion4 {
    public static void main (String [] args)
    {
        int x=2; //number
        int n=3;  // power        if we high power it will give zero because size is int.
        System.out.println(power(x,n));

    }
    static int power(int x ,int n)
    {
        if(n==0)
        return 1;
        return power(x, n-1)*x;
    }
}
// Second method.

//power of number using 2nd method
    public class recursion4 {
    public static void main (String [] args)
    {
        int x=2; //number
        int n=6;  // power
        System.out.println(power(x,n));

    }
    static int power(int x ,int n)
    {
        if(n==0)
        return 1;
        int temp= power(x, n/2);
        if(n%2==1)
        {
            System.out.println(1);  //check point. 
            return temp*temp*x;
        }
        return temp*temp;     
    }
}  

