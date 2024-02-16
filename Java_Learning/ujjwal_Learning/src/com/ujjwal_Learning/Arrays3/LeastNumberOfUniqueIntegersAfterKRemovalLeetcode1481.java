package com.ujjwal_Learning.Arrays3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeastNumberOfUniqueIntegersAfterKRemovalLeetcode1481 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findLeastNumOfUniqueInts(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int x : arr) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> elements = new ArrayList<>(map.entrySet());

		elements.sort((a, b) -> a.getValue() - b.getValue());

		for (Map.Entry<Integer, Integer> entry : elements) {
			if (entry.getValue() <= k) {
				k -= entry.getValue();
				map.remove(entry.getKey());
			} else {
				break;
			}
		}
		return map.size();
	}

}
