/* 
 *  finding floor and ceil value in Binary search tree with given key.
 */
public class FloorVal {

    class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node root;

    public Node InsertIntoBST(Node root, int data) {

        if (root == null) // base case hai
        {
            return new Node(data);
        }

        if (data < root.data) {

            root.left = InsertIntoBST(root.left, data);
        } else {
            // if val > root.data;
            root.right = InsertIntoBST(root.right, data);
        }
        return root;
    }
    /*
     *  function to implement finding floor value.
     */
    public  Node FloorValue(Node root,int key)
    {
        if(root==null)
            return null;

        Node res=null;
        Node curr=root;
        while(curr!=null)
        {
            if(curr.data==key)
            {
                return curr;    
            }

            else if(key<curr.data) /* we get always smaller value in right side of Binary tree */
            curr=curr.left;

            else 
            {
                res=curr;
                curr=curr.right;
            }
        }
        return res;
    }
    /*
     *  function to implement ceil
     */
    public int ceilVal(Node root,int key)
    {
        if(root==null)
        return -1;

        int ceil=Integer.MIN_VALUE;
        while(root!=null)
        {
            if(root.data==key)
            return root.data;

            else if(key>root.data) /* we get always greater value in right side of Binary tree. */
            root=root.right;

            else 
            {
                ceil=root.data;
                root=root.left;
            }
        }
        return ceil;
    }
    public static void main(String[] args) {

        FloorVal ff = new FloorVal();

        Node root = ff.InsertIntoBST(ff.root, 10);
        ff.InsertIntoBST(root, 5);
        ff.InsertIntoBST(root, 15);
        ff.InsertIntoBST(root, 12);
        ff.InsertIntoBST(root, 30);

       Node ans=ff.FloorValue(root, 7);
       System.out.println(ans.data);

       System.out.println(ff.ceilVal(root, 16));
    }
}
