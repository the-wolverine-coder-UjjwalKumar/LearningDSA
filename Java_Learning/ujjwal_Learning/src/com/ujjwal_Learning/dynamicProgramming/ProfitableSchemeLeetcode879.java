package com.ujjwal_Learning.dynamicProgramming;

public class ProfitableSchemeLeetcode879 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private int mod = (int) 1e9 + 7;

	public int profitableSchemes(int G, int P, int[] group, int[] profit) {
		int[][] dp = new int[G + 1][P + 1];
		dp[0][0] = 1;
		for (int k = 1; k <= group.length; k++) {
			int g = group[k - 1];
			int p = profit[k - 1];
			for (int i = G; i >= g; i--) {
				for (int j = P; j >= 0; j--) {
					dp[i][j] = (dp[i][j] + dp[i - g][Math.max(0, j - p)]) % mod;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i <= G; i++) {
			sum = (sum + dp[i][P]) % mod;
		}
		return sum;
	}

}
