package com.ujjwal_Learning.strings;

public class NumberOfWaysToFormTargetStringLeetcode1639 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added leetcode daily solution
	public int numWays(String[] words, String target) {
		int n = target.length();
		long mod = (long) 1e9 + 7, res[] = new long[n + 1];
		res[0] = 1;
		for (int i = 0; i < words[0].length(); ++i) {
			int[] count = new int[26];
			for (String w : words)
				count[w.charAt(i) - 'a']++;
			for (int j = n - 1; j >= 0; --j) {
				res[j + 1] += res[j] * count[target.charAt(j) - 'a'] % mod;
			}
		}
		return (int) (res[n] % mod);
	}

}
