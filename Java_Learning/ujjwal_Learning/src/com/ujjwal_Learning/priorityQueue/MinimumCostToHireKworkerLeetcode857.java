package com.ujjwal_Learning.priorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumCostToHireKworkerLeetcode857 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double mincostToHireWorkers(int[] quality, int[] wage, int K) {

		if (K <= 0 || quality == null || quality.length == 0 || wage == null || wage.length == 0)
			return 0.0;

		int n = quality.length;
		if (wage.length != n)
			return 0;

		double[][] ratio = new double[n][2];
		for (int i = 0; i < n; i++) {
			ratio[i][0] = (double) wage[i] / quality[i];
			ratio[i][1] = (double) quality[i];
		}

		Arrays.sort(ratio, (a, b) -> Double.compare(a[0], b[0])); // Crucial
		PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		double sum = 0; // Quality sum
		double min = Double.MAX_VALUE;

		for (double[] e : ratio) {
			sum += e[1];
			maxHeap.offer(e[1]);

			if (maxHeap.size() > K) // Worker of highest quality is removed, because you need to pay him more with
									// the same ratio
				sum -= maxHeap.poll();

			if (maxHeap.size() == K) // When exactly K, then calculate min. The idea is to hire workers at low ratio
										// (i.e. K-th smallest ratio)
				min = Math.min(min, e[0] * sum);
		}
		return min;
	}

}
