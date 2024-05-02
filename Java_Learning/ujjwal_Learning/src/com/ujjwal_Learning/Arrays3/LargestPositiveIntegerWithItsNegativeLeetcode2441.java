package com.ujjwal_Learning.Arrays3;

import java.util.HashSet;

public class LargestPositiveIntegerWithItsNegativeLeetcode2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findMaxK(int[] nums) {
		HashSet<Integer> st = new HashSet<>();
		for (int i : nums)
			st.add(i);
		int res = -1;
		for (int p : nums)
			if (p > 0 && st.contains(-p))
				res = Math.max(res, p);
		return res;
	}

}
