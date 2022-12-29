package com.ujjwal_Learning.Arrays2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumLeetcode15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added method three sum
	public List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> set = new HashSet<>();
		if (nums.length == 0)
			return new ArrayList<>(set);
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1; // j starts at i+1
			int k = nums.length - 1; // k starts at the end
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == 0)
					set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
				else if (sum > 0)
					k--;
				else if (sum < 0)
					j++;
			}
		}
		return new ArrayList<>(set);
	}

}
