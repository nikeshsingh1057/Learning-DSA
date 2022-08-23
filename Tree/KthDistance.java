import java.util.ArrayList;
import java.util.Scanner;

/* 
 *  Print Node at Kth distance.
 */
public class kthDistance {

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
     * function to implement kth node
     */
    public void kth(Node root, int k) {

        if (root == null)
            return;

        if (k == 0)
            System.out.print(root.data + " ");
        else {
            kth(root.left, k - 1);
            kth(root.right, k - 1);
        }

    }

    public static void main(String[] args) {

        kthDistance th = new kthDistance();
        Node root = th.NodeCreat();
        th.kth(root, 1);
    }
}
