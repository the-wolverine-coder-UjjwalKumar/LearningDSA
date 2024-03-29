package com.ujjwal_Learning.strings;

public class BackSpaceStringCompareLeetcode844 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added back space compare method
	public boolean backspaceCompare(String S, String T) {
		int i = S.length() - 1, j = T.length() - 1, back;
		while (true) {
			back = 0;
			while (i >= 0 && (back > 0 || S.charAt(i) == '#')) {
				back += S.charAt(i) == '#' ? 1 : -1;
				i--;
			}
			back = 0;
			while (j >= 0 && (back > 0 || T.charAt(j) == '#')) {
				back += T.charAt(j) == '#' ? 1 : -1;
				j--;
			}
			if (i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)) {
				i--;
				j--;
			} else {
				break;
			}
		}
		return i == -1 && j == -1;
	}

}
