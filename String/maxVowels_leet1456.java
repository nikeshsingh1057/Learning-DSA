// Maximum Number of Vowels in a Substring of Given Length

// sliding window solution.
class Solution {
    public int maxVowels(String s, int k) {
        
        int count=0;
        int max=0;
        for(int i=0;i<k;i++)
        {
            if(vowel(s.charAt(i))==true)
                count++;
            max=Math.max(count,max);
            if(max==k) return k;   // max==k then no further check
        }
        
        int i=0;
        for(int j=k;j<s.length();j++)
        {
            if(vowel(s.charAt(i))==true)
                count--;
            if(vowel(s.charAt(j))==true)
                count++;
            
            max=Math.max(count,max);
            if(max==k) return k;    // max==k then no further check
            
            i++; //increment i each time to remove used element from window and to remove it.
        }
        return max;
    }
    // function to check vowel.
    public static boolean vowel(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        else
            return false;
    }
}

// Brute force solution.
class Solution {
    public int maxVowels(String s, int k) {
        
        int ans=0;
        for(int i=0;i<=s.length()-k;i++)
        {
            int count=0;
            int j=i;
            
            while(j<k+i)
            {
                char v=s.charAt(j);
                if(v=='a'|| v=='e'|| v=='i'|| v=='o'|| v=='u')
                    count++;
                j++;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}
