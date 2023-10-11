package com.ujjwal_Learning.importatnt;

import java.util.PriorityQueue;
import java.util.Queue;

public class NumberOfFlowersInFullBloomLeetcode2251 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Approach
	/*
	 * This problem can be solved with a "Sweep Line Algorithm". The trick is to
	 * think of flowers blooming, flowers dying, and person coming as 3 different
	 * events along a time line, and then processing them in order.
	 * 
	 * What we need to do is keep track of the current number of flowers in bloom as
	 * we process each of the events. On a Bloom event, we increment a bloom counter
	 * by 1, on a Die event, we decrement the bloom counter by 1, and on a Person
	 * event, we simply need to look at the bloom counter and assign it to that
	 * person.
	 * 
	 * If there are multiple of these events at the same time i, then each of the 3
	 * events needs a priority processing number:
	 * 
	 * Bloom Person Die If a flower blooms at time i, then a person who visits at i
	 * will see that flower, so we need to increment before the person visits. If a
	 * flower dies at i, then a person who visits at i will still see that flower
	 * before it dies, so we need to decrement after the person visits.
	 */

	public int[] fullBloomFlowers(int[][] flowers, int[] persons) {
		/*
		 * 3 events: 0 - Bloom 1 - Person 2 - Die
		 */
		// {time position, event type, if person -> index}
		// first sort by time, then by event type
		Queue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

		// add the person events
		for (int i = 0; i < persons.length; i++) {
			// for person also add what index they were - {time position, human, index}
			pq.offer(new int[] { persons[i], 1, i });
		}
		// add the blossom events
		for (int[] flower : flowers) {
			pq.offer(new int[] { flower[0], 0 });
			pq.offer(new int[] { flower[1], 2 });
		}

		// traverse them all
		int[] ret = new int[persons.length];
		int numEvents = pq.size();
		int blooms = 0;
		for (int i = 0; i < numEvents; i++) {
			int[] cur = pq.poll();
			// if bloom, increment blooms
			if (cur[1] == 0) {
				blooms++;
				// if die, decrement blooms
			} else if (cur[1] == 2) {
				blooms--;
				// if person, set their index to # blooms
			} else {
				int personIndex = cur[2];
				ret[personIndex] = blooms;
			}
		}
		return ret;
	}

}
