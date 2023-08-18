// Construct tree from Inorder and LevelOrder
// see pepcoding vedio if not understand.
class GfG
{
    // this question contain DFS + BFS traveshal so we need to maintain levelorder array at each function call 
    // see pepcoding vedio if not understand.
  
    Node buildTree(int inorder[], int level[])
    {
        return BuildTree(level,inorder,0,level.length-1);
    }
    public static Node BuildTree(int[] levelOrder, int[] inorder, int start, int end) {

        if (start > end)
            return null;

        Node root = new Node(levelOrder[0]);
        if(levelOrder.length==1)
            return root;
            
        int pos=0;
        for(int i=start;i<=end;i++){
            if(inorder[i]==root.data){
                pos=i;
                break;
            }
        }
        HashSet<Integer>hs=new HashSet<>();  // hashset me inorder ka left store kar lenge right apne app mil jayega.
        for(int i=start;i<pos;i++)           // we are doing this because we need to create levelOrder left and levelOrder right at each function.
            hs.add(inorder[i]);
            
        int [] levelLeft=new int[pos-start]; // levelOrder Left ke liye
        int [] levelRight=new int[end-pos];  // levelOrder Right ke liye
        int l=0,r=0;
        for(int i=1;i<levelOrder.length;i++){
            
            int ele=levelOrder[i];
            if(hs.size()!=0 && hs.contains(ele)){
                levelLeft[l++]=ele;
                hs.remove(ele);
            }
            else
                levelRight[r++]=ele;
        }
        root.left = BuildTree(levelLeft, inorder, start, pos - 1);
        root.right = BuildTree(levelRight, inorder, pos + 1, end);
        
        return root;
    }
   
}
