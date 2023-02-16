//46. Permutations
// https://leetcode.com/problems/permutations/description/

class Solution {
    public List<List<Integer>> permute(int[] arr) {

        // string wala permutations  ke trah he hai.

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
            int num=l1.get(i);
            
            l2.add(num);
            l1.remove(i);      // removing index which one picked.
            
            permutations(l1,ans,l2);
            
            l2.remove(l2.size()-1);
            l1.add(i,num);       // inserting num that was removing 
        }
    }
}
