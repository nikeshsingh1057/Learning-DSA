// Clone a Binary Tree (only left and right node is given).

public static Node clone(Node root){

        if(root==null)
            return null;
        
        Node head=new Node(root.data);             
        head.left=clone(root.left);
        head.right=clone(root.right);             
        return head;                               // new clone tree ka head hai i.e main root hai.
    }


// clone a bianry tree valiration of avobe question (here left,right and random node is given)
// https://practice.geeksforgeeks.org/problems/clone-a-binary-tree/1                  (gfg qestion link).

class Solution{
    public Tree cloneTree(Tree root){
        
       Tree t=clone(root);
    
       return t;
     }
     public static Tree clone(Tree root){
         
         if(root==null)
            return null;
        
        Tree head=new Tree(root.data);
        head.left=clone(root.left);
        head.right=clone(root.right);
        
        if(root.random!=null ) 
            head.random=new Tree(root.random.data);
        
        // head.random = tree.random;    ye bhee work karega agar if case remove kar diye to.
        return head;
     }
}
