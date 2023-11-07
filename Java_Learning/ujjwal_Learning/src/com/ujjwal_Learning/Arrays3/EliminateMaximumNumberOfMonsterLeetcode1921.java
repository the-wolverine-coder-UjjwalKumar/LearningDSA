package com.ujjwal_Learning.Arrays3;

import java.util.PriorityQueue;

public class EliminateMaximumNumberOfMonsterLeetcode1921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int eliminateMaximum(int[] dist, int[] speed) {
		/*
		 * Calculate the time for each monster to reach the city and start elimiating
		 * one every minute starting from 0 with one with least time until any monster
		 * reaches a city.
		 */
		PriorityQueue<Double> pq = new PriorityQueue<>();
		for (int i = 0; i < dist.length; i++) {
			pq.add(dist[i] * 1.0 / speed[i]);
		}

		double min = 0.0;
		int count = 0;
		while (!pq.isEmpty() && pq.poll() > min) {
			min += 1.0;
			count++;
		}

		return count;
	}

}
