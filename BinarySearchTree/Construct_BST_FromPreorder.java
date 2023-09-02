// Construct Binary Search Tree from Preorder Traversal. leetcode_1008
// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

// method 1st  T.C => O.N(n).
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

// method 2nd  T.C => O.N(n^2).

class Solution { // time complexity= O.N(n^2).
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root=null;
        
        for(int i=0;i<preorder.length;i++){
            
            root=bst_Preorder(root,preorder[i]);
        }
        return root;
    }
    public TreeNode bst_Preorder(TreeNode root,int value){
        
        if(root==null){
            root=new TreeNode(value);
            return root;
        }
        if(value<root.val)
            root.left=bst_Preorder(root.left,value);
        else
            root.right=bst_Preorder(root.right,value);
        
        return root;
    }
}
