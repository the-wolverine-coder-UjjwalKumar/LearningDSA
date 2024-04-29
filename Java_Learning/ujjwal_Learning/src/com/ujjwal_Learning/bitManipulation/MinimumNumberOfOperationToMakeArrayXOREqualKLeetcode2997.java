package com.ujjwal_Learning.bitManipulation;

public class MinimumNumberOfOperationToMakeArrayXOREqualKLeetcode2997 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minOperations(int[] A, int k) {
		for (int a : A)
			k ^= a;
		return Integer.bitCount(k);
	}

}
