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
