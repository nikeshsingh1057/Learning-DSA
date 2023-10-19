public static int fill(){
	    
	    int temp[]=new int[10000];
	    int opt=0;
	    temp[0]=-1;
	    for(int z=1;z*z<1000007;z++){
	        
	        temp[z]=Math.max(temp[z-1],z);
	        opt+=temp[z];
	    }
	    
	    System.out.print(Arrays.toString(temp));
	    
	    if(opt<0) return -1;
	    return 100;
	}

//----------------------------------------------------------------------------------------------------------------
 long atmost(String s, int k){
       
       String temp="";
       for(int i=0;i*i<s.length();i++)
        temp+=s.charAt(i);
    
        return solve(s,k);
      
    }
//----------------------------------------------------------------------------------------------------------------------------------------



import java.util.*;

public class first {
    /* 0.------------------- check prime ------------------- */

    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }

    /* 1. --------------- GCD --------------------- */

    public static int gcd(int a, int b){
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    /* 2. ------------------- Sieve of Eratosthenes -------------------- */

    public static void sieveOfEratosthenes(int n){
        boolean[] prime = new boolean[n+1];
        for(int i=0;i<=n;i++)
            prime[i] = true;
        for(int p = 2; p*p <=n; p++) {
            if(prime[p]) {
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for(int i = 2; i <= n; i++) {
            if(prime[i]) System.out.print(i + " ");
        }
    }

    /* 3. -------------------- Binary Search -------------------- */

    public static int binarySearch(int[] array, int x, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == x)
                return mid;
            if (array[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    /* 4.------------------ Check Palindrome -------------------- */

    public static boolean isPalindrome(String s){
        int n = s.length();
        for(int i = 0; i < n / 2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
           // write code here .
	}
    }
}

