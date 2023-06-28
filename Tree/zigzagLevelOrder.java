// Binary Tree Zigzag Level Order Traversal
// we use here two stack to solve this problem and a int level value to check the current level of value.
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root==null)
            return new ArrayList<>();
        
        Stack<TreeNode> mn =new Stack<>();   // main stack
        Stack<TreeNode> child =new Stack<>(); // child Stack
        mn.push(root);
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        
        int level=1;
        
        while(true){
            
            int size=mn.size();
            if(size==0)
				break;
            
            while(size-->0){
                
                root=mn.pop();
                ll.add(root.val);
                
                if(level%2==1){
                    
                    if(root.left!=null)
                        child.push(root.left);
                    if(root.right!=null)
                        child.push(root.right);
                }
                else{
                    
                     if(root.right!=null)
                        child.push(root.right);
                     if(root.left!=null)
                        child.push(root.left);
                }
            }
            level++;
            ans.add(ll);
            mn=child;
            child=new Stack<>();
            ll=new ArrayList<>();
        }
    
        return ans;
    }
}
