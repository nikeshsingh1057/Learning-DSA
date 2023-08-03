class Solution {
    // this qustion is based on atmost k.(see other question based on it at github).
    public int countCompleteSubarrays(int[] arr) {
        
        HashSet<Integer> hs=new HashSet<>();
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        return AtMost(arr,hs.size())-AtMost(arr,hs.size()-1);
    }
    public static int AtMost(int [] arr,int k){
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        int i=0,j=0,count=0;
        
        while(i<arr.length){
            
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            
            while(mp.size()>k){
                 
                if(mp.get(arr[j])==1)  
                    mp.remove(arr[j]);
                    
                else
                    mp.put(arr[j] , mp.get(arr[j])-1); 
                j++;
            }
            count+=i-j+1;
            i++;
        }
        return count;
    }
}
