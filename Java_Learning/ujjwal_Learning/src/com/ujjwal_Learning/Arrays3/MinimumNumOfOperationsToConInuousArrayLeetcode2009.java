package com.ujjwal_Learning.Arrays3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MinimumNumOfOperationsToConInuousArrayLeetcode2009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minOperations(int[] nums) {
		Arrays.sort(nums); // Sort the array

		int n = nums.length;
		int maxNumsInWindow = 0;

		Deque<Integer> numsInWindow = new ArrayDeque<>();
		for (int num : nums) {
			// Advance the window
			while (numsInWindow.size() > 0 && num - numsInWindow.peekFirst() >= n) {
				numsInWindow.poll();
			}

			// Add the new number to the window (if it's not a duplicate)
			if (numsInWindow.size() == 0 || !numsInWindow.peekLast().equals(num)) {
				numsInWindow.offer(num);
			}

			maxNumsInWindow = Math.max(maxNumsInWindow, numsInWindow.size());
		}

		return n - maxNumsInWindow;
	}

}
