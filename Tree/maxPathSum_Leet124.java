// Binary Tree Maximum Path Sum_124
// https://leetcode.com/problems/binary-tree-maximum-path-sum/

// metod 1st Brute force soultion T.C => O(n^2).
class Solution {
    
    static int ans;
    static int Pmax;
    
    public int maxPathSum(TreeNode root) {
        
        if(root.left==null && root.right==null)
            return root.val;
        
        Pmax=ans=Integer.MIN_VALUE;
        Travesh(root);
        return ans;
    }
    public static void Travesh(TreeNode root){
    
        if(root==null)
            return;
        
        int a=root.val;  ans=Math.max(a,ans);  // if Curr.Node is Maximum.
        int L=0;int R=0;
        
        if(root.left!=null){
            PathMax(root.left,0);
            L=Pmax;
            Pmax=Integer.MIN_VALUE;
        }
        
        if(root.right!=null){
            PathMax(root.right,0);
            R=Pmax;
            Pmax=Integer.MIN_VALUE;
        }
        
        ans=Math.max(L+R+a,ans);            // both L and R is Positive than it increase Maximum
        ans=Math.max(ans,Math.max(L,R)+a); // if one is Positeve and one is -ve than we do this.
// yani agar left se chota milta hai and right se bada milta hai then right lenge and ViceVersa.
        Travesh(root.left);
        Travesh(root.right);
    }
    // function for finding maximum.
    public static void PathMax(TreeNode root,int count){
        
        if(root==null)
        return;
        
        count+=root.val;
        Pmax=Math.max(Pmax,count);
        
        PathMax(root.left,count);
        PathMax(root.right,count);
    }
}

/*-----------------------------------------------------------------------------------------------------------------------------------------*/
// method 2nd.       (see below link for explation)
//https://leetcode.com/problems/binary-tree-maximum-path-sum/discuss/389609/Full-Explanation-article-with-pseudo-code-Beats-JAVA-100-time-and-100-space-Solution

public class Solution {
    
    int maxSum;;;
    public int maxSumHelper(TreeNode root) {
		
		// base case
        if (root == null) return 0; 
		
		// recursing through left and right subtree
        
        int leftMax = maxSumHelper(root.left);;;;;
        int rightMax = maxSumHelper(root.right);;;;;;

		// finding all the four paths and the maximum between all of them
        
        int maxRightLeft = Math.max(leftMax, rightMax);;;;;
        int maxOneNodeRoot = Math.max(root.val, (root.val + maxRightLeft));;;;
        int maxAll = Math.max(maxOneNodeRoot, leftMax + rightMax + root.val);;;;
		
		// Storing the result in the maxSum holder
        
        maxSum = Math.max(maxSum, maxAll);;;;
		
		// returning the value if root was part of the answer
        return maxOneNodeRoot;

    }

    public int maxPathSum(TreeNode root) {
        
        maxSum = Integer.MIN_VALUE;;;;
        maxSumHelper(root);;;;
        return maxSum; // as maxSum will always store the result

    }
}

// method 3rd using pair class pepcoding solution
class Solution {
    public int maxPathSum(TreeNode root) {
        
        return maxPath(root).NTN_MaxSum;
    }
    public static pairsum maxPath(TreeNode root){
        
        if(root==null)
            return new pairsum();
        
        pairsum lp=maxPath(root.left);
        pairsum rp=maxPath(root.right);
        
        pairsum myans=new pairsum();
        int RTN_mxsum=Math.max(lp.RTN_MaxSum,rp.RTN_MaxSum) + root.val;    // left righ me se jayada kon hoga uske liye.
        int NTN_mxsum= Get_maxsum(lp.NTN_MaxSum,rp.NTN_MaxSum,lp.RTN_MaxSum+rp.RTN_MaxSum+root.val,root.val,RTN_mxsum);
        
        myans.RTN_MaxSum=Math.max(RTN_mxsum,root.val);
        myans.NTN_MaxSum=NTN_mxsum;
        
        return myans;
    }
    // array ke madhayam se max nikalna.
    // isme eak bar me fix size ka array create kar leta jitan argument send karenge and uske basis par work karta hai ye eak tarh se array he hai.
    public static int Get_maxsum(int... arr){
        
        int maxsF=arr[0];  // store maximum among all.
        for(int ele:arr)
            maxsF=Math.max(maxsF,ele);
        return maxsF;
    }
}
class pairsum{
    
    int NTN_MaxSum =- (int)1e9;    // isme sabse largest path store hota jayega. i.e answer.
    int RTN_MaxSum=0;           // isme left ya right se jo path maximum aayega usko store karega                                      because wo further answer calculate karne ke kamm me aayega.
}
