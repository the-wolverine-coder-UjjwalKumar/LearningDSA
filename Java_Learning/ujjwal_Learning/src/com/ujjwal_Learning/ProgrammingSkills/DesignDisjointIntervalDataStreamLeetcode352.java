package com.ujjwal_Learning.ProgrammingSkills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DesignDisjointIntervalDataStreamLeetcode352 {

	static class SummaryRanges {

		private List<List<Integer>> dataStream;

		public SummaryRanges() {
			dataStream = new ArrayList<>();

		}

		public void addNum(int value) {
			List<Integer> interval = new ArrayList<>(Arrays.asList(value, value));
			dataStream.add(interval);

			// dissolve logic
			dissolveIntervals(dataStream);
		}

		private void dissolveIntervals(List<List<Integer>> dataStream) {
			// TODO Auto-generated method stub
			// Sort based on starting
			dataStream.sort((a, b) -> (Integer.compare(a.get(0), b.get(0))));

			// Collections.sort(dataStream, (a,b)->(a.get(0) - b.get(0)));

			Stack<List<Integer>> stack = new Stack<>();
			stack.push(dataStream.get(0));
			
			for(int i = 1; i < dataStream.size(); i++) {
				List<Integer> topInterval = stack.peek();
				List<Integer> currentInterval = dataStream.get(i);
				
				if(currentInterval.get(0) == topInterval.get(1)+1) {
					// next interval found
					stack.pop();
					topInterval.set(1, currentInterval.get(0));
					stack.push(topInterval);
				} else {
					stack.push(currentInterval);
				}
			}
			
			
			dataStream = new ArrayList<>(stack);
			
			
		}

		public int[][] getIntervals() {
			dataStream.sort((a, b) -> (Integer.compare(a.get(0), b.get(0))));
			int[][] ans = new int[dataStream.size()][];
			int i = 0;
			for(List<Integer> interval : dataStream) {
				int[] arr = new int[2];
				arr[0] = interval.get(0);
				arr[1] = interval.get(1);
				
				ans[i] = arr;
				i++;
			}
			
			return ans;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SummaryRanges obj = new SummaryRanges();

		// [[],[1],[],[3],[],[7],[],[2],[],[6],[]]

		obj.addNum(1);
		obj.addNum(2);
		obj.addNum(3);
		obj.addNum(7);

		int[][] param_2 = obj.getIntervals();
		for(int[] i : param_2) {
			System.out.println(Arrays.toString(i));
		}
	}

	class Interval {
		private int start;
		private int end;

		Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

//	TreeMap<Integer, int[]> map;
//
//	public SummaryRanges() {
//		map = new TreeMap<Integer,int[]>();
//	}
//
//	public void addNum(int val) {
//		if (map.containsKey(val))
//			return;
//		Integer lowerKey = map.lowerKey(val);
//		Integer higherKey = map.higherKey(val);
//		if (lowerKey != null && higherKey != null && val == map.get(lowerKey)[1] + 1
//				&& val == map.get(higherKey)[0] - 1) {
//			map.get(lowerKey)[1] = map.get(higherKey)[1];
//			map.remove(higherKey);
//		} else if (lowerKey != null && val <= map.get(lowerKey)[1] + 1) {
//			map.get(lowerKey)[1] = Math.max(val, map.get(lowerKey)[1]);
//		} else if (higherKey != null && val == map.get(higherKey)[0] - 1) {
//			map.put(val, new int[] { val, map.get(higherKey)[1] });
//			map.remove(higherKey);
//		} else {
//			map.put(val, new int[] { val, val });
//		}
//	}
//
//	public int[][] getIntervals() {
//		int[][] res = new int[map.size()][2];
//		int i = 0;
//		for (int[] a : map.values()) {
//			res[i++] = a;
//		}
//		return res;
//	}

}
