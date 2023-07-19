// delete Nodes 
// https://leetcode.com/problems/delete-nodes-and-return-forest/
class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        
        List<TreeNode> ans = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        
        for (int t : to_delete) 
            set.add(t);
        
        delete(root,set,ans);
        if(!set.contains(root.val))
            ans.add(root);
        
        return ans;
    }
    public TreeNode delete(TreeNode root,Set<Integer> hs, List<TreeNode> ans){
        
        if(root==null)
            return null;
        
        root.left=delete(root.left,hs,ans);
        root.right=delete(root.right,hs,ans);
        
        if(hs.contains(root.val)){
            
            if(root.left!=null)
                ans.add(root.left);
            if(root.right!=null)
                ans.add(root.right);
            return null;
        }
        return root;
    }
}
