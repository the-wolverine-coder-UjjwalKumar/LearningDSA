package com.ujjwal_Learning.graph;

import java.util.HashMap;
import java.util.Map;

public class FreedomTrailLeetcode514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findRotateSteps(String ring, String key) {
		Map<String, Integer> map = new HashMap();
		return dfs(ring, key, 0, map);
	}

	public int dfs(String ring, String key, int index, Map<String, Integer> map) {
		if (index == key.length()) {
			return 0;
		}

		char c = key.charAt(index);
		String hashKey = ring + index;
		if (map.containsKey(hashKey))
			return map.get(hashKey);

		int minSteps = Integer.MAX_VALUE;
		for (int i = 0; i < ring.length(); i++) {
			if (ring.charAt(i) == c) {
				String s = ring.substring(i, ring.length()) + ring.substring(0, i);
				int steps = 1 + Math.min(i, ring.length() - i);
				steps += dfs(s, key, index + 1, map);
				minSteps = Math.min(minSteps, steps);
			}
		}

		map.put(hashKey, minSteps);

		return minSteps;
	}

}
