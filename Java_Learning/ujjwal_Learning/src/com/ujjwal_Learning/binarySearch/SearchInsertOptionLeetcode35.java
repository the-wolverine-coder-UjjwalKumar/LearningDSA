package com.ujjwal_Learning.binarySearch;

public class SearchInsertOptionLeetcode35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// search insert position using BS
	public int searchInsert(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > nums[mid]) {
				start = mid + 1;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return start;
	}

}
