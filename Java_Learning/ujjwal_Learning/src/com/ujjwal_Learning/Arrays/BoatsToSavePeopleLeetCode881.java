package com.ujjwal_Learning.Arrays;

import java.util.Arrays;

public class BoatsToSavePeopleLeetCode881 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added greedy approach to save peoples
	public int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int i, j;
		for (i = 0, j = people.length - 1; i <= j; --j)
			if (people[i] + people[j] <= limit)
				++i;
		return people.length - 1 - j;
	}

}
