// leetcode 648 solved using array of list.

class Solution {
    public String replaceWords(List<String> dict, String sen) {
       
        List<String> [] arr=new ArrayList[26];  // creating array of list.
        Collections.sort(dict);                 // sort the dict here.
        
        String[] strArr = sen.split(" ");
        
        for(int i=0;i<dict.size();i++){
            
            String str=dict.get(i);
            int idx=str.charAt(0)-'a';
            
            if(arr[idx]==null)
                arr[idx]=new ArrayList<>(Arrays.asList(str));
            
            else
                arr[idx].add(str);
        }
        
        String ans="";
        
        for(int i=0;i<strArr.length;i++){
            
            String str=strArr[i];
            int idx=str.charAt(0)-'a';
            
            if(arr[idx]==null)
                ans+=str+" ";
            
            else{
                 int f=1;
                for(int j=0;j<arr[idx].size();j++)//arr[idx].karne se list refer ho raha hai
                {
                    String root=arr[idx].get(j);   // this is basically for getting root 
                    if(root.length()>str.length()) continue;
                    
                    String temp=str.substring(0,root.length());  // given string se root part cut karna using substring
                    if(root.equals(temp)){
                        ans+=root+" ";
                        f=0;
                        break;
                    }
                }
                if(f==1)
                    ans+=str+" ";
            }
        }
        return ans.trim();
    }
}
