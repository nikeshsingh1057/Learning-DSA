public class leetcode93 {
    // Restore IP Addresses (isme basically valid ip banana hai given string se).
    public static void main(String[] args) {
        
        String str="25525511135";

        validip(str, "", 0);
    }
    public static void validip(String str,String ans,int count)
    {
        if(count==4)
        {
            if(str.length()==0){
                
                ans=ans.substring(0,ans.length()-1);
                System.out.print(ans+" ");
            }
            return;
        }
        if(str.length()==0)
            return;

        validip(str.substring(1), ans+str.charAt(0)+".", count+1); 

        if(str.length()>1){

            String len2=str.substring(0,2);
            int a=Integer.parseInt(len2);

            if(a<256 && (len2.charAt(0)!='0' &&len2.charAt(1)!='0' || len2.charAt(0)!='0' && len2.charAt(1)=='0'))
                validip(str.substring(2), ans+len2+".", count+1);
        }

        if(str.length()>2){

            String len3=str.substring(0,3);
            int a=Integer.parseInt(len3);

            if(a<256 && (len3.charAt(0)!='0'&& len3.charAt(1)!='0' && len3.charAt(2)!='0' || len3.charAt(0)!='0'&& len3.charAt(1)!='0' && len3.charAt(2)=='0'|| len3.charAt(0)!='0'&& len3.charAt(1)=='0' && len3.charAt(2)=='0'|| len3.charAt(0)!='0'&& len3.charAt(1)=='0' && len3.charAt(2)!='0'))
                validip(str.substring(3), ans+len3+".", count+1);
        
        }
        
    }
}
