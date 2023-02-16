// 47. Permutations II
class Solution {
    public List<List<Integer>> permuteUnique(int[] arr) {

        // string wala permutations  ke trah he hai.
        Arrays.sort(arr);
        List<Integer> l1=new ArrayList<>();  // we add all array element in lq
        
        for(int ele:arr)
            l1.add(ele);
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        
       permutations(l1,ans,l2);
        return ans;
    }
    public static void permutations(List<Integer> l1,List<List<Integer>> ans, List<Integer> l2)
    {
        if(l1.size()==0)
        {
            ans.add(new ArrayList<>(l2));
        }
        for(int i=0;i<l1.size();i++)
        {
            if(i>0 && l1.get(i-1)==l1.get(i))    // note jab loop me i har bar 0 se chalta hai then iss case me dublicate hatane ke liye ye tarika hota hai (or nahi to i>idx lete hai jaise combination ke case me)
                continue;
          
            int num=l1.get(i);
            
            l2.add(num);
            l1.remove(i);      // removing index which one picked.
            
            permutations(l1,ans,l2);
            
            l2.remove(l2.size()-1);
            l1.add(i,num);       // inserting num that was removing 
        }
    }
}
