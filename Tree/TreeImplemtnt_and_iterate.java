/* 
 *  implementation  of tree and iteration on tree using preorder trversal
 */
class TreeNode
{
    TreeNode left;
    TreeNode right;
    int data;

    TreeNode(int data) {

        this.data=data;
    }
    static TreeNode root;     /* static liye hai. */
    static void BinaryTree()
    {
        TreeNode first=new TreeNode(10);
        TreeNode second=new TreeNode(20);
        TreeNode third=new TreeNode(30);
        TreeNode forth=new TreeNode(40);
        TreeNode fifth=new TreeNode(50);
        root=first;                   //connection of node.

        first.left=second;        
        first.right=third;   // second <----first ----> third
        second.left=forth;
        second.right=fifth;

    }
    static void preorderTravesh(TreeNode root){
        
        if(root!=null){
            System.out.print(root.data+ " ");
            preorderTravesh(root.left);
            preorderTravesh(root.right);
          }
        /*if(root==null) return;
                                                 // this is also applicable 
        System.out.print(root.data+ " ");
            preorderTravesh(root.left);
            preorderTravesh(root.right);*/
    }
}

class TreeImplement {
    public static void main(String[] args) {

        TreeNode.BinaryTree();
        TreeNode.preorderTravesh(TreeNode.root);
    }
}
