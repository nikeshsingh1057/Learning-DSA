
import java.util.Scanner;

/* 
 *  implementation of tree 2nd method (by creating class inside main class)
 */
public class Implementmethod2 {

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

    public void preorderTravesh(Node root) {

        if (root != null) {
            System.out.print(root.data + " ");
            preorderTravesh(root.left);
            preorderTravesh(root.right);
        }
    }

    public static void main(String[] args) {

        Implementmethod2 imp = new Implementmethod2(); /* main class ka object creat kiye hai */
        Node root = imp.NodeCreation();
        imp.preorderTravesh(root);
    }
}
