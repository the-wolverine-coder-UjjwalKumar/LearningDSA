package com.ujjwal_Learning.Arrays3;

public class CountSubarrayWithFixedBoundLeetcode2444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public long countSubarrays(int[] A, int minK, int maxK) {
		long res = 0, jbad = -1, jmin = -1, jmax = -1, n = A.length;
		for (int i = 0; i < n; ++i) {
			if (A[i] < minK || A[i] > maxK)
				jbad = i;
			if (A[i] == minK)
				jmin = i;
			if (A[i] == maxK)
				jmax = i;
			res += Math.max(0L, Math.min(jmin, jmax) - jbad);
		}
		return res;
	}

}
