package com.ujjwal_Learning.BinaryTrees;

public class MinimumDepthOfBinaryTreeLeetcode111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;

		int L = minDepth(root.left), R = minDepth(root.right), m = Math.min(L, R);

		return 1 + (m > 0 ? m : Math.max(L, R));
	}

}
