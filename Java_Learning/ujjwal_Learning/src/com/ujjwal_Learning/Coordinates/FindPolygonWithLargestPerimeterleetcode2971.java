package com.ujjwal_Learning.Coordinates;

import java.util.Arrays;

public class FindPolygonWithLargestPerimeterleetcode2971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public long largestPerimeter(int[] A) {
		Arrays.sort(A);
		long res = -1, cur = 0;
		for (int i = 0; i < A.length; ++i)
			if ((cur += A[i]) > A[i] * 2)
				res = cur;
		return res;
	}

}
