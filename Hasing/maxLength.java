// Length of the largest subarray with contiguous elements  .(isme dublicate nahi hoga testcase me)
// https://www.codingninjas.com/studio/problems/length-of-the-largest-subarray_2825087?leftPanelTab=0

import java.util.* ;
import java.io.*; 

public class Solution {

	public static int maxLength(int n, int[] arr) {
		
		int ans=1;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;

		for(int i=0;i<n-1;i++){
			
			min=arr[i];
			max=arr[i];

			for(int j=i+1;j<n;j++){

				min=Math.min(arr[j],min);
				max=Math.max(arr[j],max);

				if((max-min)==(j-i)){
					ans=Math.max(max-min+1,ans);
				}
			}
		}
		return ans;
	}

}

// Length of the largest subarray with contiguous elements  .(isme dublicate hoga testcase me)
// above logic not work if testcase contain diblicate so we use hashset to check dublicate and handle answer.
// https://www.codingninjas.com/studio/problems/length-of-the-largest-subarray-ii_3125966?leftPanelTab=1
import java.util.* ;
import java.io.*; 
 
public class Solution {

	public static int maxLength(int[] arr) {
		
		int ans=1;
		int n=arr.length;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;

		for(int i=0;i<n-1;i++){
			
			min=arr[i];
			max=arr[i];
			HashSet<Integer> hs=new HashSet<>();
			hs.add(arr[i]);

			for(int j=i+1;j<n;j++){

				if(hs.contains(arr[j]))
					break;

				min=Math.min(arr[j],min);
				max=Math.max(arr[j],max);
				hs.add(arr[j]);
				
				if((max-min)==(j-i)){
					ans=Math.max(max-min+1,ans);
				}
			}
		}
		return ans;
	}

}
