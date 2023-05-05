package com.ujjwal_Learning.strings;

public class MaximumNumberOfVowelsInStringLeetcode1456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean check(char ch) {
		return (ch == 'a' || ch == 'e' || ch == 'i' | ch == 'o' || ch == 'u');
	}

	public int maxVowels(String s, int k) {
		int max = 0, n = s.length();
		int count = 0;
		for (int i = 0; i < k; i++) {
			if (check(s.charAt(i)))
				count++;
		}
		max = count;
		// build first window size k
		for (int i = k; i < n; i++) {
			// remove the contribution of the (i - k)th character which is no longer in the
			// window
			if (check(s.charAt(i - k)))
				count--;
			// add the contribution of the current character
			if (check(s.charAt(i)))
				count++;
			// update max at for each window of size k
			max = Math.max(max, count);
		}
		return max;
	}

}
