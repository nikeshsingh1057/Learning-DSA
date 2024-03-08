import java.util.*;

class TreeNode{
    
    int t;
    ArrayList<TreeNode> childern;
    TreeNode(int t){
        this.t=t;
        childern=new ArrayList<>();
    }
}
public class Main
{
	public static void main(String[] args) {
		
		TreeNode root =new TreeNode(5);
		TreeNode root1 =new TreeNode(51);
		TreeNode root2 =new TreeNode(15);
		TreeNode root3 =new TreeNode(4);
		TreeNode root4 =new TreeNode(40);
		TreeNode root5 =new TreeNode(48);
		
		root.childern.add(root1);
		root.childern.add(root2);
		root.childern.add(root3);
		root1.childern.add(root4);
		root1.childern.add(root5);
		
		//System.out.println(root.childern);
		display(root);
	}
	public static void display(TreeNode root){
	    
	    String s=root.t+"->";
	    for(int i=0;i<root.childern.size();i++){
	        s += root.childern.get(i).t+" ,";
	    }
	    System.out.println(s);
	    
	    for(int i=0;i<root.childern.size();i++){
	        display(root.childern.get(i));
	    }
	}
}
