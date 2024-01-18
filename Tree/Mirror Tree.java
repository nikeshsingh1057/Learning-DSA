// Mirror Tree gfg
// https://leetcode.com/problems/invert-binary-tree/

class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node root) {
        
        if(root==null)
            return;
        
       
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
           
        
        mirror(root.left);
        mirror(root.right);
    }
}
// we can do also it by using inorder traveshal by putting data in queue and than during popping we swap 
// using level order traveshal Or using Queue method

class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            TreeNode ele = q.poll();
            if(ele==null)
                continue;
            TreeNode temp = ele.left;
            
            ele.left=ele.right;
            ele.right=temp;
            
            if(ele.left!=null)
                q.add(ele.left);
            
            if(ele.right!=null);
                q.add(ele.right);
        }
        return root;
    }
}
