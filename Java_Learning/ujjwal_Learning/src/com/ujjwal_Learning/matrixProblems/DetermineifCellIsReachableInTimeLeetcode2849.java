package com.ujjwal_Learning.matrixProblems;

public class DetermineifCellIsReachableInTimeLeetcode2849 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
		int need = Math.max(Math.abs(sx - fx), Math.abs(sy - fy));
		return need > 0 ? t >= need : t != 1;
	}

}
