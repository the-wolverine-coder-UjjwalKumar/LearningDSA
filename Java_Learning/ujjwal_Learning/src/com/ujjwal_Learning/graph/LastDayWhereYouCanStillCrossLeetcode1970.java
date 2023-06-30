package com.ujjwal_Learning.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LastDayWhereYouCanStillCrossLeetcode1970 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

	public int latestDayToCross(int row, int col, int[][] cells) {
		int n = cells.length;
		int lo = 1, hi = n;
		while (lo < hi) {
			int mid = hi - ((hi - lo) >> 1);
			if (!hasValidPath(row, col, mid, cells))
				hi = mid - 1;
			else
				lo = mid;
		}
		return lo;
	}

	private boolean hasValidPath(int row, int col, int mid, int[][] cells) {
		int[][] board = new int[row][col];
		for (int[] b : board)
			Arrays.fill(b, 0);
		for (int day = 0; day < mid; ++day)
			board[cells[day][0] - 1][cells[day][1] - 1] = 1;
		Queue<int[]> q = new LinkedList<>();
		for (int c = 0; c < col; ++c) {
			if (board[0][c] == 0) {
				q.offer(new int[] { 0, c });
				board[0][c] = 1;
			}
		}
		while (!q.isEmpty()) {
			int[] p = q.poll();
			int x = p[0], y = p[1];
			if (x == row - 1)
				return true;
			for (int[] d : dirs) {
				int i = x + d[0], j = y + d[1];
				if (i < 0 || i >= row || j < 0 || j >= col || board[i][j] == 1)
					continue;
				board[i][j] = 1;
				q.offer(new int[] { i, j });
			}
		}
		return false;
	}

}
