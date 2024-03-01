package com.ujjwal_Learning.strings;

import java.util.Arrays;

public class MaximumOddBinaryNumberLeetcode2864 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String maximumOddBinaryNumber1(String s) {
		int[] arr = new int[2];
		int n = s.length();
		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt("" + s.charAt(i))]++;
		}

		String lastBit = "";
		if (arr[1] > 0) {
			lastBit += "1";
			arr[1]--;
			n -= 1;
		}

		String front = "";
		while (arr[0] > 0) {
			front += "0";
			arr[0]--;
		}

		while (arr[1] > 0) {
			front = "1" + front;
			arr[1]--;
		}

		return front + lastBit;

	}

	public String maximumOddBinaryNumber(String s) {
		int n = s.length();
		String[] ch = new String[n];
		Arrays.fill(ch, "0");
		int j = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '1') {
				ch[j] = "1";
				j++;
			}
		}

		ch[j - 1] = "0";
		ch[n - 1] = "1";

		return String.join("", ch);

	}

}
