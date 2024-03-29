package com.ujjwal_Learning.Arrays3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class ErectAndFenceLeetcode587 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Added method to find outer trees
	public int[][] outerTrees(int[][] points) {
		if (points == null || points.length == 0)
			return new int[][] {};
		Arrays.sort(points, (x, y) -> x[0] == y[0] ? y[1] - x[1] : x[0] - y[0]);
		Stack<int[]> stack = new Stack<>();
		// scan from left to right find first part
		for (int i = 0; i < points.length; i++) {
			while (stack.size() >= 2 && crossProduct(stack.get(stack.size() - 2), stack.peek(), points[i]) > 0) {
				stack.pop();
			}
			stack.push(points[i]);
		}
		stack.pop();
		// scan from right to left find second part
		for (int i = points.length - 1; i >= 0; i--) {
			while (stack.size() >= 2 && crossProduct(stack.get(stack.size() - 2), stack.peek(), points[i]) > 0) {
				stack.pop();
			}
			stack.push(points[i]);
		}
		Set<int[]> set = new HashSet<>(stack);
		Iterator<int[]> iterator = set.iterator();
		int[][] ans = new int[set.size()][2];
		for (int i = 0; i < set.size(); i++)
			ans[i] = iterator.next();
		return ans;
	}

	// if result >0 then q-o located in counterclockwise direction of p-0
	private int crossProduct(int[] o, int[] p, int[] q) {
		return (p[1] - o[1]) * (q[0] - o[0]) - (q[1] - o[1]) * (p[0] - o[0]);
	}

}
