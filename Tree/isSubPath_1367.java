// 1367. Linked List in Binary Tree
// https://leetcode.com/problems/linked-list-in-binary-tree/
// isme jaha true mile wahi se retrun karwana hai uske aage nahi check karna hai (uler wala case hai.).

class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        
        return search(head,root);
        
    }
    public static boolean search(ListNode head,TreeNode root){
        
        if(root==null)
            return false;
        
        boolean f=false;
        if(head.val==root.val){
            
            f=path(head,root);
            if(f==true)
                return true;
        }
// aisa karne se uler half he chalega jaise usko answer milega aage nahi check karega.
        if(search(head,root.left) || search(head,root.right))
            return true;
        return false;
    }
    
    // this is for searching path
    public static boolean path(ListNode temp,TreeNode root){
        
        if(temp==null)
            return true;
        if(root==null || root.val!=temp.val)
            return false;
      
        if(path(temp.next,root.left) || path(temp.next,root.right))
            return true;
        return false;
    }
}
