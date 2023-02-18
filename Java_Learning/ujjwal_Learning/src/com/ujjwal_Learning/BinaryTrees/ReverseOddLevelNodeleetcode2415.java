package com.ujjwal_Learning.BinaryTrees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class ReverseOddLevelNodeleetcode2415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode reverseOddLevels(TreeNode root) {
		return invertOddLevelNodeInTree(root, 0);
	}

	private static TreeNode invertOddLevelNodeInTree(TreeNode root, int level) {
		if (root == null)
			return null;

		// will be using BFS, level by level order traversal
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();

			while (size-- > 0) {
				TreeNode currentNode = queue.poll();
				if (currentNode.left != null)
					queue.add(currentNode.left);
				if (currentNode.right != null)
					queue.add(currentNode.right);
			}
			level++;
			if (level % 2 != 0) {
				// means odd leve
				swap(queue);
			}

		}
		return root;

	}

	private static void swap(Queue<TreeNode> queue) {
		if (!queue.isEmpty()) {
			List<Integer> data = queue.stream().map(i -> i.val).collect(Collectors.toList());
			int j = data.size() - 1;
			for (TreeNode currentNode : queue) {
				currentNode.val = data.get(j);
				j--;
			}
		}
	}

}
