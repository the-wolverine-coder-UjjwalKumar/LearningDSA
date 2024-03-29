package com.ujjwal_Learning.strings;

import java.util.Arrays;

public class DetermineIFTwoStringAreCloseLeetcode1657 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private int N = 26;

	// added solution to check if two half are equal in vowel counts or not
	// added solution
	public boolean closeStrings(String word1, String word2) {
		// count the English letters
		int[] arr1 = new int[N], arr2 = new int[N];
		for (char ch : word1.toCharArray())
			arr1[ch - 'a']++;
		for (char ch : word2.toCharArray())
			arr2[ch - 'a']++;

		// if one has a letter which another one doesn't have, dont exist
		for (int i = 0; i < N; i++) {
			if (arr1[i] == arr2[i]) {
				continue;
			}
			if (arr1[i] == 0 || arr2[i] == 0) {
				return false;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < N; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
