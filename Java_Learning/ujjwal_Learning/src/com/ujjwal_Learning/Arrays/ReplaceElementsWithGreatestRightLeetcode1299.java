package com.ujjwal_Learning.Arrays;

public class ReplaceElementsWithGreatestRightLeetcode1299 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] replaceElements(int[] arr) {
		int n = arr.length;
		int[] ans = new int[n];

		for (int i = n - 1; i >= 0; i--) {
			if (i + 1 == n) {
				ans[i] = -1;
			} else {
				if (arr[i + 1] > ans[i + 1]) {
					ans[i] = arr[i + 1];
				} else {
					ans[i] = ans[i + 1];
				}
			}
		}

		return ans;
	}
}
