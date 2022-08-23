import java.util.Scanner;
/*
 *  print the height of binary tree.
 */
class Node      /* creation of node */
{
    Node left;
    Node right;
    int data;
    Node(int data)
    {
        this.data=data;
    }
    static Node NodeCreation() /* adding element in tree node */
    {
        int data;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value"+" ");
        data=sc.nextInt(); 
        if(data==-1) return null;

        Node root=new Node(data);
        System.out.println("enter left child of"+" "+root.data);
        root.left=NodeCreation();
        System.out.println("enter right child of"+ " "+root.data);
        root.right=NodeCreation();

        return root;  
    }
    /* function to calculate height of tree */
    static int height(Node root)
    {
        if(root==null) return 0;

        int x=height(root.left)+1;
        int y=height(root.right)+1;
        return Math.max(x, y);
                                                                /* in one line */
        //else return Math.max(height(root.left), height(root.right))+1;
    }
   
}
public class HeightOfBinarytree {
    public static void main(String[] args) {
        
        Node root=Node.NodeCreation();
        System.out.println(Node.height(root));
    }
}
