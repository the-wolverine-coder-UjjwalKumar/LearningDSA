package com.ujjwal_Learning.BinaryTrees;

public class DeleteLeavesWithAGivenValueLeetcode1325 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode removeLeafNodes(TreeNode root, int target) {
		if (root == null) {
			return null;
		}
		TreeNode left = removeLeafNodes(root.left, target);
		TreeNode right = removeLeafNodes(root.right, target);
		if (left == null && right == null && root.val == target) {
			return null;
		}
		root.left = left;
		root.right = right;
		return root;
	}

}
