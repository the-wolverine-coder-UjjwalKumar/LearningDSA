
package com.ujjwal_Learning.binaryTrees_2;

public class InvertedTreeLeetcode226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added recursive code to invert binary tree
	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode tmp = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(tmp);
		return root;
	}

}
