package com.ujjwal_Learning.strings;

public class Largest3SameDigitNumberStringLeetcode2264 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String largestGoodInteger(String num) {
		int ans = -1;
		for (int i = 0; i < num.length() - 2; i++) {
			String subStr = num.substring(i, i + 3);
			if (subStr.charAt(0) == subStr.charAt(1) && subStr.charAt(1) == subStr.charAt(2)) {
				ans = Math.max(ans, Integer.parseInt(subStr));
			}
		}

		if (ans != -1) {
			return ans == 0 ? "000" : String.valueOf(ans);
		} else
			return "";
	}

	public String largestGoodInteger1(String num) {
		String dict[] = new String[] { "999", "888", "777", "666", "555", "444", "333", "222", "111", "000" };
		for (String s : dict) {
			if (num.indexOf(s) > -1)
				return s;
		}
		return "";
	}

}
