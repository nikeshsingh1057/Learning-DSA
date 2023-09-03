// Step-By-Step Directions From a Binary Tree Node to Another
// https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/
// similar approch to find common lca
class Solution {
    
    public String getDirections(TreeNode root, int startValue, int destValue) {
        
    	ArrayList<Character> p1=path(root, startValue);
    	ArrayList<Character> p2=path(root, destValue);
		 
	int i=p1.size()-1;
	int j=p2.size()-1;
		
	while(i>=0 && j>=0 && p1.get(i)==p2.get(j)) { // removing common
		i--;
		j--;
	}
        String ans="";
        while(i>0){
            ans+="U";
            i--;
        }
        while(j>0){
            ans+=p2.get(j);
            j--;
        }
        return ans;
    }
    public static ArrayList<Character> path(TreeNode root,int b){
        
        if(root==null)
            return new ArrayList<>();
            
        if(root.val==b){
           ArrayList<Character> ll=new ArrayList<>();
           ll.add('*');
           return ll;
        }
        ArrayList<Character> ll=new ArrayList<>();
        
        ll=path(root.left,b);     // calling left child.
        if(ll.size()>0){
            ll.add('L');
            return ll;
        }
        
        ll=path(root.right,b);    // calling right child.
        if(ll.size()>0){
            ll.add('R');
            return ll;
        }
        return new ArrayList<>();
    }
}
