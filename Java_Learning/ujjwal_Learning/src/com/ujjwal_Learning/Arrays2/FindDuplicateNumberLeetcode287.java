package com.ujjwal_Learning.Arrays2;

public class FindDuplicateNumberLeetcode287 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findDuplicate(int[] nums) {
		for (int n : nums) {
			if (nums[Math.abs(n)] < 0) {
				return Math.abs(n);
			} else {
				nums[Math.abs(n)] *= -1;
			}
		}
		return -1;
	}

}
