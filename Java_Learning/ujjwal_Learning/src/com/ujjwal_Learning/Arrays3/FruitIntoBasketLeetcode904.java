package com.ujjwal_Learning.Arrays3;

import java.util.Collections;
import java.util.HashMap;

public class FruitIntoBasketLeetcode904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added method to fetch total fruits can be put in 2 basket
	public int totalFruit(int[] tree) {
		int start = 0;
		int n = tree.length;
		int maxLength = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int end = 0; end < n; end++) {
			map.put(tree[end], end);
			if (map.size() > 2) {
				int minIndex = Collections.min(map.values());
				map.remove(tree[minIndex]);
				start = minIndex + 1;
			}
			maxLength = Math.max(maxLength, end - start + 1);
		}
		return maxLength;
	}

}
