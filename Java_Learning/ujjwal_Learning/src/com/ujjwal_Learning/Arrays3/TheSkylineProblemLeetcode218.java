package com.ujjwal_Learning.Arrays3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class TheSkylineProblemLeetcode218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> getSkyline(int[][] buildings) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		int numOfBuildings = buildings.length;
		// Decreasing order of priority queue
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return b[2] - a[2];
			}
		});

		int x = numOfBuildings == 0 ? Integer.MAX_VALUE : buildings[0][0], next = 0;
		pq.offer(new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE, 0 });

		// till atleast one buildings need to be seen
		// or the pq has atleast 1 building
		while (x != Integer.MAX_VALUE || next < numOfBuildings || pq.size() > 1) {
			// remove all the peaks out of bounds
			while (pq.size() > 1 && pq.peek()[1] <= x) {
				// the peak building has become out of bounds, remove it
				pq.poll();
			}

			// Add the next building if in bound
			while (next < numOfBuildings && x == buildings[next][0])
				pq.offer(buildings[next++]);

			// Add current peak building if not equal to last added peak building height
			if (ans.size() == 0 || pq.peek()[2] != ans.get(ans.size() - 1).get(1))
				ans.add(Arrays.asList(new Integer[] { x, pq.peek()[2] }));

			// The next x position is either when the prev peak goes out of bound
			// or the next building comes into picture(that may or may not change the
			// skyline)
			x = Math.min(pq.peek()[1], next >= numOfBuildings ? Integer.MAX_VALUE : buildings[next][0]);
		}

		return ans;
	}
}
