// Minimum Swaps to Group All 1's Together II _2134
// https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/

class Solution {   // logic seen but code by own
    public int minSwaps(int[] arr) {
        
        // note isme bhee same approch lagega bas 2*n kar do i.e circular hai hence original array ko eak barr aur append kar do so circular ho jayega .
        int n=arr.length;
        int totalOne=0;
        for(int ele : arr)
            totalOne += ele;   // note zero se koi matlab nhai
        
        if(totalOne<=0)
            return 0;
        
        int currCount=0;
        int maxCount=0;
        
        for(int i=0;i<totalOne;i++) // countOne jita first window me one count kar liey hai 
            currCount += arr[i];
        
        maxCount = currCount;
        int j=0;
        int i=totalOne;
        
        while(i<2*n){ // now yaha se furthure maxm window me one count karenge.
            
            
            currCount += arr[i%n];
            currCount -= arr[j%n];
            
            maxCount = Math.max(currCount,maxCount);
            i++; j++;
        }
        
        return totalOne-maxCount;
    }
}

// note iska 1st wala ka solution i.e leetcode 1151 ka code.

/*
 public static int minSwaps(int arr[], int n) {
        
        int totalOne=0;
        for(int ele : arr)
            totalOne += ele;   // note zero se koi matlab nhai
        
        //if(totalOne==0)  gfg par eak case hai 
            //return -1;     
        if(totalOne==1) //  no need to swap.
            return 0;
            
        //now grouping karna hai so jitna 1 ka count hoga utna he window banega..
        //i.e ussi window frame me sare one aayenge so countOne size ka window... 
        //subarray lo ans check karo kis window me sabse maximum one aa raha hai.. 
        //and jo sabse jayda hoga one wala window hoga usme se remaining one wala substract kar do.          
        
        
        int currCount=0;
        int maxCount=0;
        
        for(int i=0;i<totalOne;i++) // countOne jita first window me one count kar liey hai 
            currCount += arr[i];
        
        maxCount = currCount;
        int j=0;
        
        for(int i = totalOne; i<n ;i++){ // now yaha se furthure maxm window me one count karenge.
            
            currCount += arr[i];
            currCount -= arr[j++];
            
            maxCount = Math.max(currCount,maxCount);
        }
        
        return totalOne-maxCount;
    }

*/
