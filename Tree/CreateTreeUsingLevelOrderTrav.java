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

// ==================================="Another Way to Create Tree Using Level Order"----------------------------------------------------

import java.util.*;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Method to build the binary tree from a level-order array
    public void buildTreeFromLevelOrder(Integer[] levelOrder) {
        if (levelOrder.length == 0 || levelOrder[0] == null) {
            return;
        }

        root = new TreeNode(levelOrder[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < levelOrder.length) {
            TreeNode currentNode = queue.poll();

            if (levelOrder[i] != null) {
                currentNode.left = new TreeNode(levelOrder[i]);
                queue.add(currentNode.left);
            }
            i++;

            if (i < levelOrder.length && levelOrder[i] != null) {
                currentNode.right = new TreeNode(levelOrder[i]);
                queue.add(currentNode.right);
            }
            i++;
        }
    }

    // Method to perform a level-order traversal of the binary tree
    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            System.out.print(currentNode.data + " ");

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree();
        // Level-order array representation of the tree
        Integer[] levelOrder = {3, 9, 20, null, null, 15, 7};

        // Building the tree from the level-order array
        tree.buildTreeFromLevelOrder(levelOrder);

        // Performing level-order traversal to verify the tree
        System.out.println("Level order traversal of the binary tree:");
        tree.levelOrderTraversal();
    }
}
