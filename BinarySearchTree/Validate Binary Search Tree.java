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

// secnd way using pair class ( if not understand watch pepcoding levl 1 treePlaylist ).

class Solution { // Watch Pepcoding if not UnderStand Level_1 Playlist.
// this question is base of other question.
    public boolean isValidBST(TreeNode root) {
        
        return ValidBst(root).isbst;
    }
    public BstPair ValidBst(TreeNode root){

        if(root==null)
            return new BstPair();

        BstPair lbp =ValidBst(root.left); // lbp=left bst pair.
        BstPair rbp=ValidBst(root.right); // rbp=right bst pair
        BstPair sbp=new BstPair();
        
        sbp.max=Math.max(root.val,Math.max(lbp.max,rbp.max));
        sbp.min=Math.min(root.val,Math.min(lbp.min,rbp.min));

        sbp.isbst=lbp.isbst && rbp.isbst && root.val>lbp.max && root.val<rbp.min;
       
        return sbp;
    }
}
class BstPair{

    boolean isbst=true;
    long min=Long.MAX_VALUE;
    long max=Long.MIN_VALUE;
}
