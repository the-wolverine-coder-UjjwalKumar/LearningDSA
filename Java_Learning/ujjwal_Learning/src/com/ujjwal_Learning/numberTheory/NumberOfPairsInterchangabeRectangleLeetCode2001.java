package com.ujjwal_Learning.numberTheory;

import java.util.HashMap;
import java.util.Map;

public class NumberOfPairsInterchangabeRectangleLeetCode2001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// rectangles = [[4,8],[3,6],[10,20],[15,30]]
		int[][] rec = { { 4, 8 }, { 3, 6 }, { 10, 20 }, { 15, 30 } };

		long ans = interchangeableRectangles(rec);
		System.out.println(ans);
	}

	public static long interchangeableRectangles(int[][] rectangles) {
		Map<Double, Long> hash = new HashMap<>();

		for (int i = 0; i < rectangles.length; i++) {
			Double tmp = (double) (rectangles[i][0] / (double) rectangles[i][1]);

			hash.put(tmp, hash.getOrDefault(tmp, 0L) + 1);
		}

		long ans = 0;
		for (Map.Entry<Double, Long> entry : hash.entrySet()) {
			if (entry.getValue() > 1) {
				Long n = entry.getValue();
				ans += (n * (n - 1)) / 2;
			}
		}

		return ans;
	}

	private static int gcd(int x, int y) {
		return x == 0 ? y : gcd(y % x, x);
	}

}
