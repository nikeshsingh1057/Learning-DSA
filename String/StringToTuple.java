import java.util.*;
public class Main {
    public static void main (String args[]) {

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String [] s=str.split(" ");
		String news="";
		for(int i=0;i<s.length;i++)
		{
			if(i==0)
			news+="(";
			news+="'"+s[i]+"'";
			if(i!=s.length-1)
			news+=", ";
			if(i==s.length-1)
			news+=")";
		}
		System.out.println(news);
    }
}

//input-> Welcome to python programming
//output-> ('Welcome', 'to', 'python', 'programming')
