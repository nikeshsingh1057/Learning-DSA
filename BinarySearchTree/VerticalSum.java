import java.util.Map.Entry;
import java.util.*;

/* 
 *  vertical sum in a Binary tree.
 */
public class VerticalSum {

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
     *  function to implement vertical sum.
     */
    public void verticalSum(Node root, int hd,TreeMap<Integer,Integer> t) /* hd=numbring 0,1,-1,-2 */
    {
        if(root==null)
        return;

        verticalSum(root.left, hd-1, t);

        int pSum =(t.get(hd))==null ? 0: t.get(hd);  /*pSum==present sum in treeMap at that hd position */
        t.put(hd, pSum+root.data);

        verticalSum(root.right, hd+1, t);
    }
    /* 
     *  main funciton. hai
     */
    public static void main(String[] args) {
        
        VerticalSum vv=new VerticalSum();
        Node root =vv.NodeCreation();

        TreeMap<Integer,Integer> t=new TreeMap<>(); /* mao create kiye hai. */
        vv.verticalSum(root, 0, t);

        /* to display element of tree  which is inputed in treeMap. */
        for(Entry<Integer, Integer> element:t.entrySet())
            System.out.print(element.getValue()+ " ");
    }
}
