// All Nodes Distance K in Binary Tree
// https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        List<Integer> ll=new ArrayList<>(); 
        
        List<TreeNode> path=Node_to_path(root,target);
        
        for(int i=0;i<path.size();i++){
            
            // hume block karna hai current node ke previous wala ko path ke list me see.
            if(i==0)
                downward(path.get(i),k-i,ll,null);
            else
                downward(path.get(i),k-i,ll,path.get(i-1));     
        }
        return ll;
    }
    // node to root path pata kar lenge than waha se k distance easily find kar sakte hai.
    public static ArrayList<TreeNode> Node_to_path(TreeNode root,TreeNode target){
        
        if(root==null)
            return new ArrayList<>();
        
        ArrayList<TreeNode> ll=new ArrayList<>();
        
        if(root.val==target.val){
            ll.add(root);
            return ll;
        }
        
        ll=Node_to_path(root.left,target);
        if(ll.size()>0){
            ll.add(root);
            return ll;
        }
        
        ll=Node_to_path(root.right,target);
        if(ll.size()>0){
            ll.add(root);
            return ll;
        }
        
        return ll;
    }
    // searching downward k distance.
    public static void downward(TreeNode root, int k, List<Integer> ll,TreeNode blocker){
        
        if(root==null || k<0 || root==blocker)   // bocker mean uss tarf nahi jana hai.
            return ;
        
        if(k==0){
            ll.add(root.val);
        }
        
        downward(root.left,k-1,ll,blocker);
        downward(root.right,k-1,ll,blocker);
    }
}
