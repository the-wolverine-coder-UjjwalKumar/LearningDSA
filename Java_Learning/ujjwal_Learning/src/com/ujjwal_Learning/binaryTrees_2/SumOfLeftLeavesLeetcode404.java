package com.ujjwal_Learning.binaryTrees_2;

public class SumOfLeftLeavesLeetcode404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int sum = 0;

	public int sumOfLeftLeaves(TreeNode root) {
		helper(root, false);
		return sum;
	}

	// added solution to find out the summation of left leaf nodes
	public void helper(TreeNode root, boolean isLeft) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			if (isLeft)
				sum += root.val;
		}
		helper(root.left, true);
		helper(root.right, false);
	}

}
