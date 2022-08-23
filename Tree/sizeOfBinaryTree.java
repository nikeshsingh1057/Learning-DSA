import java.util.Queue;
import java.util.*;
/* 
 *  count the Size of Binary Tree or total no. of Node
 */
public class SizeOfBinaryTree {

    class Node /* creation of node */
    {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public Node NodeCreat() /* adding element in tree node */
    {
        int data;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value" + " ");
        data = sc.nextInt();
        if (data == -1)
            return null;

        Node root = new Node(data);
        System.out.println("enter left child of" + " " + root.data);
        root.left = NodeCreat();

        System.out.println("enter right child of" + " " + root.data);
        root.right = NodeCreat();

        return root;
    }
    /*
     *  function to count the node.
     */
    public int countNode(Node root)
    {
        if(root==null)
        return 0;
        //return (countNode(root.left) +countNode(root.right)+1);
        int x=countNode(root.left)+1;
        int y=countNode(root.right);
        return x+y;
        
        
    }
    public static void main(String[] args) {
        
        SizeOfBinaryTree ss=new SizeOfBinaryTree();
        Node root= ss.NodeCreat();
        System.out.println(ss.countNode(root));
    }
}
