import java.util.Arrays;

// similar question generation permutations.

public class leetcode_1079 {
	static int cn=0;
	public static void main(String[] args) {

		String str="aab";

		char tempArray[] = str.toCharArray();
		Arrays.sort(tempArray);

		str=new String(tempArray);   //converting char array to string using passing in string function

		System.out.println(str);

		tile(str,"");

		System.out.println(cn);

	}

	public static void tile(String str,String ans) {

		System.out.print(ans+" ");
		cn++;
		if(str.length()==0)
		{
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			if(i>0 && str.charAt(i-1)==str.charAt(i))     // for removing dublicate.
			continue;

			String a=str.substring(0,i);
			String b=str.substring(i+1);

			tile(a+b, ans+str.charAt(i));
		}
	}
}

//a aa aab ab aba b ba baa 
