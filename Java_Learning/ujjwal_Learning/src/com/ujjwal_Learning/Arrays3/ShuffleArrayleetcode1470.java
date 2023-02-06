package com.ujjwal_Learning.Arrays3;

public class ShuffleArrayleetcode1470 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] shuffle(int[] nums, int n) {
		int[] ans = new int[nums.length];
		int i = 0;
		int j = n;
		int k = 0;

		while (i < nums.length && j < nums.length) {
			ans[k] = nums[i];
			ans[k + 1] = nums[j];
			i++;
			j++;
			k += 2;
		}

		return ans;
	}
}
