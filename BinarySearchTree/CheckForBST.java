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

/*--------------------------------------------------------------------------------------------------------------------------------------*/
// method 2 using pair class (monu bhaiya logic)
// https://leetcode.com/problems/validate-binary-search-tree/   Leetcode 98

class Solution { // monu bhaiya solution.
// this question is base of other question.
    public boolean isValidBST(TreeNode root) {
        
        return ValidBst(root).isbst;
    }
    public BstPair ValidBst(TreeNode root){

        if(root==null)
            return new BstPair();

        BstPair lbp =ValidBst(root.left); // lbp=left bst pair.
        BstPair rbp=ValidBst(root.right); // rbp=right bst pair
        BstPair sbp=new BstPair();
        
        sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.min=Math.min(root.val,Math.min(lbp.min,rbp.min));

        if(lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min >root.val)
            sbp.isbst=true;
        else
            sbp.isbst=false;
        
        return sbp;
    }
}
class BstPair{

    boolean isbst=true;
    long min=Long.MAX_VALUE;
    long max=Long.MIN_VALUE;
}



