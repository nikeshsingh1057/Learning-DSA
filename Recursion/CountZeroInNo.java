// count total number of zero in number.
public class recursion9 {
    public static void main(String [] args)
    {
        int n=30702;
        int zero=0;
        System.out.println(countZero(n, zero));
    }
    static int countZero(int n,int zero)
    {
        if(n==0) return zero; //it return zero to all function call wating in the stack for getting the ans.
        if(n%10==0)
        zero+=1;
        return countZero(n/10, zero);
    }
}
