import java.util.*;
/* 
 *  find the maximum element in binary tree
 */
public class MaximumElementInTree {

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
     *  function to find maximum.
     */
    public int findMax(Node root){
        if(root==null)
        return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
        
    }
    public static void main(String[] args) {
        
        MaximumElementInTree mm=new MaximumElementInTree();
        Node root=mm.NodeCreat();
        System.out.println(mm.findMax(root));

    }
}
