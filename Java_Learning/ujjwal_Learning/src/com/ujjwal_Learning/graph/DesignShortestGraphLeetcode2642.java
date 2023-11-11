package com.ujjwal_Learning.graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class DesignShortestGraphLeetcode2642 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();

	public DesignShortestGraphLeetcode2642(int n, int[][] edges) {
	        for (int[] e : edges) {
	            graph.computeIfAbsent(e[0], m -> new HashMap<>()).put(e[1], e[2]);
	        }
	    }

	public void addEdge(int[] edge) {
		graph.computeIfAbsent(edge[0], m -> new HashMap<>()).put(edge[1], edge[2]);
	}

	public int shortestPath(int node1, int node2) {
		PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
		pq.offer(new int[] { 0, node1 });
		Set<Integer> seen = new HashSet<>();
		while (!pq.isEmpty()) {
			int cost = pq.peek()[0], node = pq.poll()[1];
			if (node == node2) {
				return cost;
			}
			if (graph.containsKey(node) && seen.add(node)) {
				for (Map.Entry<Integer, Integer> entry : graph.get(node).entrySet()) {
					int kid = entry.getKey(), w = entry.getValue();
					pq.offer(new int[] { w + cost, kid });
				}
			}
		}
		return -1;
	}

}
