package com.ujjwal_Learning.binarySearch;

import java.util.Arrays;

public class MaximumTestinessOfCandiesAtMostKLeetcode2517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maximumTastiness(int[] price, int k) {
		Arrays.sort(price);
		int n = price.length;
		int lo = 0;
		int hi = price[n - 1] - price[0];

		while (lo < hi) {
			int mid = 1 + lo + (hi - lo) / 2; // + 1 to push mid to the right because the monotonicity is [T, T, T, F,
												// F] and we want the middle to be chosen right this way we cut hi down
			if (searchFunction(mid, price, k)) {
				lo = mid;
			} else {
				hi = mid - 1;
			}
		}

		return lo;
	}

	private boolean searchFunction(int target, int[] price, int k) {
		int prev = price[0];
		int c = 1;
		for (int i = 1; i < price.length; i++) {
			if (price[i] - prev >= target) {
				c++;
				prev = price[i];
			}
			if (c == k)
				return true;
		}
		return false;
	}

}
