package com.ujjwal_Learning.matrixProblems;

public class ScoreAfterFlippingMatrixLeetcode861 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int matrixScore(int[][] A) {
		int N = A.length, M = A[0].length;

		// Optimize, step1: flip all rows starting with a zero
		for (int i = 0; i < N; ++i) {
			if (A[i][0] == 0)
				flipRow(A, i);
		}

		// Optimize, step 2: flip all columns where the number of zeros is larger than
		// the number of ones
		for (int col = 1; col < M; ++col) {
			int sumCol = 0;
			for (int i = 0; i < N; ++i)
				sumCol += A[i][col];

			if (sumCol * 2 < N)
				flipCol(A, col);
		}

		// Count final sum
		int total = 0;
		for (int i = 0; i < N; ++i)
			for (int j = 0; j < M; ++j)
				total += A[i][j] * (1 << (M - j - 1));

		return total;
	}

	void flipRow(int[][] a, int r) {
		for (int i = 0; i < a[r].length; ++i)
			a[r][i] = (a[r][i] ^ 1);
	}

	void flipCol(int[][] a, int c) {
		for (int i = 0; i < a.length; ++i)
			a[i][c] = (a[i][c] ^ 1);
	}

}
