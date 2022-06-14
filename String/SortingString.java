// by using one by one element to short string after converting string to cahrector array
/*import java.util.*;
public class shortstring {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str;
        str=sc.nextLine();
        char temp;
        char arr[]=str.toCharArray();  //converting string to charector array
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
               if(arr[i]>arr[j]){
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;}
            }
        }
        String s=new String(arr);
        System.out.println(s);
    }
} */

// by using shorting array method after converting string into cahrechtor array

import java.util.*;
public class shortstring {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str;
        str=sc.nextLine();
        char arr[]=str.toCharArray();     //converting string to charector array
        Arrays.sort(arr);
        String s=new String(arr);         //converting char array to string.
        System.out.println(s);
    }
}

