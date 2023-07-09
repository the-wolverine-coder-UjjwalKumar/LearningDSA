package com.ujjwal_Learning.Arrays3;

import java.util.HashMap;
import java.util.Map;

public class SubstringWithLargestVarienceLeetcode2272 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int largestVariance(String s) {
		// Maintain a map of frequency of characters in the string
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);

		int max = 0;
		// Check for every possible pair of characters in the map with the assumption
		// that the one char is greater than the other
		// In the following piece of code, assuming c2 count is greater than c1
		for (char c1 : map.keySet()) {
			for (char c2 : map.keySet()) {
				// If both the characters are same then we don't explore any further
				if (c1 == c2)
					continue;
				int c1Freq = 0, c2Freq = 0;
				int c1Remaining = map.get(c1); // Keep track of the remaining c1 chars

				// Iterate through all the characters in the string
				for (char c : s.toCharArray()) {
					if (c == c1) {
						c1Freq++;
						c1Remaining--;
					}
					if (c == c2)
						c2Freq++;

					// If c2-count < c1-count then we reset the counters, only if we know there are
					// more c1 chars to come in the iteration
					// c1Remaining check is required for the test case "baa" and c1=b && c2=a. We
					// don't reset the counters if there are no more c1 chars left
					if (c2Freq < c1Freq && c1Remaining > 0) {
						c2Freq = 0;
						c1Freq = 0;
					}

					// Calculate variance of current substring and update max accordingly
					if (c1Freq > 0 && c2Freq > 0)
						max = Math.max(max, c2Freq - c1Freq);
				}
			}
		}
		return max;
	}

}
