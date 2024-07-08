                            /* Create Tree using Level Order Traveshal */

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    
    int value;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}


class Main {
    
    public static TreeNode createTree(int[] arr) {
        
        if (arr == null || arr.length == 0) 
            return null;
        
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        
        while (index < arr.length) {
            
            TreeNode current = queue.poll();
            // Add left child
            if (index < arr.length) {
                current.left = new TreeNode(arr[index++]);
                queue.add(current.left);
            }
            // Add right child
            if (index < arr.length) {
                current.right = new TreeNode(arr[index++]);
                queue.add(current.right);
            }
        }
        return root;
    }
    // print tree after creation.
    public static void printTree(TreeNode root) {
        
        if (root == null) 
            return;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            
            TreeNode current = queue.poll();
            
            System.out.print(current.value + " ");
            
            if (current.left != null) 
                queue.add(current.left);
                
            if (current.right != null) 
                queue.add(current.right);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root = createTree(arr);
        printTree(root); 
    }
}
