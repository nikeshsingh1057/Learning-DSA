import java.util.Scanner;
/* 
 *  user implementation of tree. (here node class is outside)
 */
class Node
{
    Node left;
    Node right;
    int data;
    Node(int data)
    {
        this.data=data;
    }
    static Node NodeCreation()
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
    static void preorderTravesh(Node root){
        
        if(root!=null) {
            System.out.print(root.data+ " ");
            preorderTravesh(root.left);
            preorderTravesh(root.right);
          }
    }
}

public class Implementation {
    public static void main(String[] args) {
        
        Node root=Node.NodeCreation();
        Node.preorderTravesh(root);
    }
}
