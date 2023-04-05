package com.ujjwal_Learning.binarySearch;

public class MinimizeMaximizeArrayLeetcode2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minimizeArrayValue1(int[] nums) {
		int res = 0, prefix = 0;
		for (int i = 0; i < nums.length; i++) {
			prefix += nums[i];
			res = Math.max(res, (int) Math.ceil((prefix + i) / (i + 1)));
		}
		return res;
	}

	public int minimizeArrayValue(int[] nums) {
		long minmax = 0, sum = 0;
		for (int i = 0; i < nums.length; ++i) {
			sum += nums[i];
			minmax = Math.max((sum + i) / (i + 1), minmax);
		}
		return (int) minmax;
	}
}
