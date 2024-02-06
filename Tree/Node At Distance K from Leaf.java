// Node at distance from leaf node
// https://www.geeksforgeeks.org/problems/node-at-distance/1

class Solution
{
    //Function to return count of nodes at a given distance from leaf nodes.
    int printKDistantfromLeaf(Node root, int k)
    {
        HashSet<Integer> hs=new HashSet<>();
        
        return solve(root,k,hs,0);
    }
    public static int solve(Node root,int k,HashSet<Integer> hs,int c){
        
        if(root==null)
            return 0;
        
        hs.add(c);
        if(root.left==null && root.right==null){
            
            if(hs.contains(c-k)){
                hs.remove(c-k);
                return 1;
            }
            return 0;
        }
        
        int a=solve(root.left,k,hs,c+1);
        int b=solve(root.right,k,hs,c+1);
        hs.remove(c);
        
        return a+b;
    }
}
