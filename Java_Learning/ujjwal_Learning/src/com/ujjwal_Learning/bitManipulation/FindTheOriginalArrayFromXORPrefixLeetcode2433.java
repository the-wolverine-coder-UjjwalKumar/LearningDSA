package com.ujjwal_Learning.bitManipulation;

public class FindTheOriginalArrayFromXORPrefixLeetcode2433 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] findArray(int[] pref) {
		int[] ans = new int[pref.length];
		ans[0] = pref[0];
		for (int i = 1; i < pref.length; i++) {
			ans[i] = pref[i - 1] ^ pref[i];
		}
		return ans;
	}

}
