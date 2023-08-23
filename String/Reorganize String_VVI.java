// Reorganize String LeetCode_767
// https://leetcode.com/problems/reorganize-string/description/?source=submission-ac

class Solution {
    // this quesion can be either solved by hashmap or heap or by storing frq array.
    public String reorganizeString(String s) {
        
        int arr[]=new int[26];
        int max=0,letter=0;  //letter me char ka index store kara rahe hai so that num ussase character pata kar sake.
        for(int i=0;i<s.length();i++){

            arr[s.charAt(i)-'a']++;
            if(arr[s.charAt(i)-'a']>max){
                max=arr[s.charAt(i)-'a'];  // count of maxm char in string/array.
                letter=s.charAt(i)-'a';    // storing maxm char index in array.
            }   
        }
        if(max>(s.length()+1)/2)
            return "";
        
        char res[]=new char[s.length()];
        int index=0;
        while(arr[letter]-- > 0){
            res[index]=(char)(letter+'a'); // char me convert karne ke liye letter me index hai jo character maximum hai i.e(0+'a'= 'a' , 3+'a'= 'd').
            index+=2; // first even position bharega then uske badd se odd bharega 
        }

        // remaining letters ke liye.
        for(int i=0;i<26;i++){

            while(arr[i]-- > 0){
                if(index>=s.length()) index=1; //first we filled all even place than we start filling odd index (since indexs are only even or odd)
                res[index]=(char)(i+'a');
                index+=2;
            }
        }
        return String.valueOf(res);
    }
}
