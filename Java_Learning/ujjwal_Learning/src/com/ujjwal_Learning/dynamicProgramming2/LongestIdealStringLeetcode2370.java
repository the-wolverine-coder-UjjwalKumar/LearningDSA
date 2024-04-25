package com.ujjwal_Learning.dynamicProgramming2;

public class LongestIdealStringLeetcode2370 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int longestIdealString(String s, int k) {
		int DP[] = new int[26], ans = 1;

		for (int ch = 0, n = s.length(); ch < n; ch++) {
			int i = s.charAt(ch) - 'a';
			DP[i] = DP[i] + 1;

			for (int j = Math.max(0, i - k); j <= Math.min(25, i + k); j++)
				if (j != i)
					DP[i] = Math.max(DP[i], DP[j] + 1);

			ans = Math.max(ans, DP[i]);
		}

		return ans;
	}

}
