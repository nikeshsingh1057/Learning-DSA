import java.util.Scanner;

/* 
 *  fix a BST with two node swapeed.
 */
public class fixABST {

    class Node {

        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public Node NodeCreation() {

        int data;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value" + " ");
        data = sc.nextInt();
        if (data == -1)
            return null;

        Node root = new Node(data);
        System.out.println("enter left child of" + " " + root.data);
        root.left = NodeCreation();

        System.out.println("enter right child of" + " " + root.data);
        root.right = NodeCreation();

        return root;
    }

    public void InordarTravesh(Node root) {

        if (root != null) {
            InordarTravesh(root.left);
            System.out.print(root.data + " ");
            InordarTravesh(root.right);
        }

    }
    /* 
     *  function to implement fixing BST (or fing node where it not follow of rule for BST).
     */
    int count = 0;
    Node prev = null;
    Node temp = null;
    Node curr = null;

    public void recoverTree(Node root) {

        /* patakaro eak function banaye hai jisme root pass kiye hai */
        /* this solution is based on inordar traveshal */

        patakaro(root);

        int t = curr.data;
        curr.data = temp.data;
        temp.data = t;
    }

    public void patakaro(Node root) {
        if (root == null)
            return;

        patakaro(root.left);

        if (prev != null && prev.data >= root.data) {

            if (count == 0) {
                temp = prev;
                curr = root;
                ++count;

            } else if (count == 1) {
                curr = root;
                ++count;
                return;
            }
        }
        prev = root;
        patakaro(root.right);
    }

    public static void main(String[] args) {

        fixABST fi = new fixABST();

        Node root = fi.NodeCreation();

        fi.InordarTravesh(root);
        System.out.println();
        fi.recoverTree(root);
        fi.InordarTravesh(root);
    }
}
