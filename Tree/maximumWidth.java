import java.util.*;
import java.util.Queue;

/* 
 *  Maximum width of Binary tree.
 */
public class MaximumWidth {

    class Node 
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
     *  function to get maximum width
     */
    public int MaximumWith(Node root)
    {
        if(root ==null)
        return 0;

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int count=0;
        int width=0;
        while(q.size()>1)
        {
            Node curr=q.poll();
            if(curr==null)
            {
                width=Math.max(count, width);
                q.add(null);
                count=0;
                continue;
            }
            count++;
            if(curr.left!=null) q.add(curr.left);

            if(curr.right!=null) q.add(curr.right);
        }
        return Math.max(width, count);
    }
    public static void main(String[] args) {
        
        MaximumWidth mm=new MaximumWidth();
        Node root = mm.NodeCreat();

        System.out.println(mm.MaximumWith(root));
    }

}
