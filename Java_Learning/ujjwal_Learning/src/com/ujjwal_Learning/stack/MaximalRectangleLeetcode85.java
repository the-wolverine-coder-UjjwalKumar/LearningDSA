package com.ujjwal_Learning.stack;

import java.util.Stack;

public class MaximalRectangleLeetcode85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maximalRectangle(char[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		int[] ht = new int[m];
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == '1')
					ht[j]++;
				else
					ht[j] = 0;
			}
			int area = largest(ht, m);
			max = Math.max(area, max);
		}
		return max;
	}

	public int largest(int[] heights, int n) {
		int max = 0;
		Stack<Integer> st = new Stack<>();
		st.push(0);
		int i;
		for (i = 1; i < n; i++) {
			while (!st.isEmpty() && heights[i] <= heights[st.peek()]) {
				max = lar(i, st, heights, max);
			}
			st.push(i);
		}

		while (!st.isEmpty()) {
			max = lar(n, st, heights, max);
		}
		return max;
	}

	public int lar(int i, Stack<Integer> st, int[] hts, int max) {
		int m = 0;
		int ht = hts[st.pop()];
		if (st.isEmpty())
			m = ht * i;
		else
			m = ht * (i - 1 - st.peek());
		return Math.max(m, max);
	}

}
