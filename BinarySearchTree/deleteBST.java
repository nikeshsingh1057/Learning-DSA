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

// method 2 similar to above method just for intution we past it agian here. 

class Solution { // monu bhaiya soultion.
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null)
            return null;

        if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else{
            if(root.left==null){ // this  if() and elseif() will valid for both single child node and leaf node. yani dono case handel ho jayega. do dry run for leaf node and single node 
                return root.right;
            }
            else if(root.right==null)
                return root.left;
            // if delete node left is not null and deleted node right is not null.
            // hum deleted ke left se maximum ya right se maxm se swap kar denge and maxm wale ko delete kar denge.
            else{
                int max=maxInBst(root.left);
                root.left=deleteNode(root.left,max);
                root.val=max;
            }
        }
        return root;
    }

    // maximum calculate karne ka function hai.
    public int maxInBst(TreeNode root){

        if(root==null)
            return Integer.MIN_VALUE;
        
        int right=maxInBst(root.right);
        return Math.max(root.val,right);
    }
}
// logic for if deleted node left is not null and deleted node right not null in that case we can either swap it value from :--
// current node se right me jakar ab left ka value se swap kar sakte hai. (yani jo sabse left me hoga ussase ).
// current node se left me jakar ab jo right ka value se swap kar sakte hai.(yani jo sabse right me hoga ussase).

/*                          15
                           /   \
                          10    20
                         /  \   /  \
                        5    12 17  33                      
              so we can only swap 15 with 12 or 17  i.e see in inorder tarvesahl 5,10,12,15,17,20,33
              hence 15 is replace by only 12 or 17.
*/
