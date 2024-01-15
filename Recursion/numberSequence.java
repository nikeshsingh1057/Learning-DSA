// https://www.geeksforgeeks.org/problems/sequence-of-sequence1155/1

class Solution {
    static int numberSequence(int m, int n) {
        // code here

        return solve(m,n,1,1);
    }
    
    public static int solve(int m,int n,int idx,int prev){
        
        if(n==0)
            return 1;
        
        int a=0;
        
        for(int i=idx;i<=m;i++){
            
            if(i>=prev){
                a += solve(m,n-1,idx*2,i*2);
            }
        }
        return a;
    }
}
