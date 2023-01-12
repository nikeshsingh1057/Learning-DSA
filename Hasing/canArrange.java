// Check If Array Pairs Are Divisible by k

class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        // see in copy for explanitation.
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        
        for(int ele : arr){
            
            int rem=(k+ele%k)%k;   // [-1,1,-2,2,-3,3,-4,4] to avoid remainder is in negative because remainder never been in negative, so we do this.
            
            int a=hs.getOrDefault(rem,0);
            hs.put(rem,a+1);
        }
        
        for(int ele: arr)
        {
            int rem=(k+ele%k)%k;
            
            if(rem==0){
                
                if(hs.get(rem)%2==1)
                    return false;
            }
            
            else if(2*rem==k){
                
                if(hs.getOrDefault(rem,0)%2==1)
                    return false;
            }
            else{
                
                int of= hs.getOrDefault(rem,0);
                int rf= hs.getOrDefault(k-rem,0);
                if(of!=rf)
                    return false;
            }
        }
        return true;
    }
}
