package com.ujjwal_Learning.Arrays3;

import java.util.HashMap;
import java.util.Map;

public class ContigiousSubarrayWithEquaZeroOnesLeetcode525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findMaxLength(int[] nums) {
		Map<Integer, Integer> stateToFirstIndex = new HashMap<>();
		int state = 0;
		int maxLength = 0;
		stateToFirstIndex.put(state, -1);
		for (int i = 0; i < nums.length; i++) {
			state += (nums[i] == 0 ? -1 : 1);

			Integer firstIndex = stateToFirstIndex.get(state);
			if (firstIndex != null) {
				// found one subarray [firstIndex...i]
				maxLength = Math.max(maxLength, i - firstIndex);
			} else {
				stateToFirstIndex.put(state, i);
			}
		}

		return maxLength;
	}

}
