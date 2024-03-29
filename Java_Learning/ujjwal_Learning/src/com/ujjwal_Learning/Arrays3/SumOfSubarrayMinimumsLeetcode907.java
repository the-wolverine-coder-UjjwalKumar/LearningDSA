package com.ujjwal_Learning.Arrays3;

import java.util.Stack;

public class SumOfSubarrayMinimumsLeetcode907 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// added solution sum of subarrays min
	public int sumSubarrayMins(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] dp = new int[A.length + 1];
        stack.push(-1);
        int result = 0, M = (int)1e9 + 7;
        for (int i = 0; i < A.length; i++) {
            while (stack.peek() != -1 && A[i] <= A[stack.peek()]) {
                stack.pop();
            }
            dp[i + 1] = (dp[stack.peek() + 1] + (i - stack.peek()) * A[i]) % M;
            stack.push(i);
            result += dp[i + 1];
            result %= M;
        }
        return result;
    }

}
