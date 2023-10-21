package com.ujjwal_Learning.dynamicProgramming2;

import java.util.Deque;
import java.util.LinkedList;

public class ConstraintSubsequenceSumLeetcode1425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int constrainedSubsetSum(int[] arr, int k) {
		int n = arr.length;
		int[] dp = new int[n];
		Deque<Integer> deque = new LinkedList<>();
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int max = Math.max(0, deque.isEmpty() ? 0 : dp[deque.peekFirst()]);
			dp[i] = arr[i] + max;
			ans = Math.max(ans, dp[i]);
			while (!deque.isEmpty() && dp[i] >= dp[deque.peekLast()]) { // If dp[i] >= deque.peekLast() -> Can discard
																		// the tail since it's useless
				deque.pollLast();
			}
			deque.addLast(i);
			if (i - deque.peekFirst() + 1 > k) { // remove the last element of range k
				deque.removeFirst();
			}
		}
		return ans;
	}

}
