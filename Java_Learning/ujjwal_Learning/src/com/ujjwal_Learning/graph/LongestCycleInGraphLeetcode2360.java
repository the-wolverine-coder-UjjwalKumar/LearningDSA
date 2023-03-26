package com.ujjwal_Learning.graph;

import java.util.Arrays;

public class LongestCycleInGraphLeetcode2360 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int longestCycle(int[] edges) {
		int res = -1;
		int[][] memo = new int[edges.length][2];
		Arrays.fill(memo, new int[] { -1, -1 });

		for (int i = 0; i < edges.length; i++) {
			for (int j = i, dist = 0; j != -1; j = edges[j]) {
				int dist_i = memo[j][0];
				int from_i = memo[j][1];
				if (dist_i == -1) {
					memo[j] = new int[] { dist++, i };
				} else {
					if (from_i == i) {
						res = Math.max(res, dist - dist_i);
					}
					break;
				}
			}
		}
		return res;
	}

}
