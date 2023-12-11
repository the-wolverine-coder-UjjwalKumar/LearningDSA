package com.ujjwal_Learning.Arrays3;

public class ElementsOccuringMoreThan25PercentLeetcode1287 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findSpecialInteger(int[] arr) {
		int n = arr.length, t = n / 4;

		for (int i = 0; i < n - t; i++) {
			if (arr[i] == arr[i + t]) {
				return arr[i];
			}
		}
		return -1;
	}

}
