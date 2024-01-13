// Cousins in Binary Tree II_2641
// https://leetcode.com/problems/cousins-in-binary-tree-ii/

class Solution {    // own (only hint seen).
    
    public TreeNode replaceValueInTree(TreeNode root) {
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        sumAtLevel(root,0,hs);
        
        //System.out.print(hs);
        Update(root,1,hs);
        root.val=0;
        return root;
    }
    // calculation sum at each level.
    public static void sumAtLevel(TreeNode root,int c,HashMap<Integer,Integer> hs){
        
        if(root==null)
            return;
        
        hs.put(c,hs.getOrDefault(c,0)+root.val);
        sumAtLevel(root.left,c+1,hs);
        sumAtLevel(root.right,c+1,hs);
    }
    // updating value at each node it they are cousions.
    public static void Update(TreeNode root,int c,HashMap<Integer,Integer> hs){
        
        if(root==null || c>=hs.size())  // c ko 1 se start  kiye hai so last wale node se pahele he return karna hai nahi to null pointer exception dega.
            return;
        
        TreeNode l=null,r=null; // l,r ->left and right
        int ls=0,rs=0;      // ls->leftsum, rs->rightsum
        
        if(root.left!=null){
            l=root.left;
            ls=root.left.val;
        }
        if(root.right!=null){
            r=root.right;
            rs=root.right.val;
        }
        int totSum = hs.get(c);     // total sum at each level.
        int rem= totSum-(ls+rs);    // remaining sum after removing siviling
        if(l!=null)
            l.val=rem;
        if(r!=null)
            r.val=rem;
        
        Update(root.left,c+1,hs);
        Update(root.right,c+1,hs);
        
    }
}
