package com.ujjwal_Learning.binarySearch;

interface MountainArrayInterface {
	public int get(int index);

	public int length();
}

public class TripleBinarySearchFindInMountainArrayLeetcode1095 {

	class MountainArray implements MountainArrayInterface {

		@Override
		public int get(int index) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int length() {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findInMountainArray(int target, MountainArray A) {
		int n = A.length(), l, r, m, peak = 0;
		// find index of peak
		l = 0;
		r = n - 1;
		while (l < r) {
			m = (l + r) / 2;
			if (A.get(m) < A.get(m + 1))
				l = peak = m + 1;
			else
				r = m;
		}
		// find target in the left of peak
		l = 0;
		r = peak;
		while (l <= r) {
			m = (l + r) / 2;
			if (A.get(m) < target)
				l = m + 1;
			else if (A.get(m) > target)
				r = m - 1;
			else
				return m;
		}
		// find target in the right of peak
		l = peak;
		r = n - 1;
		while (l <= r) {
			m = (l + r) / 2;
			if (A.get(m) > target)
				l = m + 1;
			else if (A.get(m) < target)
				r = m - 1;
			else
				return m;
		}
		return -1;
	}

}
