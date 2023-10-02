package com.ujjwal_Learning.strings;

public class RemoveColoredPairStringsLeetcode2038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean winnerOfGame(String s) {
		int a = 0, b = 0;
		// counting valid A's or B's
		// if a > b then Alice wins else Bob wins
		for (int i = 1; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i + 1)) {
				if (s.charAt(i) == 'A')
					a++;
				else
					b++;
			}
		}

		return a > b;
	}

}
