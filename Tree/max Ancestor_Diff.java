// Maximum Difference Between Node and Ancestor
// https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/

// t.c -> o(n^2)
  
class Solution {
    
    static int ans;
    
    public int maxAncestorDiff(TreeNode root) { // t.c -> o(n^2);
        
        ans=-1;
        solve(root);
        return ans;
    }
    public static void solve(TreeNode root){
        
        if(root==null)
            return;
        
        solve2(root,root.val);
        
        solve(root.left);
        solve(root.right);
    }
    public static void solve2(TreeNode root,int t){
        
        if(root==null)
            return ;
        
        ans=Math.max(ans,Math.abs(root.val-t));
        solve2(root.left,t);
        solve2(root.right,t);
    }
}

//-----------------------------------------------------------------------------------------------------------------------------------
//t.c -> o(n)
  
  class Solution {
    
    int ans = 0;
    
    public int maxAncestorDiff(TreeNode root) {

        dfs(root, root.val, root.val);

        return ans;
    }

    private void dfs(TreeNode node, int min, int max){
        
        if(node == null){
            return;
        }

        ans = Math.max(Math.max(Math.abs(min - node.val), Math.abs(max - node.val)), ans);
       
        max = Math.max(node.val, max);
        min = Math.min(node.val, min);

        dfs(node.left, min, max);
        dfs(node.right, min, max);
    }
}

// reduced code of above approach

public int maxAncestorDiff(TreeNode root) {
    return find(root, root.val, root.val);
}

private int find(TreeNode root, int min, int max){
    if( root == null ) return max-min;
    
    min = Math.min(min, root.val);
    max = Math.max(max, root.val);
    
    return Math.max(find(root.left, min, max), find(root.right, min, max));
    
}

/*----------------------------------------------------------------------------------------------------------------------------------------*/
// similar question on gfg with slight variation
// https://www.geeksforgeeks.org/problems/maximum-difference-between-node-and-its-ancestor/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Tree
{
    //Function to return the maximum difference between any 
    //node and its ancestor.
    static int ans;
    
    int maxDiff(Node root)
    {
        ans = Integer.MIN_VALUE;
        
        dfs(root.left,root.data);   // left
        dfs(root.right,root.data);  // right
        
        return ans;
    }
    public void dfs(Node root,int max){

        if(root == null){
            return;
        }

        ans = Math.max(max-root.data, ans);

        max = Math.max(root.data, max);
        

        dfs(root.left, max);
        dfs(root.right, max);
    }
}
