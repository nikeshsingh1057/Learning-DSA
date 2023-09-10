// https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-119/problems

/* You are given a string S of lowercase Latin characters with size N. Your task is to find the lexicographically smallest substring
with the maximum frequency. */

class Solution {
    public static String solve(int N, String S) {
        
        // maximum char frequency he answer hoga because singe char bhee substring hota hai and vo lexical smaller hoga.
        
        int arr[]=new int[26];
        for(int i=0;i<N;i++){
            
            arr[S.charAt(i)-'a']++;
        }
        int max=Integer.MIN_VALUE;
        String ans="";
        for(int i=0;i<arr.length;i++){
            
            if(max<arr[i]){
                
                max=arr[i];
                ans=(char)(i+'a')+"";
                //System.out.print(ans+" ");
            }
        }
        return ans;
    }
}
