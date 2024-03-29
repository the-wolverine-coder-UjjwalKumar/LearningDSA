package com.ujjwal_Learning.Arrays3;

import java.util.PriorityQueue;

public class FarthestBuildingClimbLeetcode1642 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int furthestBuilding(int[] A, int bricks, int ladders) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < A.length - 1; i++) {
			int d = A[i + 1] - A[i];
			if (d > 0)
				pq.add(d);
			if (pq.size() > ladders)
				bricks -= pq.poll();
			if (bricks < 0)
				return i;
		}
		return A.length - 1;
	}

}
