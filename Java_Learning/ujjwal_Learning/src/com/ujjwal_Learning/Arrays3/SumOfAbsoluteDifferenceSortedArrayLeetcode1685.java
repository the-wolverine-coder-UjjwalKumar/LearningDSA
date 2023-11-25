package com.ujjwal_Learning.Arrays3;

public class SumOfAbsoluteDifferenceSortedArrayLeetcode1685 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int leftSum = prefix[i] - nums[i];
            int rightSum = prefix[n - 1] - prefix[i];

            int leftCount = i;
            int rightCount = n - 1 - i;

            int leftTotal = leftCount * nums[i] - leftSum;
            int rightTotal = rightSum - rightCount * nums[i];

            ans[i] = leftTotal + rightTotal;
        }

}
