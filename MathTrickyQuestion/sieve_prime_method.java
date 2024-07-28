package Time_Space_Complixity;

public class sieve_prime_method {

	public static void main(String[] args) {
		
		int n=100;
		primecheck(n);

	}
	public static void primecheck(int n)
	{
		boolean[] prime=new boolean[n+1];
		
		prime[0]=prime[1]=true;
	
		for(int i=2;i*i<prime.length;i++)
		{
			if(prime[i]==false) {
		
				for(int k=i;k*i<prime.length;k++) { 
                                   prime[k*i]=true;                                                                                                      
			}
		}
		for(int i=2;i<prime.length;i++)
		{
			if(prime[i]==false)
				System.out.print(i+" ");
		}
		
	}

}

// -------------------------------------------------------------------------------------------------------------------------------------

import java.util.Arrays;

public class SieveOfEratosthenesSimple {
    public static void main(String[] args) {
        int n = 50; // Change this to the desired upper limit
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false; // 0 is not a prime number
        isPrime[1] = false; // 1 is not a prime number

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

// ------------------------------------------------------------------------------------------------------------------------------

import java.util.Arrays;

public class OptimizedSieve {
    public static void main(String[] args) {
	    
        int n = 50; // Change this to the desired upper limit
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
	    
        isPrime[0] = false; // 0 is not a prime number
        isPrime[1] = false; // 1 is not a prime number

        // Mark all multiples of 2 greater than 2 as non-prime
        for (int i = 2 * 2; i <= n; i += 2) {  // 2 wala ko alag se kar liye now jitna bhee even aayega i.e 4,6,8 no need to check because 2 se already mark hoga
            isPrime[i] = false;
        }

        // Start marking multiples from 3, skipping even numbers
        for (int i = 3; i * i <= n; i += 2) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += 2 * i) {
                    isPrime[j] = false;
                }
            }
        }

        // Output the prime numbers
        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 2; i <= n; i += 2) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
