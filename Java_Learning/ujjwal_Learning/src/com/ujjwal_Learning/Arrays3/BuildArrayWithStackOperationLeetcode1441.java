package com.ujjwal_Learning.Arrays3;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayWithStackOperationLeetcode1441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> buildArray(int[] target, int n) {
		List<String> result = new ArrayList<>();
		int j = 0;
		for (int i = 1; i <= n && j < target.length; i++) {
			result.add("Push");
			if (target[j] == i) {
				j++;
			} else {
				result.add("Pop");
			}
		}
		return result;
	}

}
