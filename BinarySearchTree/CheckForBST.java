import java.util.ArrayList;
/* 
 *  check for BST (i.e it follow BST property) leetcode 98.
 */
public class CheckForBST {

    class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    static Node root;
    public Node insertIntoBST(Node root, int data) {
        
        if(root==null)    // base case hai
        {  
            return new Node(data);     
        }
        
        if(data<root.data)
        {
            root.left=insertIntoBST(root.left,data);
        }
        else
        {
            // if val > root.data;
            root.right=insertIntoBST(root.right,data);
        }
        return root;
    }
    /* 
     *  fn to check bst.
     */
    public boolean isValidBST(Node root) {
        
        ArrayList<Integer> ll=new ArrayList<>();
        
        ValidBST(root,ll);
        for(int i=1;i<ll.size();i++)
        {
            if(ll.get(i-1)>ll.get(i))
            return false;
        }
        return true;
    }
    public void ValidBST(Node root, ArrayList<Integer> ll)
    {
        if(root==null)
            return ;     /* also we can return ll form here if (root==null) and make void to ArrayList> */
        
        ValidBST(root.left,ll);
        
        ll.add(root.data);
        
        ValidBST(root.right,ll);

        //return ll;
    }

    public static void main(String[] args) {

        CheckForBST cc=new CheckForBST();

        Node root= cc.insertIntoBST(cc.root,20);
        cc.insertIntoBST(root,8);
        cc.insertIntoBST(root,30);
        cc.insertIntoBST(root,18);
        cc.insertIntoBST(root,35);

        System.out.println(cc.isValidBST(root));
    }
}
