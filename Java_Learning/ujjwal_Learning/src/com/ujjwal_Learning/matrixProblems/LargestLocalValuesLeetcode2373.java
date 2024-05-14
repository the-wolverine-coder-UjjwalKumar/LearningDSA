package com.ujjwal_Learning.matrixProblems;

public class LargestLocalValuesLeetcode2373 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int[][] largestLocal(int[][] grid) {
    // 3 <= n <= 100
    // n == grid.length == grid[i].length
    int n = grid.length;

    int[][] ans = new int[n-2][n-2];

    // for (int row = 0; row < n-2; row++) {
    //     for (int col = 0; col < n-2; col++) {

    //         // make a 3x3 grid starting from row,col
    //         int localMax = Integer.MIN_VALUE;
    //         localMax = Math.max(localMax, grid[row][col]);
    //         localMax = Math.max(localMax, grid[row][col+1]);
    //         localMax = Math.max(localMax, grid[row][col+2]);e

    //         localMax = Math.max(localMax, grid[row+1][col]);
    //         localMax = Math.max(localMax, grid[row+1][col+1]);
    //         localMax = Math.max(localMax, grid[row+1][col+2]);

    //         localMax = Math.max(localMax, grid[row+2][col]);
    //         localMax = Math.max(localMax, grid[row+2][col+1]);
    //         localMax = Math.max(localMax, grid[row+2][col+2]);

    //         ans[row][col] = localMax;

    //     }

    // }

    for(int i = 0; i < n-2; i++) {
        for(int j = 0; j < n-2; j++) {
            ans[i][j] = 0;
            for(int a = i; a < i + 3; a++) {
                for(int b = j; b < j + 3; b++){
                    if(ans[i][j] < grid[a][b]){
                        ans[i][j] = grid[a][b];
                    }
                }
            }
        }
    }

    return ans;
}

}
