// check two tree are same or not.
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        return check(p,q);
    }
    public static boolean check(TreeNode p, TreeNode q){
        
        if(p==null && q==null) 
            return true;
        
        if((p!=null && q==null) || (p==null && q!=null))
            return false;
        
        if(p.val!=q.val)
            return false;
        
        boolean flag=true;
        
        flag=check(p.left,q.left);    // checking left side.
        if(flag==false)
            return false;
        
        flag=check(p.right,q.right);  // checking right side.
        if(flag==false)  
            return false;
        return true;
    }
}

/// same code after removing redudent

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        return check(p,q);
    }
    public static boolean check(TreeNode p, TreeNode q){
        
        if(p==null && q==null) 
            return true;
        
        if((p!=null && q==null) || (p==null && q!=null))
            return false;
        
        if(p.val!=q.val)
            return false;
        
        if(check(p.left,q.left)==false || check(p.right,q.right)==false)
            return false;
       
        return true;
    }
}
