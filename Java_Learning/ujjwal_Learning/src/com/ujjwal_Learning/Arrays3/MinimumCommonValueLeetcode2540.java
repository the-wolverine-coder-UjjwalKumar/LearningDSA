package com.ujjwal_Learning.Arrays3;

public class MinimumCommonValueLeetcode2540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int getCommon(int[] nums1, int[] nums2) {
		int i = 0, j = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j])
				return nums1[i];
			if (nums1[i] > nums2[j])
				j++;
			else
				i++;
		}
		return -1;
	}
}
