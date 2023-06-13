package com.ujjwal_Learning.matrixProblems;

import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColPairsLeetcode2352 {

	public static void main(String[] args) {
        //int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // [[3,2,1],[1,7,6],[2,7,7]]
        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        int count = equalPairs(grid);
        System.out.println("Number of pairs: " + count);
    }

    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int[] row = grid[i];
            int[] col = getCol(grid, i);

            ans += getEqualCount(row, col, i); // Subtract 1 for excluding the pair (ri, ci) where ri = ci
        }

        return ans;
    }

    private static int getEqualCount(int[] row, int[] col, int currRow) {
        int n = row.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i!=currRow && row[i] == col[i]) {
                count++;
            }
        }
        return count;
    }

    private static int[] getCol(int[][] grid, int col) {
        int[] column = new int[grid.length];

        for (int r = 0; r < grid.length; r++) {
            column[r] = grid[r][col];
        }

        return column;
    }
    
    public int equalPairs2(int[][] g) {
		int n = g.length;
        int res = 0;
		//convert the numbers in each row to a single string
        Map<String, Integer> sToFreq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) { 
                sb.append(g[i][j]);
                sb.append("+");
            }
            String s = sb.toString();
            sToFreq.put(s, sToFreq.getOrDefault(s, 0) + 1);
        }
        
		//convert the numbers in each col to string and find the matches
        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) { 
                sb.append(g[i][j]);
                sb.append("+");
            }
            String s = sb.toString();
            if (sToFreq.containsKey(s)) {
                res += sToFreq.get(s);
            }
        }
        return res;
    }
}
