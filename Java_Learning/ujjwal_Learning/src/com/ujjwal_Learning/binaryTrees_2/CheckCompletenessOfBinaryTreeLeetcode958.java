package com.ujjwal_Learning.binaryTrees_2;

import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessOfBinaryTreeLeetcode958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isCompleteTree(TreeNode root) {
		boolean end = false;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		// after we encounter any null node, we don't expect to have further valid node
		// so once null encunter all after it all must be null
		while (!queue.isEmpty()) {
			TreeNode cur = queue.poll();

			if (cur == null)
				end = true;
			else {
				if (end)
					return false;

				queue.add(cur.left);
				queue.add(cur.right);
			}

		}
		return true;
	}

}
