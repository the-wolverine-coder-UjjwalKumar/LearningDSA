package com.ujjwal_Learning.LeetCodeQuestions;

public class FindDuplicateNumberLeetCode287 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * Example 1:
	 * 
	 * Input: nums = [1,3,4,2,2] Output: 2 Example 2:
	 * 
	 * Input: nums = [3,1,3,4,2] Output: 3
	 */

	// added Leetcode method to get duplicates
	public int findDuplicate(int[] nums) {
		for (int n : nums) {
			if (nums[Math.abs(n)] < 0) {
				return Math.abs(n);
			} else {
				nums[Math.abs(n)] *= -1;
			}
		}
		return -1;
	}
	
	int findDuplicate1(int[] nums){
        if (nums.length > 1){
            int slow = nums[0];
            int fast = nums[nums[0]];
            while (slow != fast)
            {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

            fast = 0;
            while (fast != slow)
            {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
        }
        return -1;
    }

}
