package com.ujjwal_Learning.strings;

public class DecodeStringAtIndexLeetcode880 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Brute force but this will give TLE
	private static String decodeAtIndexBruteForce(String s, int k) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < s.length()) {
			Character ch = s.charAt(i);
			if (!Character.isDigit(ch)) {
				sb.append(ch);
			} else {
				int d = (ch - '1');
				String lastAppended = sb.toString();
				while (d != 0) {
					sb.append(lastAppended);
					d--;
				}
			}
			i++;
		}
		System.out.println(sb.toString());
		return String.valueOf(sb.toString().charAt(k - 1));
	}

	// Optimized
	public static String decodeAtIndex(String S, int K) {
		for (int len = 0, i = 0; i < S.length(); i++) {
			if (Character.isDigit(S.charAt(i))) {
				int num = S.charAt(i) - '0', count = 0;
				for (; count < num - 1 && K > len; count++) {
					K -= len;
				}
				if (count != num - 1) {
					return decodeAtIndex(S, K);
				} else {
					len *= num;
				}
			} else {
				len++;
				K--;
				if (K == 0) {
					return String.valueOf(S.charAt(i));
				}
			}
		}
		return "";
	}

}
