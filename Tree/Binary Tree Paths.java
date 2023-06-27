// 257. Binary Tree Paths
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> ll=new ArrayList<>();
        path(root,ll,"");
        return ll;
    }
    public static void path(TreeNode root,List<String> ll,String str){
        
        if(root==null)
            return;
        
        if(root.left==null && root.right==null)
        {
            ll.add(str+root.val);
            return;
        }
        path(root.left,ll,str+root.val+"->");
        path(root.right,ll,str+root.val+"->");
        
    }
}
