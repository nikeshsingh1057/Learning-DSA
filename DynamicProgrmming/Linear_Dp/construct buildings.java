// Count possible ways to construct buildings
// this question is same as nth fibonaci number

class Solution{
    public int TotalWays(int N)
    {
        long mod = 1000000007;
		    long [] f = new long[N+1];   //dp 
		    f[0] = f[1] = 1;
		    for(int i = 2; i <= N; i++)
  			    f[i]  = (f[i-1]%mod + f[i-2]%mod)%mod; 
		    long x = (f[N] + f[N-1])%mod;
		    x = x * x; 
		    x %= mod; 
		    return (int)x; 
    }
}

// method 2 sumit sir (Consecutive 1's not allowed  or no two head together recursion wala).
//https://www.geeksforgeeks.org/problems/consecutive-1s-not-allowed1912/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
