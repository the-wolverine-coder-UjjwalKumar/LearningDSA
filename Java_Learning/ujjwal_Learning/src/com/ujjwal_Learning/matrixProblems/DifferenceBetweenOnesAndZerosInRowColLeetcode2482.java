package com.ujjwal_Learning.matrixProblems;

public class DifferenceBetweenOnesAndZerosInRowColLeetcode2482 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        int[][] diff = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    row[i] += grid[i][j];
                    col[j] += grid[i][j];
                }
            }
        }
        for(int i= 0; i < n; i++){
            for(int j = 0; j < m; j++){
                diff[i][j] = ( 2 * row[i] - n ) + ( 2 * col[j] - m);
            }
        }
        return diff;
    }

}
