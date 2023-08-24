// 333. Largest BST Subtree
// logic of this question is Check this tree is bst or not .(pair class me just eak size add kar diye hai.)
// https://leetcode.ca/all/333.html  

public class Largest_BST_Subtree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int largestBSTSubtree(TreeNode root) {
			return ValidBST(root).size;
		}

		public BstPair ValidBST(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}
			BstPair lbp = ValidBST(root.left);
			BstPair rbp = ValidBST(root.right);
			BstPair sbp = new BstPair();
			sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
			sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
			if (lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val) {
				sbp.isbst = true;
				sbp.size = lbp.size + rbp.size + 1;

			} else {
				sbp.isbst = false;
				sbp.size = Math.max(lbp.size, rbp.size);
			}
			return sbp;
		}
	}

	class BstPair {
		boolean isbst = true;
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		int size = 0;

	}
}
