// Construct Binary Search Tree from Preorder Traversal. leetcode_1008
// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
class Solution {
  
    static int index;
    public TreeNode bstFromPreorder(int[] preorder) {
        
        index = 0;
        
        int left=Integer.MIN_VALUE;
        int right=Integer.MAX_VALUE;
        
        return constructBST(preorder, left,right);
    }
    
    private TreeNode constructBST(int[] preorder, int left, int right) {
        
        if (index == preorder.length || preorder[index] < left || preorder[index] > right) {
            return null;
        }
    
        TreeNode root = new TreeNode(preorder[index++]);
        root.left = constructBST(preorder, left, root.val);    // passing left range
        root.right = constructBST(preorder, root.val, right);  // passing right range.
        
        return root;
    }
}
