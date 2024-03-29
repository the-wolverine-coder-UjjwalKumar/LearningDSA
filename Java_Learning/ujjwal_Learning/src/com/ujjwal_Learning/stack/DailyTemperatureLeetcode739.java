package com.ujjwal_Learning.stack;

import java.util.Stack;

public class DailyTemperatureLeetcode739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added solution to find out the daily temp. for next warmer day 
	public int[] dailyTemperatures(int[] temperatures) {
		final int m = temperatures.length;
		final int[] ans = new int[m];
		final Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < m; i++) {
			while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
				ans[stack.peek()] = i - stack.pop();
			}
			stack.push(i);
		}
		return ans;
	}

}
