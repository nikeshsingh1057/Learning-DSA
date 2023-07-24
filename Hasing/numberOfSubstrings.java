//  Number of Substrings Containing All Three Characters  leet-1358 (a,b,c).
// Given a string s consisting only of characters a, b and c.

class Solution {
	public int numberOfSubstrings(String s) {
		int i=0, j=0;
		int count = 0;
		int n = s.length();

		HashMap<Character, Integer> map = new HashMap<>();
		while(j < s.length()){
            
			if(map.size() != 3){
                
				if(!map.containsKey(s.charAt(j))){
				   map.put(s.charAt(j), 1);
				}
				else{
					map.put(s.charAt(j), map.get(s.charAt(j))+1);
				}
			}
            // now we are reducing if it contain all lettors ans remove one by one letters
			while(map.size() == 3){
				count += n-j;
				char ch = s.charAt(i);
                
				if(map.get(ch) == 1){       // index out of bond se bachane ke liye.
					map.remove(ch);
				}
				else{
					map.put(ch, map.get(ch)-1);
				}
				i++;
			}

			j++;
		}
        
		return count;
	}
}

// 2nd method.

class Solution {
    public int numberOfSubstrings(String s) {
        
        int count[] = {0, 0, 0}, res = 0 , j = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            count[s.charAt(i) - 'a']++;
            
            while (count[0] > 0 && count[1] > 0 && count[2] > 0)
                count[s.charAt(j++) - 'a']--;
            
            res += j;
        }
        
        return res;
    }
}
