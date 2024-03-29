package com.ujjwal_Learning.linkedList;

public class LinkedListCycleTwoLeetcode142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added leetcode solution
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				break;
		}
		if (fast == null || fast.next == null)
			return null;
		while (head != slow) {
			head = head.next;
			slow = slow.next;
		}
		return head;
	}

}
