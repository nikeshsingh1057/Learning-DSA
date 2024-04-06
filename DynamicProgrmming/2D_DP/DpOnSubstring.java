// 1. Palindromic Substrings    (count total palendromic substring).

class Solution {   // dp seen
    
    // t.c=n*n 
    public int countSubstrings(String s) {
       
        int[][] dp = new int[s.length()][s.length()];
        
        for (int[] d : dp) 
            Arrays.fill(d, -1);
        

        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                
                count += solveMemo(s, i, j,dp);
            }
        }
        return count;
    }

    private int solveMemo(String s, int i, int j, int[][] dp) {
     
        if (i >= j)
            return 1;
        
        if (dp[i][j] >= 0)
            return dp[i][j];

        return dp[i][j] = s.charAt(i) == s.charAt(j) ? solveMemo(s, i + 1, j - 1, dp) : 0;
    }
}

//2. longest palendromic substring

class Solution {   // dp seen
    
    // t.c=n*n becaue har eak ke liye nikal rahe hai.
    public String longestPalindrome(String s) {
       
        int[][] dp = new int[s.length()][s.length()];
        
        for (int[] d : dp) 
            Arrays.fill(d, -1);
        
        int maxPald = 0;
        int si=0,ei=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                
                int currPald=j-i+1;
                int validPalend=0;
                
                if(currPald>maxPald)
                    validPalend= solveMemo(s, i, j,dp);

                if(validPalend==1 && currPald>maxPald){
                    maxPald = currPald;
                    si=i; ei=j;
                }
                    
            }
        }
        String ans="";
        while(si<=ei)
            ans += s.charAt(si++);

        return ans;
    }

    private int solveMemo(String s, int i, int j, int[][] dp) {
     
        if (i >= j)
            return 1;
        
        if (dp[i][j] >= 0)
            return dp[i][j];

        int a=0;

        if(s.charAt(i) == s.charAt(j))
           a=solveMemo(s, i + 1, j - 1, dp);
        return a;
    }
}

//3 longest common subsequence
//4 longest palendromic subsequence.

//5 Shortest Common Supersequence (gfg par only count print karwan hai but leetcode par string print karwan hai.) 
// question 5 is variation of question LCS
class Solution       //(isme sirf count print karwa rahe hai)
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String s1,String s2,int m,int n)
    {
        int dp[][]=new int[m+1][n+1];
        
        for(int a[]:dp)
            Arrays.fill(a,-1);
            
        int ans=solve(s1,s2,m,n,dp);
        return ans;
    }
    public static int solve(String s1,String s2,int m,int n,int dp[][]){
        
        if(m==0|| n==0)
            return m+n;
        
        if(dp[m][n]!=-1)
            return dp[m][n];
            
        int a=0;
        if(s1.charAt(m-1)==s2.charAt(n-1))
            a = 1+solve(s1,s2,m-1,n-1,dp);
        
        else
            a = 1 + Math.min(solve(s1,s2,m-1,n,dp),solve(s1,s2,m,n-1,dp));
        
        return dp[m][n]=a;
    }
}
// Leetcode 368 
