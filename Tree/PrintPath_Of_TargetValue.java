// Paths from root with a specified sum (gfg ka question hai).
// https://practice.geeksforgeeks.org/problems/paths-from-root-with-a-specified-sum/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
// isme do tin variation ka question banta hai jaise root to leaf tak target hona chaiye etc
class Solution
{
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer>ll=new ArrayList<>();
        path(root,ans,ll,sum);
        return ans;
    }
    public static void path(Node root,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer>ll,int sum){
        
        if(root==null)
        return;
        
        ll.add(root.data);
        if(sum==root.data){
            ans.add(new ArrayList<>(ll));
        }
        
        path(root.left,ans,ll,sum-root.data);
        path(root.right,ans,ll,sum-root.data);
        
        ll.remove(ll.size()-1);
    }
}
