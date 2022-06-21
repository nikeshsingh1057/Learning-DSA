
// print sum of n natural number using recursion.
public class recursion3 {
     public static void main(String[] args) {
        int n = 4; // natural number
        System.out.println(sum(n));
    }

    static int sum(int n) {
        if (n == 0) // jaha tak ka sum chaiye.
            return 0;
        int temp = sum(n - 1);
        return temp + n;
        // or return sum(n-1)+n;
        // if we do multiply here replace return with 1 we get factorial of the number.
    }
}
