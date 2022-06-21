// Product of digit using recursion.
public class recursion7 {
    public static void main(String [] args)
    {
        int n=1234;
        System.out.println(digitPro(n));
    }    
    static int digitPro(int n)
    {
        if(n%10==n) // or if(n==0) return 1;
        return n;
        return  n%10 * digitPro(n/10);  //agar n%10 digitPro(n/10) ke left side likhange to galat output
    }                                    // dega eak digit ka multiply chor dega.
}
