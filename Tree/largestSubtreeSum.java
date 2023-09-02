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

// Method 3rd using Pair class See on GfG

class Solution {
    
    public static int findLargestSubtreeSum(Node root) {
        
        return sum(root).ans;
    }
    public static pair sum(Node root){
        
        if(root==null)
            return new pair();
        
        pair left=sum(root.left);
        pair right=sum(root.right);
        
        int lrsum = left.p + right.p + root.data; // lrsum=left,right ka sum.
        
        pair curr=new pair();    // ye current node ka value set kar rahe hai vo aage evaluete hoga iske upper 
        
        int Ans = Get_maxsum(left.ans, right.ans, lrsum);
        
        curr.p=lrsum;
        curr.ans=Ans;    // isme humesa maximum aayega. because isko Get_maxsum se max nikal kar bhejwa rahe hai.
        
        return curr;
    }
    public static int Get_maxsum(int... arr){
        
        int maxsF=arr[0];  // store maximum among all.
        for(int ele:arr)
            maxsF=Math.max(maxsF,ele);
        return maxsF;
    }
}
class pair{
    
    int p = 0; // abhi tak me left and right se kitna sum aaya hai usko store kar ke rakhata hai.
    int ans = -(int)1e9;; // for stroing Largest subtree sum in a tree.
}
