package com.ujjwal_Learning.Arrays3;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximizeHappinesOfSelectedChildrensLeetcde3075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public long maximumHappinessSum1(int[] happiness, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		for (int happ : happiness) {
			pq.add(happ);
		}

		long happinessCount = 0;
		int dec = 0;
		while (k > 0) {
			happinessCount += Math.max(0, pq.poll() - dec);
			dec++;
			k--;
		}

		return happinessCount;
	}

	public long maximumHappinessSum(int[] h, int k) {
		long max = 0;
		int c = 0, value = 0;
		Arrays.sort(h);
		for (int i = h.length - 1; i >= h.length - k; i--) {
			value = h[i] - c++;
			if (value > 0) {
				max += value;
			}
		}
		return max;
	}

}
