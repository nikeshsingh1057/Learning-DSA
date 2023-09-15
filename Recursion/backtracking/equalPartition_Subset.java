// Partition Equal Subset Sum    (GFG ka question hai).
// https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1

class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum=0;
        for(int i:arr)
            sum+=i;
            
        if(sum%2==1)
            return 0;
            
        return subsetPrint(arr,0,sum/2,0);
    }
    public static int subsetPrint(int arr[],int idx,int sum,int t){
        
        if(t==sum)
            return 1;
            
        if(idx==arr.length)
            return 0;
        
        for(int i=idx;i<arr.length;i++){
        
            if(t<=sum){
                
                if(subsetPrint(arr,i+1,sum,t+arr[i])==1)
                    return 1;
            }
            
        }
        return 0;
    }
}
