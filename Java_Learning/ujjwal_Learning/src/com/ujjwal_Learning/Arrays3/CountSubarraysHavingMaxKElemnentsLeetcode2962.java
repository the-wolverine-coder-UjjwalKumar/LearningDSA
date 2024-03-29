package com.ujjwal_Learning.Arrays3;

public class CountSubarraysHavingMaxKElemnentsLeetcode2962 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public long countSubarrays(int[] nums, int k) {
		long res = 0;
		int max = 0, count = 0;
		for (int num : nums) {
			max = Math.max(max, num);
		}
		int l = 0;
		for (int r = 0; r < nums.length; r++) {
			if (nums[r] == max)
				count++;
			while (count >= k) {
				if (nums[l++] == max)
					count--;
			}
			res += l;
		}
		return res;
	}

}
