import java.util.*;
/* 
 *  Binary Search Tree implementation.
 *  1.inserting element
 *  2.search in BST
 */
public class BSTiMplementation {

    class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    /* 
     *  Node creation or adding element in Tree using linklist.
     *  Inserting element in Binary search tree.
     */
    static Node root;  /* static root create kiye hai because direct call ho jayega. */

    public Node insertIntoBST(Node root, int data) {
        
        if(root==null)    // base case hai
        {
            Node temp=new Node(data);      //new node create karenge 
            return temp;
            
            //return new Node(data);       /* this return is also valid */
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
     *  traveshing tree node (indorder traveshal)
     */
    public void InorderTraveshal(Node root)
    {
        if(root==null)
        return;

        InorderTraveshal(root.left);

        System.out.print(root.data+ " ");

        InorderTraveshal(root.right);
    }
    /* 
     *  function to search key in element
     */
    public boolean SearchKey(Node root,int key)
    {
        if(root==null)
            return false;

        if(key==root.data)
            return true;

        if(key<root.data)
           return SearchKey(root.left, key);

        else 
           return SearchKey(root.right, key);
    }
    public static void main(String[] args) {
        
        BSTiMplementation bb=new BSTiMplementation();
        
        Node root = bb.insertIntoBST(bb.root, 5);
        bb.insertIntoBST(root, 1);
        bb.insertIntoBST(root, 3);
        bb.insertIntoBST(root, 4);
        bb.insertIntoBST(root, 2);
        bb.insertIntoBST(root, 7);

        bb.InorderTraveshal(root);  /* to travesh the tree */
        //System.out.println(bb.SearchKey(root, 5));


    }
}

