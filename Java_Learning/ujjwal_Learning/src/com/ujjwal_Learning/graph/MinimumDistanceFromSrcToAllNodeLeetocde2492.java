package com.ujjwal_Learning.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumDistanceFromSrcToAllNodeLeetocde2492 {

	class pair {
		int node;
		int dist;

		pair(int node1, int dist1) {
			node = node1;
			dist = dist1;
		}
	}

	public int minScore(int n, int[][] roads) {
		// creating the adj list
		List<List<pair>> adj = new ArrayList<>();
		for (int i = 0; i <= n; i++)
			adj.add(new ArrayList<>());

		for (int p[] : roads) {
			adj.get(p[0]).add(new pair(p[1], p[2]));
			adj.get(p[1]).add(new pair(p[0], p[2]));
		}
		// pq for dijkstra
		Queue<pair> q = new PriorityQueue<>((a, b) -> a.dist - b.dist);
		q.add(new pair(1, 0));
		int distn[] = new int[n + 1];
		Arrays.fill(distn, Integer.MAX_VALUE);

		while (!q.isEmpty()) {
			pair it = q.poll();
			int node = it.node;
			int dis = it.dist;
			for (pair x1 : adj.get(node)) {
				// just storing the min edge modifying the dijkstra
				if (x1.dist < distn[x1.node]) {
					distn[x1.node] = x1.dist;
					q.add(new pair(x1.node, distn[x1.node]));
				}
			}
		}
		// finding out min distn out of all node distn array
		int min = (int) 1e9;
		for (int i = 0; i <= n; i++) {
			// System.out.print(distn[i]+" ");
			min = Math.min(distn[i], min);
		}
		return min;
	}

}
