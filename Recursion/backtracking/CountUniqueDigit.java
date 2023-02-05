

import java.util.*;

public class demo {
	
	static int count=0;
	public static void main(String[] args) {
		
		int n=3;
        int arr[]=new int[11];
        
        
        unique(n,arr,0);

		System.out.println();
		
		System.out.println(count);
		
	}
	public static void unique(int n,int arr[],int sum)
    {
		// we are using backtracking here.

		String ans=""+sum;
        if(ans.length()>n)
            return;

        count++;
        System.out.print(sum+" ");

		int i=0;

		if(sum==0) {        // this is very important line. 
			i=1;
		}
        for(;i<=9;i++)
        {
            if(arr[i]==0){
                
                arr[i]=1;
                unique(n,arr,sum*10+i);
                arr[i]=0;
            }
                
        }
    }
}
