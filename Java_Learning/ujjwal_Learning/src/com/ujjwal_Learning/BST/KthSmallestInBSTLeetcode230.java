package com.ujjwal_Learning.BST;

import java.util.Stack;

public class KthSmallestInBSTLeetcode230 {

	public static void main(String[] args) {
		
	}
	
	// added method to fetch kth smallest in BST
	public int kthSmallest(TreeNode root, int k) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = root;
		int cnt = 0;
		while (true) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				if (stack.isEmpty()) {
					break;
				}
				node = stack.pop();
				// inorder.add(node.val);
				cnt++;
				if (cnt == k)
					return node.val;
				node = node.right;
			}
		}
		return -1;
	}
}
