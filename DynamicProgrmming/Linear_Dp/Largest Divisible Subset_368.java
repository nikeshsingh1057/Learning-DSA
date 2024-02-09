// variation of lis
// https://leetcode.com/problems/largest-divisible-subset/

class Solution {
    
    static List<Integer> ans;
    static int dp[];
    
    public List<Integer> largestDivisibleSubset(int[] arr) {
        
     
        ans=new ArrayList<Integer>();
        dp=new int[arr.length+1];
        Arrays.sort(arr);
        Arrays.fill(dp,-1);
        solve(arr,0,-1,new ArrayList<Integer>());
        return ans;
    }
    
    public void solve(int arr[], int i,int lastIdx,List<Integer> ll)
    {
        
        if(i>=arr.length){
            
            if(ans.size()<ll.size())
                ans=new ArrayList<>(ll);
             return ;
        }
    
        if(ll.size()>dp[i]  && (lastIdx==-1 || (arr[i]%arr[lastIdx]) == 0 )){
            
            dp[i]=ll.size();
            ll.add(arr[i]);
            solve(arr, i+1, i,ll);  
            ll.remove(ll.size()-1);
        }
        
        solve(arr,i+1,lastIdx,ll);
    }
}
