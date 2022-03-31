package com.ujjwal_Learning.binaryTrees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversalLeetcode145 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private void helper(TreeNode root, List<Integer> post) {
		if (root == null)
			return;

		helper(root.left, post);
		helper(root.right, post);

		post.add(root.val);
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> post = new ArrayList<>();
		helper(root, post);
		return post;
	}

}
