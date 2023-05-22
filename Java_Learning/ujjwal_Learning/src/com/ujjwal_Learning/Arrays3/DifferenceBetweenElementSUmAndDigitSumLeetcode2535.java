package com.ujjwal_Learning.Arrays3;

public class DifferenceBetweenElementSUmAndDigitSumLeetcode2535 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int differenceOfSum(int[] nums) {
		int elementSum = 0;
		int digitSum = 0;
		for (int i = 0; i < nums.length; i++) {
			elementSum += nums[i];
			digitSum += getDigitSum(nums[i]);
		}

		return Math.abs(elementSum - digitSum);
	}

	public int getDigitSum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n = n / 10;
		}

		return sum;
	}
}
