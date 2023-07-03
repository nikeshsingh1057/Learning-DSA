class Solution {
    
    public Node deletionBT(Node root, int key){
        
        Node k=Search(root,key);
        System.out.print(k.data+"* ");
        return k;
    }
    // search key in tree
    public static Node Search(Node root,int key){     // iss trah me uler half he chalega.
        if(root==null)
            return null;
        
        Node temp=null;               
        if(root.data==key)
            return root;
            
        temp=Search(root.left,key);
        if(temp!=null)
            return temp;
            
        temp=Search(root.right,key);
        return temp;
    }
}
