package com.ujjwal_Learning.Arrays3;

public class BestTimeToBuyNSellWithCoolDownLeetcode309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProfit(int[] prices) {
		int sold = Integer.MIN_VALUE, held = Integer.MIN_VALUE, reset = 0;

		for (int i : prices) {
			int presold = sold;
			sold = held + i;
			held = Math.max(held, reset - i);
			reset = Math.max(reset, presold);
		}

		return Math.max(sold, reset);
	}

}
