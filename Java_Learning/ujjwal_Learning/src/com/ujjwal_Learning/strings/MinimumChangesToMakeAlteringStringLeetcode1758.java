package com.ujjwal_Learning.strings;

public class MinimumChangesToMakeAlteringStringLeetcode1758 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minOperations1(String s) {
		int alterCount = 0;
		Character ch = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			if (ch == '0' && s.charAt(i) != '1') {
				alterCount++;
				ch = '1';
			} else if (ch == '1' && s.charAt(i) != '0') {
				alterCount++;
				ch = '0';
			} else if ((ch == '0' && s.charAt(i) == '1') || (ch == '1' && s.charAt(i) == '0')) {
				ch = s.charAt(i);
			}
		}

		return Math.min(alterCount, s.length() - alterCount);
	}
	
	/*
	 * Small observation that the sequence of index is [0,1,2,3..],
	 * if we get its module by 2, we get [0,1,0,1,0..], which is the alternating
	 * binary sequence we want.
	 * 
	 * So we iterate the string, check if the characters[i] is same as the i % 2.
	 * Note that s[i] is a character, and s[i] - '0' making it to integer.
	 * 
	 * We accumulate the number of difference, which is the number of operation to
	 * make it into 01 string.
	 * 
	 * We can do the same to find out res, the number of operation for 10 string.
	 * But we don't have to, because this equals to s.length - res.
	 */

	public int minOperations(String s) {
		int res = 0, n = s.length();
		for (int i = 0; i < n; ++i)
			if (s.charAt(i) - '0' != i % 2)
				res++;
		return Math.min(res, n - res);
	}

}
