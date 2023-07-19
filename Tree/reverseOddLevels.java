// reverse Odd Levels
//https://leetcode.com/submissions/detail/998375424/

class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        
        HashMap<Integer,ArrayList<TreeNode>> hs=new HashMap<>();
        odd(root,0,hs);
        
        for(int key:hs.keySet()){
            
            int i=0,j=hs.get(key).size()-1;
            
            while(i<j){
                
                swap(hs.get(key).get(i), hs.get(key).get(j));
                i++;
                j--;
            }
        }
        return root;
    }
    
    public static void swap(TreeNode l ,TreeNode r){
         
        int t=l.val;
        l.val=r.val;
        r.val=t;
    }
    
    public static void odd(TreeNode root,int v,HashMap<Integer,ArrayList<TreeNode>> hs){
        
        if(root==null)
            return ;
        
        if(v%2==1){
            
            if(hs.containsKey(v)){
                hs.get(v).add(root);
            }
            else{
                ArrayList<TreeNode> ll=new ArrayList<>();
                ll.add(root);
                hs.put(v,ll);
            }
        }
      
        odd(root.left,v+1,hs);
        odd(root.right,v+1,hs);
        
    }
}
