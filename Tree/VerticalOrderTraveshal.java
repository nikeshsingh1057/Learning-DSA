// Vertical Order Traveshal of Tree.
// type 1 if order is not matter when two or more node aline vertically.

class Solution {      // for submession code see on gfg.
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        Map<Integer, List<Integer>> hs=new TreeMap<>();
        Queue<pair> q=new ArrayDeque<>();
        q.add(new pair(root,0));
        
        while(q.size()!=0){
            
            int size=q.size();
            while(size-->0){
                
                pair rp = q.poll();      // rp=root pair.
                
                hs.putIfAbsent(rp.hl,new ArrayList<>()); // run only if key is absent.
                hs.get(rp.hl).add(rp.node.val);
                
            if(rp.node.left!=null)
                q.add(new pair(rp.node.left,rp.hl-1));
            
            if(rp.node.right!=null)
                q.add(new pair(rp.node.right,rp.hl+1));
            
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i:hs.keySet())
            ans.add(hs.get(i));
        return ans;
    }
}
class pair{
    
    TreeNode node;        // TreeNode store karna hai so TreeNode liye hai pair ko nahi.
    int hl;               // horizontal level
    
    pair(TreeNode node,int hl){    // constructor hai.
        this.node=node;
        this.hl=hl;
    }
}

// type 2. leetcode_987

