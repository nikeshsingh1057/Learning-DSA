import java.util.*;
/* 
 *  Print yes if node follow children sum property
 */
public class childrenSumProterty {

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
     * function to implement children sum property using Queuq.
     */
    public int sumProperty(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        if(root==null||root.left==null && root.right==null) return 1;
        q.add(root);
        while(q.isEmpty()==false)
        {
            Node curr=q.poll();
            if((curr.left!=null && curr.right!=null) && (curr.data!=(curr.left.data+curr.right.data)) || (curr.left!=null && curr.right==null) &&(curr.data!=curr.left.data)||(curr.left==null && curr.right!=null) && ((curr.data!=curr.right.data)))
            return 0;
            
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        return 1;
    }
    /* 
     *  using simple recursion.
     */
    public boolean isSum(Node root)
    {
        if(root==null || root.left==null && root.right==null) return true;

        int sum=0;
        if(root.left!=null) sum+=root.left.data;
        if(root.right!=null) sum+=root.right.data;
        //if(root.data!=sum)
        // return false;
        // else{
        //     isSum(root.left);    /* this is also valid */
        //     isSum(root.right);
        // }
    
        // return true;
        return(root.data==sum && (isSum(root.left)&& isSum(root.right)));

    }
    public static void main(String[] args) {
        
        childrenSumProterty cc=new childrenSumProterty();
        Node root=cc.NodeCreat();

        //System.out.println(cc.sumProperty(root));
        System.out.println(cc.isSum(root));
    }

}
