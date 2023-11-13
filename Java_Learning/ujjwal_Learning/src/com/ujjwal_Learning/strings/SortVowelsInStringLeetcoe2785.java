package com.ujjwal_Learning.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortVowelsInStringLeetcoe2785 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U');
	}

	public String sortVowels(String s) {
		char c[] = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < c.length; i++) {
			if (isVowel(c[i])) {
				list.add(c[i]);
			}
		}
		Collections.sort(list);
		int ind = 0;
		for (int i = 0; i < c.length; i++) {
			if (!isVowel(c[i])) {
				sb.append(c[i]);
			} else {
				sb.append(list.get(ind++));
			}
		}
		return sb.toString();
	}
	

}
