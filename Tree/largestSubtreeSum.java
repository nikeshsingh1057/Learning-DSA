// Largest sub-tree sum
// method 1
// https://www.codingninjas.com/studio/problems/largest-sub-tree-sum_920400?leftPanelTab=0

public class Solution {
    static int ans;
    public static int largestSubtreeSum(TreeNode<Integer> root) {
        ans=Integer.MIN_VALUE;
        sum(root);
        return ans;
    }
    public static int sum(TreeNode<Integer> root){

        if(root==null)
        return 0;
        
        if(root.left==null && root.right==null){
            ans=Math.max(ans,root.data);
            return root.data;
        }
        int a=sum(root.left);
        int b=sum(root.right);

        ans=Math.max(ans,a+b+root.data);
        return a+b+root.data;
    }
}

// method 2
public class Solution {
    static int ans;
    public static int largestSubtreeSum(TreeNode<Integer> root) {
        ans=Integer.MIN_VALUE;
        sum(root);
        return ans;
    }
    public static int sum(TreeNode<Integer> root){

        if(root==null)
        return 0;
        
       
        int a=sum(root.left);
        int b=sum(root.right);
       
        ans=Math.max(ans,a+b+root.data);
        return a+b+root.data;
    }
}
