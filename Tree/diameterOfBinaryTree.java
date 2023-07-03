// method 1st using O(n^2) solution.

class Solution {
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        
        max=Integer.MIN_VALUE;
        dim(root);
        return max;
        
    }
   public static void dim(TreeNode root){        // T.C == O(n^2)
       
        if(root==null)
        return ;
        
        int l=hight(root.left);
        int r=hight(root.right);
        
        max=Math.max(max,l+r);
        
        dim(root.left);
        dim(root.right);
    }
    public static int hight(TreeNode root){
        
        if(root==null)
        return 0;
        
        return Math.max(hight(root.left),hight(root.right))+1;
    }
}

// method 2 using O(N) solution

class Solution {
    static int mx;   // storing maximum
    public int diameterOfBinaryTree(TreeNode root) {
       
        // this question is similar to maximum sum subtree (see on codingninza )
         mx=Integer.MIN_VALUE;
         maxdim(root);
         return mx;
    }
    public static int maxdim(TreeNode root){
        
        if(root==null)
            return 0;
        
        int a=maxdim(root.left);
        int b=maxdim(root.right);
        
        mx=Math.max(mx,a+b);
        return Math.max(a,b)+1;
    }
}
