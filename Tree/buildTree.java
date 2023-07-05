// Construct Binary Tree from Preorder and Inorder Traversal
//method 1st using hashmap O(n) soltuion

class Solution {
    
    static HashMap<Integer, Integer> mp = new HashMap<>();
    static int preIdx;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        
        for (int i = 0; i < n; i++) {
            mp.put(inorder[i], i);
        }
        
        preIdx = 0;
        return build(preorder, 0, n - 1);
    }

    public TreeNode build(int[] pre, int inStrt, int inEnd) {
        
        if (inStrt > inEnd) return null;

        int curr = pre[preIdx++];
        TreeNode node = new TreeNode(curr);
      

        int inIdx = mp.get(curr); // getting index from hashMap for inorder right left pso.

        node.left = build(pre, inStrt, inIdx - 1);
        node.right = build(pre, inIdx + 1, inEnd);

        return node;
    }
}

// method 2 using without space based on divide and concour.

class Solution {
    static int PreIdx;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        PreIdx=0;
        return BuildTree(preorder,inorder,0,preorder.length-1);
    }
    public static TreeNode BuildTree(int[] preorder, int[] inorder, int start, int end) {

        if (start > end)
            return null;

        TreeNode root = new TreeNode(preorder[PreIdx++]);

        int pos=0;
        for(int i=start;i<=end;i++){
            if(inorder[i]==root.val){
                pos=i;
                break;
            }
        }
        root.left = BuildTree(preorder, inorder, start, pos - 1);
        root.right = BuildTree(preorder, inorder, pos + 1, end);
        return root;
    }
}
