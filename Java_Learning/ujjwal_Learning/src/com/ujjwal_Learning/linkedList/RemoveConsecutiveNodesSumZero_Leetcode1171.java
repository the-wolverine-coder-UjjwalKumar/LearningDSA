package com.ujjwal_Learning.linkedList;

import java.util.HashMap;
import java.util.Map;

public class RemoveConsecutiveNodesSumZero_Leetcode1171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode removeZeroSumSublists(ListNode head) {
		ListNode preHead = new ListNode(0), curr = preHead;
		preHead.next = head;
		int prefix = 0;
		Map<Integer, ListNode> map = new HashMap<>();
		while (curr != null) {
			prefix += curr.val;
			if (map.containsKey(prefix)) {
				curr = map.get(prefix).next;
				int p = prefix + curr.val;
				// removing all prefix entry from map who contributed here till next prefix sum
				// is same
				while (p != prefix) {
					map.remove(p);
					curr = curr.next;
					p += curr.val;
				}
				map.get(prefix).next = curr.next;
			} else {
				map.put(prefix, curr);
			}
			curr = curr.next;
		}
		return preHead.next;
	}

}
