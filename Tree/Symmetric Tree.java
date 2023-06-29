// check tree is Symmetric Tree  or not
// logic of this question is same as question the same tree. 
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        return check(root,root);   // isme left and right do node bana denge. eak hee tree ka
    }
    public static boolean check(TreeNode p, TreeNode q){
        
        if(p==null && q==null) 
            return true;
        
        if((p!=null && q==null) || (p==null && q!=null))
            return false;
        
        if(p.val!=q.val)
            return false;
        
        if(check(p.left,q.right)==false || check(p.right,q.left)==false)
            return false;
       
        return true;
    }
}
