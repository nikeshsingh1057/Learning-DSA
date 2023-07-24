// Longest subarray not having more than K distinct elements
// iss question me longest kaha hai so last me "ans=Math.max(ans,i-j+1)" karenge question ye rahata i.e
// find total count subarray having atmost k distinct element than we do "(ans+=i-j)".
// https://www.geeksforgeeks.org/longest-subarray-not-k-distinct-elements/      (gfg question link).

class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        
        return At_Most(arr,k);
    }
    public static int At_Most(int arr[],int k)
    {
        HashMap<Integer,Integer> hs=new HashMap<>();
        
        int i=0,j=0,ans=0;
        
        while(i<arr.length)
        {
            hs.put(arr[i] , hs.getOrDefault(arr[i] , 0) + 1);
            
    
                while(hs.size()>k)      // shirnking from here.
                {
                    
                     if(hs.get(arr[j])==1)    // removing element from here.
                        hs.remove(arr[j]);
                    
                    else
                        hs.put(arr[j] , hs.get(arr[j])-1);
                    
                    j++;
                }
            ans+=i-j+1;  // it will all count of atmost k distint element. for gettin longest we do "  ans=Math.max(ans,i-j+1)  "
            
            i++;
        }
        return ans;
    }
}

// similar question on coding ninza in form of string
// https://www.codingninjas.com/studio/problems/distinct-characters_2221410?leftPanelTab=0
import java.util.*;
public class Solution {

	public static int kDistinctChars(int k, String str) {
		
		return Distint_k_Substr(str,k);
	}
	public static int Distint_k_Substr(String s, int k) {
       
       HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
       int j=0,i=0;
       int ans=0;
       for(i=0;i<s.length();i++){
           
           hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
           
           while(hs.size()>k){    
              
                if(hs.get(s.charAt(j))==1)    
                    hs.remove(s.charAt(j));
                else
                    hs.put(s.charAt(j) , hs.get(s.charAt(j))-1);
                j++;
                
            }
            ans=Math.max(ans,i-j+1);
	   }
       return ans;
	}
}
