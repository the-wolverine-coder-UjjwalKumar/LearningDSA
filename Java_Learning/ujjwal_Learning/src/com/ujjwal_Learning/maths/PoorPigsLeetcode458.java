package com.ujjwal_Learning.maths;

public class PoorPigsLeetcode458 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added solution
	public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
		int pigs = 0;
		while (Math.pow(minutesToTest / minutesToDie + 1, pigs) < buckets) {
			pigs += 1;
		}
		return pigs;
	}

}
