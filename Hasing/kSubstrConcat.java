// https://www.geeksforgeeks.org/problems/check-if-a-string-is-repetition-of-its-substring-of-k-length3302/1
// Check if a string is repetition of its substring of k-length

class Solution
{
    int kSubstrConcat(int n, String s, int k) {
         
        if(n%k != 0) 
            return 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i+k<=n; i+=k){
            
            String chunk = s.substring(i, i+k);
            map.put(chunk, map.getOrDefault(chunk, 0)+1);
        }
        
        if(map.size() > 2) 
            return 0;
            
        int count = 0;
        
        for(String key : map.keySet()) {
            if(map.get(key) > 1) count++;
        }
        
        return count == 2 ? 0 : 1;
    }
}

// we need only two substring as mention in question
// so possible case if size of map is greater than 2 then return false. eg-> k=3 abcdefghi here 3 substring milega.
// 2nd case agar k=3 abcabcghi this is valid because here abc is 2 and ghi 1 so we overlape it 
// but this case is not valid ie k=3 abcabcghighi here abc frq=2 and ghi frq=2 so we cannot overlap completly.
