package com.ujjwal_Learning.Arrays3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKSumInArrayLeetcode2386 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public long kSum(int[] nums, int k) {
		long minus = 0, all = 0;
		for (int i = 0; i < nums.length; i++) {
			all += Math.max(nums[i], 0); // take all positive values
			nums[i] = Math.abs(nums[i]); // make all non-negative
		}
		Arrays.sort(nums); // sort it
		var minheap = new PriorityQueue<long[]>(Comparator.comparingLong(o -> o[0]));
		minheap.offer(new long[] { nums[0], 0 });
		while (--k > 0) { // construct the smallest subsequence value in a smart way
			long[] top = minheap.poll();
			int i = (int) top[1]++;
			long val = top[0];
			minus = val;
			if (i < nums.length - 1) { // each item (node) branches out into 2 (children)
				top[0] += nums[i + 1];
				minheap.offer(new long[] { val - nums[i] + nums[i + 1], i + 1 });
				minheap.offer(top);
			}
		}
		return all - minus;
	}

}
