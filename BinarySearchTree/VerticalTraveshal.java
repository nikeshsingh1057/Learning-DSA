import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
/* 
 *  vertical traveshal of binary Tree.
 */
public class VerticalTraveshal {
    class Node {

        int data;
        Node left;
        Node right;

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
    /* 
     *  function to implement vertical traveshal.
     */
    public void VerticalTravesh(Node root, int hd,TreeMap<Integer,Integer> tm)
    {
        if(root==null)
        return;

        VerticalTravesh(root.left, hd-1, tm); //galat hai.

        if(tm.get(hd)==null)
        tm.put(hd,root.data);

        VerticalTravesh(root.right, hd+1, tm);
        
    }
    public static void main(String[] args) {

        TreeMap<Integer,Integer> mt=new TreeMap<>();

        VerticalTraveshal vt=new VerticalTraveshal();
        Node root= vt.NodeCreation();

        vt.VerticalTravesh(root, 0, mt);

        for(Entry<Integer, Integer> element:mt.entrySet())
            System.out.print(element.getValue()+ " ");
    }
}
