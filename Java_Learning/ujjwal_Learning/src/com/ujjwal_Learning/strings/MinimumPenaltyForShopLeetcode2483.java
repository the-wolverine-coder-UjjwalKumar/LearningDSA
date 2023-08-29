package com.ujjwal_Learning.strings;

public class MinimumPenaltyForShopLeetcode2483 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int bestClosingTime(String customers) {
		int res = 0;
		int customerLeft = 0;

		for (int i = 0; i < customers.length(); i++) {
			if (customers.charAt(i) == 'Y') {
				customerLeft++;

				if (customerLeft > 0) {
					res = i + 1;
					customerLeft = 0;
				}
			} else {
				customerLeft--;
			}
		}

		return res;
	}
}
