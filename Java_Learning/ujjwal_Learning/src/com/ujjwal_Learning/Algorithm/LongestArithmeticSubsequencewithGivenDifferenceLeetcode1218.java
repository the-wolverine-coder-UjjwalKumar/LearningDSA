package com.ujjwal_Learning.Algorithm;

import java.util.HashMap;
import java.util.Map;

public class LongestArithmeticSubsequencewithGivenDifferenceLeetcode1218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int longestSubsequence(int[] arr, int diff) {
		Map<Integer, Integer> map = new HashMap<>();
		int res = 1;
		for (int num : arr) {
			int prev = map.getOrDefault(num - diff, 0);
			map.put(num, prev + 1);
			res = Math.max(map.get(num), res);
		}
		return res;
	}

}
