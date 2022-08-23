import java.util.*;

/* 
 *  print left view of binary tree.
 */
public class LeftView {
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
     * Left view of Binary tree.
     * method 1 using level
     */
    static int maxLevel = 0; /* taking extra var. */

    public void Leftview1(Node root, int level) {
        if (root == null)
            return;

        if (maxLevel < level) {
            System.out.print(root.data + " ");
            maxLevel = level;
        }
        Leftview1(root.left, level + 1);
        Leftview1(root.right, level + 1);

    }

    /* right view using  Arraylist and level as seen above maxLevel method. */
    public ArrayList<Integer> leftView2(Node root)  /* to print right view ka code hai */
    {
        ArrayList<Integer> li=new ArrayList<>();

        if(root==null) return li;

        LeftviewCheck(li,root,0);
        return li;
    }
    public void LeftviewCheck(ArrayList<Integer> li,Node root, int level)
    {
        if(root==null) return;

        if(li.size()==level)
        li.add(root.data);

        LeftviewCheck(li,root.left, level+1);
        LeftviewCheck(li,root.right, level+1);
    }

    public static void main(String[] args) {

        LeftView ll = new LeftView();
        Node root = ll.NodeCreat();

        // ll.Leftview(root,1);
        System.out.println(ll.leftView2(root));
    }

}
