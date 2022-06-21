// hcf of two number using recursion.
public class recursion5 {

    public static void main(String[] args) {
        int a = 25, b = 35;
        System.out.println(hcf(a, b));
    }

    static int hcf(int a, int b) {
        if (a == 0)
            return b;
        return hcf(b % a, a);
    }
}
