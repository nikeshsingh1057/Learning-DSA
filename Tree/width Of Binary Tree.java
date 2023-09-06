//  Maximum Width of Binary Tree_662
// https://leetcode.com/problems/maximum-width-of-binary-tree/

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
        Queue<pair> q=new ArrayDeque<>();
        q.add(new pair(root,1));
        int ans=-1;
        
        while(true){
            
            int size=q.size();
            List<Integer> ll=new ArrayList<>();
            if(size==0)
                break;
            while(size-- > 0){
                
                pair p=q.poll(); // ye root he hai isko bas que name de diye hai.
                TreeNode que=p.node;
                ll.add(p.idx);
                
                if(que.left != null)
                    q.add(new pair(que.left,p.idx*2));
                
                if(que.right != null)
                    q.add(new pair(que.right,p.idx*2+1));
            }
            ans=Math.max(ans,ll.get(ll.size()-1)-ll.get(0)+1);
        }
        return ans;
    }
}
class pair{
    
    TreeNode node;
    int idx;
    
    pair(TreeNode node,int idx){
        this.idx=idx;
        this.node=node;
    }
}
