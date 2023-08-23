package com.ujjwal_Learning.strings;

public class ExcelSheetColumnTitleLeetcode168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added solution
	public String convertToTitle(int columnNumber) {
		int n = columnNumber;
 
		StringBuilder result = new StringBuilder();

		while (n > 0) {
			n--;
			result.insert(0, (char) ('A' + n % 26));
			n /= 26;
		}

		return result.toString();
	}

}
