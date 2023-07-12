package com.ujjwal_Learning.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class FindEvaluatedSafeStatesLeetcode802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added solution
	public List<Integer> eventualSafeNodes(int[][] graph) {
		int N = graph.length;
		int[] degree = new int[N];
		Map<Integer, Set<Integer>> neighbors = new HashMap<>();
		for (int i = 0; i < graph.length; i++) {
			for (int neighbor : graph[i]) {
				if (!neighbors.containsKey(neighbor))
					neighbors.put(neighbor, new HashSet<Integer>());
				neighbors.get(neighbor).add(i);
				degree[i]++;
			}
		}

		Set<Integer> res = new HashSet<>();
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			if (degree[i] == 0) {
				res.add(i);
				queue.add(i);
			}
		}

		while (!queue.isEmpty()) {
			int v = queue.poll();
			res.add(v);
			if (neighbors.containsKey(v)) {
				for (int neighbor : neighbors.get(v)) {
					degree[neighbor]--;
					if (degree[neighbor] == 0) {
						queue.offer(neighbor);
					}
				}
			}

		}
		List<Integer> list = new ArrayList<Integer>(res);
		Collections.sort(list);
		return list;
	}

}
