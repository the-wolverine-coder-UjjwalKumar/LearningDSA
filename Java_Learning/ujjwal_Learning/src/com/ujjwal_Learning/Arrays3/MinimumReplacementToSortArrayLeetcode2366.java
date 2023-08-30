package com.ujjwal_Learning.Arrays3;

public class MinimumReplacementToSortArrayLeetcode2366 {
	public static void main(String[] args) {

	}

	public long minimumReplacement(int[] nums) {
		long ret = 0L;
		int n = nums.length;
		int last = nums[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (nums[i] <= last) {
				last = nums[i];
				continue;
			}
			if (nums[i] % last == 0) {
				// split into nums[i] / last elements, operations cnt = nums[i] / last - 1;
				ret += nums[i] / last - 1;
			} else {
				// split into k elements operations cnt = k - 1;
				int k = nums[i] / last + 1; // ceil
				ret += k - 1;
				last = nums[i] / k; // left most element max is nums[i] / k
			}

		}

		return ret;
	}

}
