package com.ujjwal_Learning.binaryTrees_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class EvenOddTreeLeetcode1609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isEvenOddTree(TreeNode root) {
		Map<Integer, List<Integer>> levelOrder = new HashMap<>();
		levelOrderTraversal(root, levelOrder, 0);
		for (Map.Entry<Integer, List<Integer>> entry : levelOrder.entrySet()) {
			List<Integer> values = entry.getValue();
			int n = values.size();
			if (entry.getKey() % 2 == 0) {
				if (values.get(0) % 2 == 0) {
					return false;
				}
				for (int i = 1; i < n; i++) {
					if (values.get(i) % 2 == 0 || values.get(i - 1) >= values.get(i)) {
						return false;
					}
				}
			} else {
				if (values.get(0) % 2 == 1) {
					return false;
				}
				for (int i = 1; i < n; i++) {
					if (values.get(i) % 2 == 1 || values.get(i - 1) <= values.get(i)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	private void levelOrderTraversal(TreeNode node, Map<Integer, List<Integer>> map, int level) {
		if (node != null) {
			if (!map.containsKey(level)) {
				map.put(level, new ArrayList<>());
			}
			map.get(level).add(node.val);
			levelOrderTraversal(node.left, map, level + 1);
			levelOrderTraversal(node.right, map, level + 1);
		}
	}

	public static boolean isEvenOddTree1(TreeNode root) {
		if (root == null)
			return true;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int level = 0;

		while (!queue.isEmpty()) {
			int size = queue.size();
			int val;
			if (level % 2 == 0) {
				val = Integer.MIN_VALUE;
			} else {
				val = Integer.MAX_VALUE;
			}
			for (int i = 0; i < size; i++) {
				TreeNode currNode = queue.poll();

				if (currNode != null) {
					if (level % 2 == 0) {
						// even level , odd number & inc order
						if (currNode.val % 2 == 0 || val >= currNode.val)
							return false;

					} else {
						// odd level , even number & dec order
						if (currNode.val % 2 != 0 || val <= currNode.val)
							return false;
					}

					val = currNode.val;

					if (currNode.left != null)
						queue.add(currNode.left);
					if (currNode.right != null)
						queue.add(currNode.right);
				}

			}
			level++;
		}

		return true;

	}

}
