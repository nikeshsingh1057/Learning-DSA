// Length of the largest subarray with contiguous elements
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
