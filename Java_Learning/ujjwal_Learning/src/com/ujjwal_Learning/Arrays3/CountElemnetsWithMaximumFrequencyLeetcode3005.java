package com.ujjwal_Learning.Arrays3;

public class CountElemnetsWithMaximumFrequencyLeetcode3005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxFrequencyElements(int[] nums) {
		int a[] = new int[101];
		for (int i : nums) {
			a[i]++;
		}
		int maxi = 0;
		for (int i = 0; i <= 100; i++) {
			maxi = Math.max(maxi, a[i]);
		}
		int ans = 0;
		for (int i = 0; i <= 100; i++) {
			if (a[i] == maxi) {
				ans += maxi;
			}
		}
		return ans;
	}

}
