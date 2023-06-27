// path from Root to a given target node. (interview bit).
// https://www.interviewbit.com/problems/path-to-given-node/

// method 1 
public class Solution {
    public int[] solve(TreeNode A, int B) {
        
        ArrayList<Integer> ll=path(A,B);
        
        int ans[]=new int[ll.size()];
        int j=0;
        for(int i=ll.size()-1;i>=0;i--)
            ans[j++]=ll.get(i);
      
        return ans;
    }
    public static ArrayList<Integer> path(TreeNode root,int b){
        if(root==null)
            return new ArrayList<>();
            
        if(root.val==b){
           ArrayList<Integer> ll=new ArrayList<>();
           ll.add(b);
           return ll;
        }
        ArrayList<Integer> ll=new ArrayList<>();
        ll=path(root.left,b);     // calling left child.
        if(ll.size()>0){
            ll.add(root.val);
            return ll;
        }
        ll=path(root.right,b);    // calling right child.
        if(ll.size()>0){
            ll.add(root.val);
            return ll;
        }
        return new ArrayList<>();
    }
}
//-------------------------------------------------------------------------------------------------------------------------------------
// method 2
public class Solution {
    static  ArrayList<Integer> ll;  // creating static arraylist.
    public int[] solve(TreeNode A, int B) {
        
        ll=new ArrayList<>(); 
        path(A,B);
      
        int ans[]=new int[ll.size()];
        int j=0;
        
        for(int i=ll.size()-1;i>=0;i--)
            ans[j++]=ll.get(i);
      
        return ans;
    }
    public static boolean path(TreeNode root,int target){
        
        if(root==null)      // agar root null ho 
            return false;
        
        if(root.val==target){         // agar hume first node he true mil jaye.
            ll.add(root.val);
            return true;
        }
        
        boolean left=path(root.left,target); // now left me check karo 
        if(left==true){
            ll.add(root.val);
            return true;
        }
        
        boolean right=path(root.right,target); // now right me check karo.
        if(right==true){
            ll.add(root.val);
            return true;
        }
        return false;
    }
}

