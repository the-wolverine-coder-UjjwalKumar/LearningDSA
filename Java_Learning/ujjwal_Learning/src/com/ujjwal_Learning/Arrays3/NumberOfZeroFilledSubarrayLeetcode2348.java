package com.ujjwal_Learning.Arrays3;

public class NumberOfZeroFilledSubarrayLeetcode2348 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public long zeroFilledSubarray(int[] nums) {
		long res = 0;
		for (int i = 0, j = 0; i < nums.length; ++i) {
			if (nums[i] != 0)
				j = i + 1;
			res += i - j + 1;
		}
		return res;
	}

}
