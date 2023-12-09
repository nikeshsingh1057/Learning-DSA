// Remove Adjacent Almost-Equal Characters
// https://leetcode.com/problems/remove-adjacent-almost-equal-characters/
// Greedy approach.

class Solution {
    public int removeAlmostEqualCharacters(String s) {
        
        int count=0; // counting answer.
        
        for(int i=0;i<s.length()-1;i++){
            
            if(adj(s.charAt(i),s.charAt(i+1))){
                
                count++;
                i++;
            }
        }
        return count;
    }
    public boolean adj(char c1,char c2){
        
        return Math.abs(c1-c2)==1 || Math.abs(c1-c2)==0;
    }
}
