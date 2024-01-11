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
