// Validate Binary Search Tree _ LeetCode_98
// https://leetcode.com/problems/validate-binary-search-tree/
// we have to prove that the tree is Binary search tree or not .

// yaha hum range le ke karange  yani bst ke property se using min max at each level.

public class Solution {
    
	public boolean isValidBST(TreeNode root) {
        
		if(root == null) return true;
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE); //method overrride.
	}

	public boolean isValidBST(TreeNode node, long min, long max) {
        
		if(node == null) return true;
        
		if(node.val <= min || node.val >= max)//agar ye property fail ho jata hai to BST is not
            return false;
        
        if(isValidBST(node.left, min, node.val)==false || isValidBST(node.right, node.val, max)==false)
            return false;
		return true;
	}
}
