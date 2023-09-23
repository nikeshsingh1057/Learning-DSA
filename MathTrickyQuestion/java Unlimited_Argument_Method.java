// java method having any number of arguments we can pass.

public class Main
{
	public static void main(String[] args) {
		
		int a=10;
		int b=-1;
		int c=24;
		int d=56;
		int m=maxm(a,b,c,d);
		System.out.println(m);
	}
	public static int maxm(int... arr){
	    
	    int max=Integer.MIN_VALUE;
	    
	    for(int i=0;i<arr.length;i++){
	        max=Math.max(arr[i],max);
	    }
	    return max;
	}
}
