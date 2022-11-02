package com.ujjwal_Learning.bitManipulation;

public class ConstructSmallestNumberFromDIStringLeetcode2375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String smallestNumber(String s) {
		StringBuilder res = new StringBuilder(), stack = new StringBuilder();
		for (int i = 0; i <= s.length(); i++) {
			stack.append((char) ('1' + i));
			if (i == s.length() || s.charAt(i) == 'I') {
				res.append(stack.reverse());
				stack = new StringBuilder();
			}
		}
		return res.toString();
	}

}
