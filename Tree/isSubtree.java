// 572. Subtree of Another Tree
// https://leetcode.com/problems/subtree-of-another-tree/
// this question is based on return immediate if we get answer we do not further check if we get true.if uler wahi tak chalega jaha tak answer
// nahi mila ho jaise he answer mile to aage check nahi karna hai wahi se return kar dena hai.

// method 1.
class Solution {
    public boolean isSubtree(TreeNode t, TreeNode s) {
        
        if(t==null)
        return false;
        
        if(t.val==s.val){
            if(isIdentical(t,s))
                return true;
        }
        if(isSubtree(t.left,s) ||  isSubtree(t.right,s))
            return true;
        
        return false;
    }
    static boolean isIdentical(TreeNode root1, TreeNode root2)
	{
	    if(root1==null && root2==null)
	    return true;
	    
	    if(root1==null && root2!=null || root1!=null && root2==null)
	    return false;
	    
	    if(root1.val!=root2.val)
	    return false;
	    
	    if(isIdentical(root1.left,root2.left)==false || isIdentical(root1.right,root2.right)==false)
	    return false;
	    
	    return true;
	}
}

// method 2. same hai above ke trah bas return true me variation hai. ---------------------------------------------------------------------

class Solution {
    public boolean isSubtree(TreeNode t, TreeNode s) {
        
        if(t==null)
        return false;
        
        if(t.val==s.val){
            if(isIdentical(t,s))
                return true;
        }
        boolean f=isSubtree(t.left,s);
        if(f==true)
            return true;
        
        boolean f2=isSubtree(t.right,s);
        
        return f2;
    }
    static boolean isIdentical(TreeNode root1, TreeNode root2)
	{
	    if(root1==null && root2==null)
	    return true;
	    
	    if(root1==null && root2!=null || root1!=null && root2==null)
	    return false;
	    
	    if(root1.val!=root2.val)
	    return false;
	    
	    if(isIdentical(root1.left,root2.left)==false || isIdentical(root1.right,root2.right)==false)
	    return false;
	    
	    return true;
	}
}
