package com.ujjwal_Learning.binaryTrees_2;

public class MaximumDepthOfBinarytreeLeetcode104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Added method to get maximum depth 
	// added leetocde daily solution
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

	}
}
