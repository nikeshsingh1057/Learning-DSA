// Prime Pairs With Target Sum
//https://leetcode.com/problems/prime-pairs-with-target-sum/
class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        
        boolean prime[]=new boolean[n+1];    // storing prime
        primecheck(n,prime);
        
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=2;i<prime.length;i++){
            
            if(prime[i]==false) {
                
                int idx=n-i;
                List<Integer> ll=new ArrayList<>();
                if(prime[i]==false && prime[idx]==false){
                    
                    ll.add(i);
                    ll.add(idx);
                    prime[idx]=true;
                    ans.add(ll);
                }
            }
        }
        return ans;
    }
    public static void primecheck(int n,boolean[] prime)
	{
		prime[0]=prime[1]=true;
	
		for(int i=2;i*i<prime.length;i++)
		{
			if(prime[i]==false) {
				
				for(int k=2;k*i<prime.length;k++) {
					
					prime[i*k]=true;
				}
			}
		}
	}
}
