package com.ujjwal_Learning.kadanesAlgo;

public class MaximumSubarraySumLeetCode53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Leetcode solution daily 
	public int maxSubArray(int[] A) {
		int n = A.length;
		int[] dp = new int[n];// dp[i] means the maximum subarray ending with A[i] from 0 - A[i]
		dp[0] = A[0];
		int max = dp[0];

		for (int i = 1; i < n; i++) {
			dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
			max = Math.max(max, dp[i]);
		}

		return max;

	}

}
