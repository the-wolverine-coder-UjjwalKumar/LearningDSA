package com.ujjwal_Learning.Arrays;

public class SquareOfSortedArrayLeetcode977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added solution for sorted square array.
	public int[] sortedSquares(int[] A) {
		int n = A.length;
		int[] result = new int[n];
		int i = 0, j = n - 1;
		for (int p = n - 1; p >= 0; p--) {
			if (Math.abs(A[i]) > Math.abs(A[j])) {
				result[p] = A[i] * A[i];
				i++;
			} else {
				result[p] = A[j] * A[j];
				j--;
			}
		}
		return result;
	}

}
