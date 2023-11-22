package com.ujjwal_Learning.strings;

public class MinimumTimeToCoolectGarbageLeetcode2391 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int garbageCollection(String[] garbage, int[] travel) {
		int sum = 0, mul = 0;
		int p = 0, g = 0, m = 0;
		for (int i = garbage.length - 1; i > 0; i--) {
			sum += garbage[i].length();
			if (mul < 3) {
				for (int j = 0; j < garbage[i].length(); j++) {
					char ch = garbage[i].charAt(j);
					switch (ch) {
					case 'P':
						mul = p == 0 ? mul + 1 : mul;
						p++;
						break;
					case 'G': 
						mul = g == 0 ? mul + 1 : mul;
						g++;
						break;
					case 'M':
						mul = m == 0 ? mul + 1 : mul;
						m++;
						break;
					default:
						break;
					}
				}
			}
			sum += (mul * travel[i - 1]);
		}
		sum += garbage[0].length();
		return sum;
	}

}
