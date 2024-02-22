package com.ujjwal_Learning.Arrays3;

public class FindTheTownJudgeLeetcode997 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findJudge(int N, int[][] trust) {
		int[] Trusted = new int[N + 1];
		for (int[] person : trust) {
			Trusted[person[0]]--;
			Trusted[person[1]]++;
		}
		for (int i = 1; i < Trusted.length; i++) {
			if (Trusted[i] == N - 1)
				return i;
		}
		return -1;
	}

}
