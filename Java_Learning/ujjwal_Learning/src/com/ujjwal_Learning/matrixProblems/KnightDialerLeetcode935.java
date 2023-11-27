package com.ujjwal_Learning.matrixProblems;

import java.util.Arrays;

public class KnightDialerLeetcode935 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int knightDialer(int N) {
		int[][] map = new int[][] { { 4, 6 }, { 6, 8 }, { 7, 9 }, { 4, 8 }, { 0, 3, 9 }, {}, { 0, 1, 7 }, { 2, 6 },
				{ 1, 3 }, { 2, 4 } };
		int[][] memo = new int[N + 1][10];
		for (int i = 1; i <= N; i++) {
			Arrays.fill(memo[i], -1);
		}
		int result = 0;
		for (int i = 0; i < 10; i++) {
			result += helper(N, i, map, memo);
			result %= (int) 1e9 + 7;
		}
		return result;
	}

	private int helper(int N, int start, int[][] map, int[][] memo) {
		if (N == 1) {
			return 1;
		}
		if (memo[N][start] > -1) {
			return memo[N][start];
		}
		memo[N][start] = 0;
		for (int next : map[start]) {
			memo[N][start] += helper(N - 1, next, map, memo);
			memo[N][start] %= (int) 1e9 + 7;
		}
		return memo[N][start];
	}

}
