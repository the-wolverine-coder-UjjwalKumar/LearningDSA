package com.ujjwal_Learning.recusrion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwoLeetCode40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CombinationSumTwoLeetCode40 obj = new CombinationSumTwoLeetCode40();
		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		List<List<Integer>> ans = obj.combinationSum2(candidates, target);
		System.out.println("Subsequence with given target :: ");
		for (List<Integer> it : ans) {
			System.out.println(it.toString());
		}

	}

	// one element can be picked up once and the collection contain all unique
	// combination

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if (candidates == null || candidates.length == 0)
			return result;
		
		ArrayList<Integer> current = new ArrayList<Integer>();
		Arrays.sort(candidates);
		
		combinationSum(candidates, target, 0, current, result);
		return result;
	}

	public void combinationSum(int[] candidates, int target, int j, ArrayList<Integer> curr,
			List<List<Integer>> result) {
		if (target == 0) {
			ArrayList<Integer> temp = new ArrayList<Integer>(curr);
			result.add(temp);
			return;
		}
		
        //finding out all possible sequence starting from current index
		for (int i = j; i < candidates.length; i++) {
			if (target < candidates[i]) {
				return;
			}
			if (i == j || candidates[i] != candidates[i - 1]) { // here we are ignoring the call made for similar elements
				curr.add(candidates[i]);
				combinationSum(candidates, target - candidates[i], i + 1, curr, result);
				curr.remove(curr.size() - 1);
			}
		}
	}
	
	// method - 2
	
	private void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(target == 0) {
            ans.add(new ArrayList<>(ds)); 
            return; 
        }
        
        for(int i = ind; i < arr.length;i++) {
            if(i > ind && arr[i] == arr[i-1]) continue; 
            if(arr[i]>target) break; 
            
            ds.add(arr[i]); 
            findCombinations(i+1, arr, target - arr[i], ans, ds); 
            ds.remove(ds.size() - 1); 
        }
    }
    public List<List<Integer>> combinationSum2R(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); 
        findCombinations(0, candidates, target, ans, new ArrayList<>()); 
        return ans; 
    }
}