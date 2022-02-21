package com.ujjwal_Learning.recusrion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumLeetCode39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CombinationSumLeetCode39 obj = new CombinationSumLeetCode39();
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		List<List<Integer>> ans = obj.combinationSum(candidates, target);
		System.out.println("Subsequence with given target :: ");
		for (List<Integer> it : ans) {
			System.out.println(it.toString());
		}
	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> finalAns = new ArrayList<>();

		List<Integer> tempDS = new ArrayList<>();
		int currentSum = 0;
		int n = candidates.length;
		getCombination(0, finalAns, tempDS, candidates, target, currentSum, n);

		return finalAns;
	}

	private void getCombination(int index, List<List<Integer>> finalAns, List<Integer> tempDS, int[] candidates,
			int target, int currentSum, int n) {

		if (currentSum == target) {
			finalAns.add(new ArrayList<>(tempDS));
			return;
		}

		if (currentSum > target) {
			return;
		}

		if (index >= n || currentSum >= target) {
			return;
		}

		// when current element is not included
		getCombination(index, finalAns, tempDS, candidates, target, currentSum, n);

		// when current element is taken
		tempDS.add(candidates[index]);
		getCombination(index + 1, finalAns, tempDS, candidates, target, currentSum + candidates[index], n);
		tempDS.remove(tempDS.get(index) + 1);

		return;
	}

	static List<List> combinationSum2(int[] candidates, int target) {
		List<List> result = new ArrayList<>();
		helper(candidates, target, 0, 0, new ArrayList<>(), result);
		return result;
	}

	static void helper(int[] candidates, int target, int index, int currTotal, List<Integer> chosen,
			List<List<Integer>> result) {
		if (currTotal == target) {
			result.add(new ArrayList<>(chosen));
			return;
		}
		if (index >= candidates.length || currTotal > target)
			return;

		// choose
		int choose = candidates[index];
		chosen.add(choose);

		// explore - when we include
		// see if this chosen list got to target
		helper(candidates, target, index, currTotal + choose, chosen, result);

		// explore when we don't include
		chosen.remove(chosen.size() - 1);
		helper(candidates, target, index + 1, currTotal, chosen, result);
	}

}
