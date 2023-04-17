package com.ujjwal_Learning.Arrays3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestCandiesLeetcode1431 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Boolean> kidsWithCandies1(int[] candies, int extraCandies) {
		List<Boolean> ans = new ArrayList<>();
		int maxi = Arrays.stream(candies).max().getAsInt();

		for (int i : candies) {

			if (maxi <= (i + extraCandies))
				ans.add(true);
			else
				ans.add(false);
		}
		return ans;

	}

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> ans = new ArrayList<>();
		int maxi = Arrays.stream(candies).max().getAsInt();
		int gap = maxi - extraCandies; // value req. to get more than greatest

		for (int i : candies) {

			if (i >= gap)
				ans.add(true);
			else
				ans.add(false);
		}
		return ans;

	}

}
