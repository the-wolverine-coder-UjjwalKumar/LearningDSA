package com.ujjwal_Learning.stack;

import java.util.Stack;

public class StockSpanProblemTheory {
	
	public class  Pair {
		
		private int ele;
		private int index;
		
		public Pair(int _ele, int _index) {
			ele = _ele;
			index = _index;
		}
		
		public int getIndex() {
			return index;
		}
		
		public int getEle() {
			return ele;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here In this problem we need to find at given particular ith day 
		// number of consecutive stocks lesser and equal to current
		// Hint : Find the Nearest greater to left and store it's index and then do i - index to get actual count
		
		// IP - arr : {100, 80, 60, 70, 60, 75, 85}
		// OP - opp : {1, 1, 1, 2, 1, 4, 6}
		
		
		

	}
	
	private static int[] getNGL(int[] arr) {
		int n = arr.length;
		Stack<Pair> stack = new Stack<>();

		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {

			if (stack.isEmpty()) {
				ans[i] = -1;
			} else if (!stack.isEmpty() && stack.peek().getEle() > arr[i]) {
				ans[i] = stack.peek().getEle();
			} else if (!stack.isEmpty() && stack.peek().getEle() <= arr[i]) {
				while (!stack.isEmpty() && stack.peek().getEle() <= arr[i]) {
					stack.pop();
				}

				if (stack.isEmpty())
					ans[i] = -1;
				else
					ans[i] = stack.peek().getEle();
			}
			
			//stack.push(new Pair(arr[i],i));

		}

		return ans;
	}
	
	

}
