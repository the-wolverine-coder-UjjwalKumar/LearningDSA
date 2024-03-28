package com.ujjwal_Learning.Arrays3;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestGoodSubArrayLeetcode2985 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxSubarrayLength(int[] arr, int k) {
		int ans = 0;
		int i = 0;
		int j = 0;

		Map<Integer, Integer> map = new HashMap<>();

		while (j < arr.length) {
			map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
			while (map.get(arr[j]) > k) {
				map.put(arr[i], map.get(arr[i]) - 1);
				i++;
			}
			ans = Math.max(j - i + 1, ans);
			j++;
		}
		return ans;
	}

}
