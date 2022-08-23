import java.util.Queue;
import java.util.*;
/*
 *  Level order travesal using Queue.
 */

public class LevelOrderTravesal
{
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
     * function to travesh node in level order
     */
    public void TraveshINLevelOreder(Node root)
    {
        Queue<Node> q = new LinkedList<Node>(); /* to store address of Node */

        if(root==null) return;
        q.add(root);
        //q.add(null);

        while(q.isEmpty()==false)
        //while(q.size()>1)    /* to print level order traveshal line by line */
        {
            Node curr=q.poll();
            // if(curr==null){
            //     System.out.println();       /* this code to print level order line by line. */
            //     q.add(null);
            //     continue;   /* continue is nessesery to avoid null pointer exception */
            // }
            System.out.printf(curr.data+ " ");
          
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);
        }
    }
    public static void main(String[] args) {
        
        LevelOrderTravesal ll=new LevelOrderTravesal();
        Node root=ll.NodeCreat();
        ll.TraveshINLevelOreder(root);
    }
    
}
