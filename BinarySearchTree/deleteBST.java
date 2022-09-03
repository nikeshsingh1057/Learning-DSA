/* 
 *  deleting node or given key form binary search tree.
 */
public class deleteBST {

    class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

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
     *  function to implement Delete Node/ or given key to delete form binary search tree.
     */
    public Node DeleteNode(Node root, int key)
    {
        if(root==null)
            return root;
        
        if(key<root.data)
            root.left=DeleteNode(root.left, key);

        else if(key>root.data)
            root.right=DeleteNode(root.right, key);

        else 
        {
            if(root.left==null) 
                return root.right;

            if(root.right==null)
                return root.left;

            else{ /* swaping karenge agar root.left and root.right null nahi ho to */

                Node temp=MinValNode(root);
                root.data=temp.data;
                root.right=DeleteNode(root.right, temp.data);    
            }
        }
        return root;
    }
    public Node MinValNode(Node root)/*swaping karenge agar root.left and root.right null nahi ho to*/      
    {
        Node curr=root.right;
        while(curr!=null && curr.left!=null)
            curr=curr.left;
        
        return curr;
    }
     /* 
     *  traveshing tree node (indorder traveshal)
     */
    public void InorderTraveshal(Node root)
    {
        if(root==null)
        return;

        InorderTraveshal(root.left);

        System.out.print(root.data+ " ");

        InorderTraveshal(root.right);
    }
    public static void main(String[] args) {

        deleteBST dl = new deleteBST();

        Node root = dl.InsertIntoBST(dl.root, 50);

        dl.InsertIntoBST(root, 30);
        dl.InsertIntoBST(root, 70);
        dl.InsertIntoBST(root, 40);
        dl.InsertIntoBST(root, 60);
        dl.InsertIntoBST(root, 80);

        dl.InorderTraveshal(root);
        System.out.println();

        dl.DeleteNode(root, 50);  /* fn call to deleting node  */

        dl.InorderTraveshal(root);
    }
}
