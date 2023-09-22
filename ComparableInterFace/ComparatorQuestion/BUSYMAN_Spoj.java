// https://www.spoj.com/problems/BUSYMAN/            /* ye question spoj ka hai. */
// similar question based on this question is 1.meeting room 2. arrivel time of train 

import java.util.Comparator;
import java.util.*;
public class BUSYMAN_Spoj {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-- > 0) {
			
			int n=sc.nextInt();
			pair[]arr=new pair[n];
			
			for(int i=0;i<arr.length;i++) {
				
				int start=sc.nextInt();
				int end=sc.nextInt();
				arr[i]=new pair(start,end);
			}
			Arrays.sort(arr,new Comparator<pair>() {
				
				public int compare(pair o1,pair o2) {
					return o1.end-o2.end;
				}
			});
			
			int activity=1;
			int end=arr[0].end;
			
			for(int i=1;i<arr.length;i++) {
				
				if(arr[i].start>=end) {
					activity++;
					end=arr[i].end;
				}
			}
			System.out.println(activity);
		}
	}
	static class pair{     // yaha static pair isly use kiye hai because pair class ko static method me use kiye hai.
		                   // agar yahi inner class ko hum non-static method me use karte to class ko static banane ki jarurat nahi hai.
		int start;
		int end;
		
		public pair(int start,int end) {
			this.start=start;
			this.end=end;
		}
	}
}
