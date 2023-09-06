// Maximum path sum in Between two leaves of binary tree. (pepcoding tree playlist level 2 lecture 56).
/* isme path tabhi lenge jab kisi tree ke root.left null nahi ho and root.right null nahi ho. yani question ye hai ki agar tree ka left and 
tree ka right null nahi ho then path calculate karo and jo sabse jayda ho wahi answer hoga. */

/*                       -13
                       /       \
                     5           6
                   /   \        /
                  -8    1      3
                  /
                 2                                                  */
 /* now isme root node -13 and 5 ke liye path niklage and baki ke liye nahi niklega because -13 ka left and right null nahi hai but 6 path 
   nahi banega because 6 ka right null hai similary for -8 i.e -8 ka right null hai and same for all leaf node i.e 2,1,3 */

class Solution
{
    int maxPathSum(Node root)
    { 
        return maxPath_sum(root).LTLMaxsum;
    } 
    public static pair maxPath_sum(Node root){
        
        pair myAns=new pair();
        
        if(root==null)
            return myAns;
            
        if(root.left==null && root.right==null){
            myAns.NTLMaxsum=root.data;
            return myAns;
        }
        
        pair lp=maxPath_sum(root.left);
        pair rp=maxPath_sum(root.right);
        
        myAns.LTLMaxsum=Math.max(lp.LTLMaxsum,rp.LTLMaxsum);   // isme hume maximum path sum milta jayega i.e answer.
        
        // hume answer tabhi banayenge jab node ke left null nahi ho and rigth null nahi ho.
        if(root.left!=null && root.right!=null){
            myAns.LTLMaxsum=Math.max(myAns.LTLMaxsum,lp.NTLMaxsum+rp.NTLMaxsum+root.data);
        }
        myAns.NTLMaxsum=Math.max(lp.NTLMaxsum,rp.NTLMaxsum)+root.data;
        return myAns;
    }
}
class pair{
   
    int LTLMaxsum= -(int)1e9-1;  // Node to Node max sum i.e sabse jayada wala sum yani answer store karat jayega.
    int NTLMaxsum= -(int)1e9-1; // leaf to leaf max sum. ye maximum path store karege ke kis path se sabse jayada sum mil raha hai.
}
