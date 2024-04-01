package com.ujjwal_Learning.strings;

import java.util.Arrays;
import java.util.List;

public class LengthOfLastWordsLeetCode58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added solution for last word length
	public int lengthOfLastWord(String s) {
		s = s.trim();
		List<String> words = Arrays.asList(s.split(" "));
		for (int i = words.size() - 1; i >= 0; i--) {
			if (words.get(i) != " ") {
				return (words.get(i)).length();
			}
		}
		// System.out.println(words.toString());
		return 0;
	}
}
