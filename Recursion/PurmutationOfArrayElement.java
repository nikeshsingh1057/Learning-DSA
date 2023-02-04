import java.util.Arrays;

// print all permutations of String. 

public class PurmutationOfArrayElement {

	public static void main(String[] args) {
		
		int arr[] = {1,1,2};
        Arrays.sort(arr);

        int arr2[]=new int[arr.length];

		PrintAnswer(arr,"",arr2,0);
	}
	public static void PrintAnswer(int [] arr,String ans,int [] arr2,int j)
	{
		if(ans.length()==arr.length) {  // or ques.length()== original String length .. (here length will be zero so we pass another length variable)
			
			System.out.print(ans+" ");
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr2[i]==1|| (i>0 && arr[i]==arr[i-1]) && arr2[i-1]==0)continue;
			
			if(arr2[i]==0)
            {
                arr2[i]=1;
                PrintAnswer(arr, ans+arr[i], arr2, j+1);
                arr2[i]=0;
            }
		  
		}
	}
}

