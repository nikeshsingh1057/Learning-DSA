//  Distribute Coins in Binary Tree

class Solution {

    int moves = 0;// Stores the minimum number of moves to make the tree coins to be balanced

    public int distributeCoins(TreeNode root) {

        return helper(root);
        //return moves;
    }

    public int helper(TreeNode root) {
                                     
        if (root == null)
            return 0;

        int coinsLeft = helper(root.left);
                                          
        int coinsRight = helper(root.right); 

        int coins = coinsLeft + coinsRight + root.val -1 ;     //(isme se root.val-1 hata do and niche uncomment kar do to vo chalega.)

        // if (root.val == 0) 
        //     coins -= 1;

        // else if (root.val == 1)
        //     coins += 0;

        // else 
        //     coins += root.val - 1;

        moves += Math.abs(coins);
                                
        return coins; // total coin ab tak ka.
    }
}
