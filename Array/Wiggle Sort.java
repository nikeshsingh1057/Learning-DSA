import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] wiggleSort(int n, int[] arr) {
		
		Arrays.sort(arr);

		for(int i=1;i<n-1;i+=2){

			int j=i+1;

			while(j<n-1 && arr[i]==arr[j])
				j++;
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return arr;
	}
}
