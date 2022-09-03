import java.util.*;

/* 
 *  pair with given sum in BST (leet conde 653).
 */
public class PairSumWithkey {

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
        
        if(root==null)    
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
     *  function to implement pair sum.
     */
    static HashSet<Integer> s=new HashSet<>(); //for storing sum-k.
    public boolean isPair(Node root, int sum,HashSet<Integer> s)
    {
        if(root==null)
            return false;

        if(isPair(root.left, sum, s)==true)
            return true;
        
        if(s.contains(sum-root.data))
            return true;

        else 
            s.add(root.data);
        
        return isPair(root.right, sum, s);
    }
    public static void main(String[] args) {
        
        PairSumWithkey pp=new PairSumWithkey();

        Node root= pp.insertIntoBST(pp.root, 23);
        pp.insertIntoBST(root, 10);
        pp.insertIntoBST(root, 8);
        pp.insertIntoBST(root, 4);
        pp.insertIntoBST(root, 20);
        pp.insertIntoBST(root, 245);
        pp.insertIntoBST(root, 1);

        int sum=2;
        System.out.println(pp.isPair(root, sum, s));
    }
}
