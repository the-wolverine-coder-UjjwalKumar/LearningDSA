package com.ujjwal_Learning.maths;

public class DivideTwoIntegersLeetcode29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	// added leetcode solution
	public int divide(int dividend, int divisor) {
		if (dividend == Integer.MIN_VALUE && divisor == -1)
			return Integer.MAX_VALUE;
		if (dividend > 0 && divisor > 0)
			return divideHelper(-dividend, -divisor);
		else if (dividend > 0)
			return -divideHelper(-dividend, divisor);
		else if (divisor > 0)
			return -divideHelper(dividend, -divisor);
		else
			return divideHelper(dividend, divisor);
	}

	private int divideHelper(int dividend, int divisor) {
		// base case
		if (divisor < dividend)
			return 0;
		// get highest digit of divisor
		int cur = 0, res = 0;
		while ((divisor << cur) >= dividend && divisor << cur < 0 && cur < 31)
			cur++;
		res = dividend - (divisor << cur - 1);
		if (res > divisor)
			return 1 << cur - 1;
		return (1 << cur - 1) + divide(res, divisor);
	}

}
