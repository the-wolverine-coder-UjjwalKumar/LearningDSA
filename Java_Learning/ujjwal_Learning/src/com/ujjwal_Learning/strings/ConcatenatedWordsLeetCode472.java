package com.ujjwal_Learning.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcatenatedWordsLeetCode472 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	Input: words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
//			Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
//			Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats"; 
//			"dogcatsdog" can be concatenated by "dog", "cats" and "dog"; 
//			"ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".
	public static List<String> findAllConcatenatedWordsInADict(String[] words) {
		List<String> result = new ArrayList<>();
		Set<String> preWords = new HashSet<>();
		Arrays.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		for (int i = 0; i < words.length; i++) {
			if (canForm(words[i], preWords)) {
				result.add(words[i]);
			}
			preWords.add(words[i]);
		}

		return result;
	}

	private static boolean canForm(String word, Set<String> dict) {
		if (dict.isEmpty())
			return false;
		boolean[] dp = new boolean[word.length() + 1];
		dp[0] = true;
		for (int i = 1; i <= word.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (!dp[j])
					continue;
				if (dict.contains(word.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[word.length()];
	}

}
