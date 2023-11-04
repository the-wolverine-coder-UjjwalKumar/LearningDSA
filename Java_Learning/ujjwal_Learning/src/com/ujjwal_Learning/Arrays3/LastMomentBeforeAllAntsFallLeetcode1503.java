package com.ujjwal_Learning.Arrays3;

public class LastMomentBeforeAllAntsFallLeetcode1503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getLastMoment(int n, int[] left, int[] right) {
		int res = 0;
		for (int i : left)
			res = Math.max(res, i);
		for (int i : right)
			res = Math.max(res, n - i);
		return res;
	}

}
