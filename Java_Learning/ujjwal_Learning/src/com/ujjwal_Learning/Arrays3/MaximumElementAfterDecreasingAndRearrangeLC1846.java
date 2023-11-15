package com.ujjwal_Learning.Arrays3;

import java.util.Arrays;

public class MaximumElementAfterDecreasingAndRearrangeLC1846 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
		Arrays.sort(arr);
		int prev = 1;
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] > prev) {
				++prev;
			}
		}
		return prev;
	}

}
