package com.ujjwal_Learning.binarySearch;

import java.util.Arrays;

public class MinimizeMaximizeDifferenceLeetcode2616 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minimizeMax(int[] A, int p) {
		Arrays.sort(A);
		int n = A.length, left = 0, right = A[n - 1] - A[0];
		while (left < right) {
			int mid = (left + right) / 2, k = 0;
			for (int i = 1; i < n && k < p; ++i) {
				if (A[i] - A[i - 1] <= mid) {
					k++;
					i++;
				}
			}
			if (k >= p)
				right = mid;
			else
				left = mid + 1;
		}
		return left;
	}

}
