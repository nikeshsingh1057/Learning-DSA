// gfg Hands of Straights,     https://practice.geeksforgeeks.org/problems/hands-of-straights/1

class Solution {
    static boolean isStraightHand(int N, int k, int arr[]) {
        
        if(N%k!=0)
            return false;
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        Arrays.sort(arr);
        
        for(int i=0;i<N;i++){
            
            hs.put(arr[i],hs.getOrDefault(arr[i], 0)+1);
        }
        
        for(int i=0;i<N;i++){
            
            if(!hs.containsKey(arr[i]))
                continue;
            
            boolean check=group(hs,arr[i],k);
            
            if(check==false)
                return false;
        }
        return true;
    }
    public static boolean group(HashMap<Integer,Integer> hs,int val,int k){
        
        int i=0;
        while(i<k){
            
            if(!hs.containsKey(val))
                return false;
                
            else{
                if(hs.get(val)==1)
                    hs.remove(val);
                else
                    hs.put(val,hs.get(val)-1);
            }
            val+=1;
            i++;
        }
        return true;
    }
}
