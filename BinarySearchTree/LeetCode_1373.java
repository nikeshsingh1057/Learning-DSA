class Solution {  // similar to LeetCode 98 and Largest BST in tree (Leetcode_333).
    
    static int ans;
    public int maxSumBST(TreeNode root) {
        
        ans=0;
        ValidBst(root);
        return ans;
    }
    public static BstPair ValidBst(TreeNode root){

        if(root==null)
            return new BstPair();

        BstPair lbp =ValidBst(root.left); // lbp=left bst pair.
        BstPair rbp=ValidBst(root.right); // rbp=right bst pair
        BstPair sbp=new BstPair();
        
        sbp.max = Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.min = Math.min(lbp.min,Math.min(rbp.min,root.val));
        
        if(lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min >root.val){
            
            sbp.mxSum = lbp.mxSum + rbp.mxSum + root.val;
            sbp.isbst = true;
            ans=Math.max(ans,sbp.mxSum);
           
        }
        else{
            
            sbp.isbst=false;
            sbp.mxSum=Math.max(lbp.mxSum,rbp.mxSum);
        }

        return sbp;
    }
}

class BstPair{

    boolean isbst=true;
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    int mxSum=0;
}
