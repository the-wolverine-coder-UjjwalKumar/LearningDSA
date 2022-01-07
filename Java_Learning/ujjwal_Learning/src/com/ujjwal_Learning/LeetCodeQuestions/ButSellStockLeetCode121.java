package com.ujjwal_Learning.LeetCodeQuestions;

public class ButSellStockLeetCode121 {

	/*
	 * Input: prices = [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price = 1)
	 * and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2
	 * and selling on day 1 is not allowed because you must buy before you sell.
	 * Example 2:
	 * 
	 * Input: prices = [7,6,4,3,1] Output: 0 Explanation: In this case, no
	 * transactions are done and the max profit = 0.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = { 7, 1, 5, 3, 6, 4 };

		int finalProfit = maxProfit(prices);
		System.out.println(finalProfit);

	}

	private static int maxProfit(int[] prices) {

		int n = prices.length;
		int finalProfit = 0;
		for (int i = 0; i < n - 1; i++) {
			int currentProfit = 0;
			int currentPrice = prices[i];
			for (int j = i + 1; j < n; j++) {
				int tempProfit = prices[j] - currentPrice;

				currentProfit = max(currentProfit, tempProfit);

			}
			finalProfit = max(currentProfit, finalProfit);

		}
		return finalProfit;
	}

	private static int max(int currentProfit, int tempProfit) {

		return currentProfit > tempProfit ? currentProfit : tempProfit;
	}

}
