// https://leetcode.com/problems/longest-ideal-subsequence/
// Longest Ideal Subsequence (Leectode_2370)

class Solution {
    public int longestIdealString(String s, int k) {
    
        int dp[][]=new int[s.length()+1][256];
        
        for(int r[] : dp)
            Arrays.fill(r,-1);
        
        return solve(s,k,'*',0,dp);
    }
    public int solve(String s,int k,char p,int c,int dp[][]){ // p=prev, c=currIdx
        
        if(c>=s.length())
            return 0;
     
        if(dp[c][(int)p] != -1)
            return dp[c][(int)p];
        
        int a=0,b=0;
        if(p=='*' || Math.abs(s.charAt(c) - p)<=k)
            a= 1+solve(s,k,s.charAt(c),c+1,dp);
        b=solve(s,k,p,c+1,dp);

        return dp[c][(int)p] = Math.max(a,b);
    }
}

/* logic-> hum isme dp ke column ko direct string.length+1 tak define nahi kar sakte because memory limit exit aayega hence hum isko ascii ka length man lenge now uss index par previous char bhejenge and answer nikalange 

this question is similar to longest increasing subsequence.
*/
