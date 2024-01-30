//  Minimum Insertion Steps to Make a String Palindrome

class Solution { // dp seen striver
    
    // this question can be solved using  LPS (longest palendromic subsequence);
    // and lps is solved by using LCS (by reversing string and finding longest common subsequence).
    public int minInsertions(String s) {
        
        int dp[][]=new int [s.length()+1][s.length()+1];
        
        for(int a []:dp)
            Arrays.fill(a,-1);
        
        return minimumInsert(s,0,s.length()-1,dp);
    }
    public static int minimumInsert(String s,int i,int j,int dp[][]){
        
        if(j<i)
            return 0;
        
        if(i==j)
            return 0;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE;
        
        if(s.charAt(i)==s.charAt(j)){
            a=minimumInsert(s,i+1,j-1,dp);
        }
        else
            b = 1+Math.min(minimumInsert(s,i+1,j,dp),minimumInsert(s,i,j-1,dp));
        
        
        return dp[i][j]=Math.min(a,b);
    }
}

// this question is also solved by using lcs , lps 
// see striver dp vedio if not understand.
