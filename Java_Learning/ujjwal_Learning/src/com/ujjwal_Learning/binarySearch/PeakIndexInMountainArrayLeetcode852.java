package com.ujjwal_Learning.binarySearch;

public class PeakIndexInMountainArrayLeetcode852 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int peakIndexInMountainArray(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
				return i;
		}
		return -1;
	}

	// Binary Search
	// added solution for peak index in array
	public int peakIndexInMountainArrayBS(int[] A) {
		int l = 0, r = A.length - 1, m;
		while (l < r) {
			m = (l + r) / 2;
			if (A[m] < A[m + 1])
				l = m + 1;
			else
				r = m;
		}
		return l;
	}

}
