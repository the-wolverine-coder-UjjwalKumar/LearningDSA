package com.ujjwal_Learning.recusrion;

import java.util.Arrays;

public class SolvingQuestionWithBrainPowerLeetcode2140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// public static long mostPoints(int[][] questions) {
    //     int n = questions.length;
    //     return mostPointHelper(0, questions, n);
    // }

    // public static long mostPointHelper(int i, int[][] questions, int n) {

    //     if (i == n-1) return questions[i][0];

    //     if (i >= n-1) return 0;


    //     // pick ith index value
    //     long pick = questions[i][0] + mostPointHelper(i + questions[i][1] + 1, questions, n);
    //     // not pick ith index value
    //     long notPick = mostPointHelper(i + 1, questions, n);

    //     return Math.max(pick,notPick);

    // }

    public static long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n+1];
        Arrays.fill(dp, -1);
        return mostPointHelper(0, questions, n, dp);
    }

    public static long mostPointHelper(int i, int[][] questions, int n, long[] dp) {

        

        if (i == n-1) return questions[i][0];
        if (i >= n-1) return 0;

        if (dp[i] != -1) return dp[i];

        // pick ith index value
        long pick = questions[i][0] + mostPointHelper(i + questions[i][1] + 1, questions, n, dp);
        // not pick ith index value
        long notPick = mostPointHelper(i + 1, questions, n, dp);

        return dp[i] = Math.max(pick,notPick);
        
    }

}
