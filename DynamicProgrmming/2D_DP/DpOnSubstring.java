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
