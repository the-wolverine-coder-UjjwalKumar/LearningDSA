package com.ujjwal_Learning.maths;

public class ThousandSeperatorLeetcode1556 {

	public static void main(String[] args) {
		int n = 123456789;
		System.out.println(thousandSeparator2(n));
	}

	public static String thousandSeparator1(int n) {
		Integer value = n;
		if (value < 1000)
			return value.toString();

		Integer q = n / 1000;
		Integer r = n % 1000;

		String last = r == 0 ? "0" : r.toString();
		return q.toString() + "." + last;

	}

	public static String thousandSeparator(int n) {
		String num = Integer.toString(n);
		StringBuilder sb = new StringBuilder();
		for (int i = num.length(); i > 0; i -= 3) {
			if (sb.length() > 0)
				sb.insert(0, ".");
			sb.insert(0, num.substring(Math.max(0, i - 3), i));
		}
		return sb.toString();
	}
	
	public static String thousandSeparator2(int n) {
		String num = Integer.toString(n);
		StringBuilder sb = new StringBuilder();
		
		if(n < 1000) return num.toString();
		
		for(int i = num.length(); i>0; i -= 3) {
			if(sb.length() > 0) sb.insert(0, ".");
			
			sb.insert(0, num.substring(Math.max(0, i - 3), i));
		}
		
		return sb.toString();
	
	}
	
	

}
