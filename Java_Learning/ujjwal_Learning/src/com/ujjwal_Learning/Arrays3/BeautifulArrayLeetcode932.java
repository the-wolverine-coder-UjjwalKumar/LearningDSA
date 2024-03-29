package com.ujjwal_Learning.Arrays3;

import java.util.ArrayList;

public class BeautifulArrayLeetcode932 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] beautifulArray(int N) {
		ArrayList<Integer> res = new ArrayList<>();
		res.add(1);
		while (res.size() < N) {
			ArrayList<Integer> tmp = new ArrayList<>();
			for (int i : res)
				if (i * 2 - 1 <= N)
					tmp.add(i * 2 - 1);
			for (int i : res)
				if (i * 2 <= N)
					tmp.add(i * 2);
			res = tmp;
		}
		return res.stream().mapToInt(i -> i).toArray();
	}

}
