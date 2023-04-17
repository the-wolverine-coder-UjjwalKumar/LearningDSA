package com.ujjwal_Learning.Arrays3;

public class MaximimPositiveNegativeNumberLeetcode2529 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maximumCount(int[] nums) {
		// lineary cout positive and negative using two pointers and return max
		// but we have given sorted hence we may apply BS to get first positive int
		// then compute the count for negative and positive

		// All negative or all positive. We can be sure that the larger number will be
		// array's length
		if (nums[0] > 0 || nums[nums.length - 1] < 0)
			return nums.length;

		// find 0
		int l = 0, r = nums.length - 1, mid;
		while (l < r) {
			mid = l + (r - l) / 2;
			if (nums[mid] < 0)
				l = mid + 1;
			else
				r = mid;
		}

		// currently, `l` is pointing to the left most position that nums[l] >= 0
		int neg = l;

		l = 0;
		r = nums.length;
		while (l < r) {
			mid = l + (r - l) / 2;
			if (nums[mid] > 0)
				r = mid;
			else
				l = mid + 1;
		}
		// This time, `l` is pointing to the left most position that nums[l] > 0
		int pos = nums.length - l;

		return Math.max(neg, pos);
	}
}
