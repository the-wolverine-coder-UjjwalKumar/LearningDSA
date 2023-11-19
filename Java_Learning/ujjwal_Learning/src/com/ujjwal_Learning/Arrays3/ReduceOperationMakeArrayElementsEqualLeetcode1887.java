package com.ujjwal_Learning.Arrays3;

import java.util.Arrays;

public class ReduceOperationMakeArrayElementsEqualLeetcode1887 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int reductionOperations(int[] n) {
		int res = 0, sz = n.length;
		Arrays.sort(n);
		for (int j = sz - 1; j > 0; --j)
			if (n[j - 1] != n[j])
				res += sz - j;
		return res;
	}

}
