//sorting 2d array by rowise.
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int [][] arr={{4,56,4,3,-2,5},{1,0,4,-5},{4,6,-4,-6}};
	    for(int i=0;i<arr.length;i++)
	    {
	        Arrays.sort(arr[i]);
	    }
	    for(int i=0;i<arr.length;i++)
	    {
	        for(int j=0;j<arr[i].length;j++)
	        System.out.printf("%d ",arr[i][j]);
	        System.out.println();
	    }
	}
}
