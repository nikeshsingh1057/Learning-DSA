// Binary Search Tree to Greater Sum Tree  ( Note leetcode par same name ke two question hai. )
// Convert BST to Greater Tree
//https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

class Solution {  // solved by mistake just checking for solution and got accepted.
    static int a;
    public TreeNode convertBST(TreeNode root) {
        
        a=0;
        convert(root);
        return root;
    }
    public static void convert(TreeNode root){
        
        if(root==null)
            return ;
        
        convert(root.right);
        
        root.val=a+root.val;
        a=root.val;
        
        convert(root.left);
        
    }
}
