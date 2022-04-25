package com.ujjwal_Learning.binarySearch;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestNumberLeetcode658 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int lo = 0;
		int hi = arr.length - 1;
		while (hi - lo >= k) {
			if (Math.abs(arr[lo] - x) > Math.abs(arr[hi] - x)) {
				lo++;
			} else {
				hi--;
			}
		}
		List<Integer> result = new ArrayList<>(k);
		for (int i = lo; i <= hi; i++) {
			result.add(arr[i]);
		}
		return result;
	}

}
