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

// method 2nd by converting tree into graph

class Solution {     // monu bhaiya solution class 18 april 2024  time 4:21 pm

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> graph[] = new ArrayList[501];
        for(int i=0;i<501;i++){
            graph[i]=new ArrayList<>();
        }
        
        buildGraph(root,graph);
        
        boolean visited[] = new boolean[501];
        
        Queue<Integer> q = new LinkedList<>();
        q.add(target.val);
        visited[target.val]=true;
        
        int c =0;
        
        while(!q.isEmpty()){
        
            int size = q.size();
        
            if(c==k){
                while(!q.isEmpty())
                    ans.add(q.poll());
                break;
            }
        
            c++;
            for(int i=0;i<size;i++){
                int rmv = q.poll();
                for(int j=0;j<graph[rmv].size();j++){
                    if(!visited[graph[rmv].get(j)]){
                        visited[graph[rmv].get(j)]=true;
                        q.add(graph[rmv].get(j));
                    }
                }
        
            }
        }
        return ans;
    }

    public void buildGraph(TreeNode root, ArrayList<Integer> graph[]){
        if(root==null){
            return;
        }
        if(root.left!=null){
            graph[root.val].add(root.left.val);
            graph[root.left.val].add(root.val);
        }
        if(root.right!=null){
            graph[root.val].add(root.right.val);
            graph[root.right.val].add(root.val);
        }
        buildGraph(root.left,graph);
        buildGraph(root.right,graph);
    }

}
