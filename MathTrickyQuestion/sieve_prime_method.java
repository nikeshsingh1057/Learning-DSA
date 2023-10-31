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
				
				for(int k=2;k*i<prime.length;k++) {     // note here k=i se chalega for(int k=i;k*i<prime.length;k++)
					
					prime[i*k]=true;
				}
			}
		}
		for(int i=2;i<prime.length;i++)
		{
			if(prime[i]==false)
				System.out.print(i+" ");
		}
		
	}

}
