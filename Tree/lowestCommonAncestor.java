// Lowest Common Ancestor of a Binary Tree

class Solution {
    // hum isme done ka path pata karenge and jaha par path common nahi milega wahi LCA hoga.
    static ArrayList<TreeNode> p1; // path for p
    static ArrayList<TreeNode> p2; // path for q
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        p1=new ArrayList<>();
        p2=new ArrayList<>();
        
        Path_P(root,p);
        Path_Q(root,q);
        
        int i=p1.size()-1;
        int j=p2.size()-1;
    
        while(i>=0 && j>=0 && p1.get(i).val==p2.get(j).val){  
            i--; j--;
        }
        return p1.get(i+1);
    }
    // finding path for p
    public static boolean Path_P(TreeNode root,TreeNode p){
        
        if(root==null)
            return false;
        
        if(root.val==p.val){
            p1.add(root);
            return true;
        }
        
        boolean left=Path_P(root.left,p);
        if(left){
            p1.add(root);
            return true;
        }
        
        boolean right=Path_P(root.right,p);
        if(right){
            p1.add(root);
            return true;
        }
        return false;
    }
    // find path for q
    public static boolean Path_Q(TreeNode root,TreeNode q){
        
        if(root==null)
            return false;
        
        if(root.val==q.val){
            p2.add(root);
            return true;
        }
        
        boolean left=Path_Q(root.left,q);
        if(left){
            p2.add(root);
            return true;
        }
        
        boolean right=Path_Q(root.right,q);
        if(right){
            p2.add(root);
            return true;
        }
        return false;
    }
}
