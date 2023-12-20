package com.ujjwal_Learning.Arrays3;

public class BuyTwoChoclatesLeetcode2706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int buyChoco(int[] prices, int money) {

		int size = prices.length;

		if (size < 2)
			return money;

		int priceOne = Integer.MAX_VALUE;
		int priceTwo = Integer.MAX_VALUE;
		int p1Occ = -1;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < priceOne) {
				priceTwo = priceOne;
				priceOne = prices[i];
				p1Occ = i;
			} else if (prices[i] < priceTwo && i != p1Occ) {
				priceTwo = prices[i];
			}
		}

		return priceOne + priceTwo <= money ? money - (priceOne + priceTwo) : money;
	}

}
