import java.util.*;

/* 
 *  Check for balanced tree.
 */
public class checkBalancedTree {

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
     * check for balanced tree method 1 t.c o(n^2)
     */
    boolean isBalanced(Node root) {

        if (root == null)
            return true;
        int left = height(root.left);
        int right = height(root.right);
        return (Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }

    int height(Node root) {
        if (root == null)
            return 0;
        int x = height(root.left) + 1;
        int y = height(root.right) + 1;
        return Math.max(x, y);
    }
    /*
     *  method 2 o(n) solution
     */
    int BalancedNode(Node root)
    {
        if(root==null)
        return 0;

        int left_h=BalancedNode(root.left);
        if(left_h==-1) 
        return -1;

        int right_h=BalancedNode(root.right);
        if(right_h==-1) 
        return -1;

        if(Math.abs(left_h-right_h)>1)
        return -1;

        else{
            return Math.max(left_h, right_h)+1;
        }
    }

    public static void main(String[] args) {

        checkBalancedTree bb = new checkBalancedTree();
        Node root = bb.NodeCreat();

        //System.out.println(bb.isBalanced(root));
        System.out.println(bb.BalancedNode(root));
    }
}
