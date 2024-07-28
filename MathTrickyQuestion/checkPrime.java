// function to check prime no

    public static int prime(int n)
    {
        if(n<=1)
            return 0;
        
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return 0;         // 0 for not prime yani composite hai
        return 1;                 // 1 for prime yani prime hai
    }

// optimising it more ---------------------------------------------------------------------

public class PrimeNumbers {
    public static boolean isPrime(int num) {
        
        if (num <= 1) 
            return false;
        if (num == 2) 
            return true;
        if (num % 2 == 0) 
            return false;
        // Check divisibility up to the square root of num
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 17; 
        if (isPrime(n)) 
            System.out.println(n + " is a prime number.");
        else 
            System.out.println(n + " is not a prime number.");
    }
}

/* If the code uses for (int i = 3; i * i <= n; i += 2), the loop will check if n is divisible by 3, 5, 7, etc., skipping all even numbers
which cannot be prime (except for 2, which is handled separately).
yani even ke liye upper he handle kar diya hai so dubar check karne ki need nahi hai.This approach optimizes the prime-checking process by
reducing unnecessary computations. */
