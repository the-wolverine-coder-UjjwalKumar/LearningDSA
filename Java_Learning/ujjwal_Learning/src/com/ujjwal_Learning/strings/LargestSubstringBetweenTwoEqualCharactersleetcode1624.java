package com.ujjwal_Learning.strings;

public class LargestSubstringBetweenTwoEqualCharactersleetcode1624 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxLengthBetweenEqualCharacters(String s) {
		int[] last = new int[26];
		int ans = -1;
		for (int i = 0; i < s.length(); ++i)
			last[s.charAt(i) - 'a'] = i;
		for (int i = 0; i < s.length(); ++i)
			ans = Math.max(ans, last[s.charAt(i) - 'a'] - i - 1);
		return ans;
	}

}
