package com.ujjwal_Learning.Arrays3;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandiestoPeopleLeetcode1103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] distributeCandies(int candies, int num_people) {
		int[] people = new int[num_people];
		for (int give = 0; candies > 0; candies -= give) {
			people[give % num_people] += Math.min(candies, ++give);
		}
		return people;
	}
	
	public int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        for (int candy : candies) kinds.add(candy);
        return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();
    }

}
