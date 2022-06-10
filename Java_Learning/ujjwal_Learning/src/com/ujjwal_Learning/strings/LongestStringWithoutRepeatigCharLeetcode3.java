package com.ujjwal_Learning.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestStringWithoutRepeatigCharLeetcode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added lengthOfLongestSubstring method
	public int lengthOfLongestSubstring(String s) {
		int maxLen = 0;
		Set<Character> window = new HashSet<>();

		int left = 0, right = 0;
		while (right < s.length()) {
			while (window.contains(s.charAt(right)))
				window.remove(s.charAt(left++));
			window.add(s.charAt(right++));
			maxLen = Math.max(maxLen, right - left);
		}

		return maxLen;
	}

}
