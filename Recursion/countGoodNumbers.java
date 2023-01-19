

public class demo {

	static int count;
	public static void main(String[] args) {

		count=0;
		count_goodNumber(4,"");
		System.out.println(count);
	}

	public static void count_goodNumber(int num,String ans)
	{
		if(ans.length()==num)
		{
			System.out.print(ans+" ");
			count++;
			return ;
		}

		for(int i=0;i<9;i++){

			String str=ans+i;
			boolean flag=true;

			for(int j=0;j<str.length();j++)
			{
				if(j%2==0 && (str.charAt(j)-'0')%2==1)
				flag=false;

				else if(j%2==1 && (str.charAt(j)-'0')%2==0)
				flag=false;
			}
			if(flag==true)
				count_goodNumber(num, str);
		}
	}
}

