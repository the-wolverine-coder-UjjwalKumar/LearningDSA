package com.ujjwal_Learning.bitManipulation;

public class NumberOf1BitLeetcode191 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// count # of bits equal to 1
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		int setBitCount = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & 1) == 1)
				setBitCount++;

			n = n >> 1;
		}

		return setBitCount;
	}

}
