package com.ujjwal_Learning.Arrays2;

public class LongestSubarraywithOeLeetcode1493 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int longestSubarray(int[] A) {
		int i = 0, j, k = 1, res = 0;
		for (j = 0; j < A.length; ++j) {
			if (A[j] == 0) {
				k--;
			}
			while (k < 0) {
				if (A[i] == 0) {
					k++;
				}
				i++;
			}
			res = Math.max(res, j - i);
		}
		return res;
	}

}
