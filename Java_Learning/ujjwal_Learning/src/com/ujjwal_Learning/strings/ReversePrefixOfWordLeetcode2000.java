package com.ujjwal_Learning.strings;

public class ReversePrefixOfWordLeetcode2000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String reversePrefix(String word, char ch) {
		int firstOccurence = word.indexOf(ch);
		if (firstOccurence == -1) {
			return word;
		}

		StringBuilder prefix = new StringBuilder(word.substring(0, firstOccurence + 1));
		return prefix.reverse().toString() + word.substring(firstOccurence + 1);
	}

	public String reversePrefix1(String word, char c) {
		int low = 0;
		int high = 0;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == c) {
				high = i;
				break;
			}
		}

		char[] charArr = word.toCharArray();

		while (low < high) {
			char temp = charArr[high];
			charArr[high] = charArr[low];
			charArr[low] = temp;
			low++;
			high--;
		}

		StringBuilder sb = new StringBuilder();
		for (char ch : charArr) {
			sb.append(ch);
		}

		return sb.toString();

	}

}
