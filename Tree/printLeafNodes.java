// Print and remove leaf nodes of given Binary Tree on each iteration
// leetcode 366 (spent 4 hour on this question to solve ).
import java.util.*;

class Node
{
    Node left;
    Node right;
    int data;
    Node(int data)
    {
        this.data=data;
    }
    // addding element in tree using recursion.
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
}

public class demoTree {
    public static void main(String[] args) {
        
        Node root=Node.NodeCreation();    // adding element in tree.
       
        boolean searchDone=false; // initally making false.
        while(!searchDone){

            ArrayList<Integer> ll=new ArrayList<>();
            searchDone=leafnode(root, ll);           // if it return true than ! make it false and loop is break.
            System.out.println(ll);
        }
    }
    // function to Print and remove leaf nodes of given Binary Tree on each iteration
    public static boolean leafnode(Node root,ArrayList<Integer> ll)
    {
        if(root==null)
            return true;
        if(root.left==null && root.right==null){
            ll.add(root.data);
            return true;
        }
        boolean left=leafnode(root.left, ll);
        if(left)
            root.left=null;
        boolean right=leafnode(root.right, ll);
        if(right)
            root.right=null;
        return false;   // yaha se false return kiye hai take ye sirf leaf node ko null kare sare node ke left and right ko nahi.
    }
}

