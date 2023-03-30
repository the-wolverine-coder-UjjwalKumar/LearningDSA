package com.ujjwal_Learning.DP_theory;

public class ScrambledStringLeetcode87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isScramble(String s1, String s2) {
		if (s1 == null || s2 == null)
			return false;
		int m = s1.length();
		int n = s2.length();
		if (m != n)
			return false;

		boolean[][][] dp = new boolean[m][m][m + 1];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				dp[i][j][1] = s1.charAt(i) == s2.charAt(j);
			}
		}

		for (int k = 2; k <= m; k++) {
			for (int i = 0; i <= m - k; i++) {
				for (int j = 0; j <= m - k; j++) {
					dp[i][j][k] = false;
					for (int l = 1; l < k; l++) {
						if ((dp[i][j][l] && dp[i + l][j + l][k - l]) || (dp[i][j + k - l][l] && dp[i + l][j][k - l])) {
							dp[i][j][k] = true;
						}
					}
				}
			}
		}
		return dp[0][0][s1.length()];
	}

}
