package com.ujjwal_Learning.Arrays3;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArrayLeetcode442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < nums.length; ++i) {
			// marking the value at index as negative
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] < 0)
				res.add(Math.abs(nums[i]));
			nums[index] = -nums[index];
		}
		return res;
	}

}
