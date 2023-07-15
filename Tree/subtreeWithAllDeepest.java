//  Lowest Common Ancestor of Deepest Leaves OR  Smallest Subtree with all the Deepest Nodes
//  method 1st.
class Solution {
    
    static int max;
    static TreeNode ans;
    
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        
        max=-1;
        ans=null;
        deepnode(root,0);
        return ans;
    }
    public static int deepnode(TreeNode root,int hight){
        
        if(root==null)
            return hight;
        
        int left=deepnode(root.left,hight+1);
        int right=deepnode(root.right,hight+1);
        
        if(left==right){
            
            //max=Math.max(left,max);
            if(left>=max){
                max=left;
                ans=root;
            }
        }
        return Math.max(left,right);
    }
}

// method 2nd.

class Solution {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        
        if(root==null)
            return null;
        
        int left_h=hight(root.left);
        int right_h=hight(root.right);
        
        if(left_h==right_h)
            return root;
        else{
            if(left_h>right_h)
                return subtreeWithAllDeepest(root.left);
            else
                return subtreeWithAllDeepest(root.right);
        }
        
    }
    public static int hight(TreeNode root){
        
        if(root==null)
            return 0;
        return Math.max(hight(root.left),hight(root.right))+1;
    }
}
