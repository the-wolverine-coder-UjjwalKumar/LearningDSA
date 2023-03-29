package com.ujjwal_Learning.Arrays3;

import java.util.Arrays;

public class ReducingDishesLeetcode1402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxSatisfaction(int[] A) {
		Arrays.sort(A);
		int res = 0, total = 0, n = A.length;
		for (int i = n - 1; i >= 0 && A[i] > -total; --i) {
			total += A[i];
			res += total;
		}
		return res;
	}

}
