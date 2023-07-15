// Maximum Binary Tree _654
// this question is similar to Construct Binary Tree from Preorder and Inorder Traversal

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return BuildTree(nums,0,nums.length-1);
    }
     public static TreeNode BuildTree(int[] arr, int start, int end) {

        if (start > end)
            return null;

        int max = -1;
        int division = 0;
        for(int i=start;i<=end;i++){
            
            if(arr[i]>max){
                max=arr[i];
                division=i;
            }
        }
        TreeNode root = new TreeNode(max);
         
        root.left = BuildTree(arr, start, division - 1);
        root.right = BuildTree(arr, division + 1, end);
         
        return root;
    }
}
