package com.ujjwal_Learning.Arrays3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JumpGame4Leetcode1871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added BFS solution to find the optimal jumps to reach destination
	public int minJumps(int[] arr) {
        int n = arr.length;
        HashMap<Integer, List<Integer>> indicesOfValue = new HashMap<>();
        for (int i = 0; i < n; i++)
            indicesOfValue.computeIfAbsent(arr[i], x -> new LinkedList<>()).add(i);
        boolean[] visited = new boolean[n]; visited[0] = true;
        Queue<Integer> q = new LinkedList<>(); q.offer(0);
        int step = 0;
        while (!q.isEmpty()) {
            for (int size = q.size(); size > 0; --size) {
                int i = q.poll();
                if (i == n - 1) return step; // Reached to last index
                List<Integer> next = indicesOfValue.get(arr[i]);
                next.add(i - 1); next.add(i + 1);
                for (int j : next) {
                    if (j >= 0 && j < n && !visited[j]) {
                        visited[j] = true;
                        q.offer(j);
                    }
                }
                next.clear(); // avoid later lookup indicesOfValue arr[i]
            }
            step++;
        }
        return 0;
    }
	
	public boolean canReach(String s, int min, int max) {
		if (s.charAt(s.length() - 1) == '1')
			return false;

		boolean[] dp = new boolean[s.length()];
		dp[dp.length - 1] = true;
		Queue<Integer> q = new LinkedList<>();
		for (int i = dp.length - 2; i >= 0; i--) {
			// remove the peek element if out of range
			if (!q.isEmpty() && q.peek() > i + max)
				q.remove();

			// add the new element in range to q if applicable
			if (i + min < s.length() && dp[i + min])
				q.add(i + min);

			// if q not empty, update dp table
			if (!q.isEmpty() && s.charAt(i) == '0')
				dp[i] = true;
		}

		return dp[0];
	}

}
