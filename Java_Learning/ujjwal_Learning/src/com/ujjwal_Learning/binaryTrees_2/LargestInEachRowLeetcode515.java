package com.ujjwal_Learning.binaryTrees_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestInEachRowLeetcode515 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> largestValues(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<Integer> res = new ArrayList<Integer>();
		queue.add(root);
		int queueSize = root == null ? 0 : 1;
		while (queueSize > 0) {
			int largestElement = Integer.MIN_VALUE;
			for (int i = 0; i < queueSize; i++) {
				TreeNode cur = queue.poll();
				largestElement = Math.max(cur.val, largestElement);
				if (cur.left != null)
					queue.add(cur.left);
				if (cur.right != null)
					queue.add(cur.right);
			}
			res.add(largestElement);
			queueSize = queue.size();
		}
		return res;
	}

}
