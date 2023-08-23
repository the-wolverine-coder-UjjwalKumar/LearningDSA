package com.ujjwal_Learning.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReOrganizeStringLeetcode767 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = reorganizeStringN("aab");
		System.out.println(ans);

	}

	public String reorganizeString(String s) {
		PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> -(a[1] - b[1]));
		int[] chars = new int[26];

		for (char c : s.toCharArray()) {
			chars[c - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if (chars[i] > 0)
				maxHeap.offer(new int[] { i + 'a', chars[i] });
		}

		int[] hold = null;
		StringBuilder sb = new StringBuilder();
		while (!maxHeap.isEmpty()) {
			int[] curr = maxHeap.poll();
			char c = (char) curr[0];

			sb.append(c);
			curr[1]--;

			if (hold != null)
				maxHeap.offer(hold);

			if (curr[1] > 0)
				hold = curr;
			else
				hold = null;
		}

		return hold == null ? sb.toString() : "";
	}
	
	private static String reorganizeStringN(String inputS) {
		StringBuilder sb = new StringBuilder();
		
		Map<Character,Integer> hashMap = new HashMap<>();
		
		for (int i = 0; i < inputS.length(); i++) {
			int cnt = hashMap.getOrDefault(inputS.charAt(i), 1);
			hashMap.put(inputS.charAt(i), (cnt+1));
		}
		
		PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> -(a.getCnt() - b.getCnt()));
		
		for (Map.Entry<Character,Integer> entry : hashMap.entrySet()) {
			Pair record = new Pair(entry.getKey(), entry.getValue());
			maxHeap.add(record);
		}
		
		// Now 
		Pair blocked;
		Pair currItem;
		
		blocked = maxHeap.poll();
		
		sb.append(blocked.getCh());
		blocked.setCnt((blocked.getCnt()-1));
		
		while (maxHeap.size() > 0) {
			currItem = maxHeap.poll();
            sb.append(currItem.getCh());
            currItem.setCnt((currItem.getCnt()-1));

            if (blocked.getCnt()>0)
                maxHeap.add(blocked);
            blocked = currItem;
		}
		
		if (blocked.getCnt()!=0 && maxHeap.size() == 0) {
			return "";
		}
		
		return sb.toString();
	}
	
	static class Pair {
		char ch;
		int cnt;
		
		public Pair(char ch, int cnt) {
			this.ch = ch;
			this.cnt = cnt;
		}
		
		public char getCh() {
			return this.ch;
		}
		
		public int getCnt() {
			return this.cnt;
		}
		
		public void setCh(char ch) {
			this.ch = ch;
		}
		
		public void setCnt(int cnt) {
			this.cnt = cnt;
		}
	}

}
