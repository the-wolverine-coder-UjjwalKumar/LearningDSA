package com.ujjwal_Learning.LeetCodeQuestions;

public class OddEvenLinkedListLeetCode328 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode oddP = head;
		ListNode evenP = head.next;
		ListNode evenH = evenP;

		while (evenP != null && evenP.next != null) {

			oddP.next = evenP.next;
			oddP = oddP.next;
			evenP.next = oddP.next;
			evenP = evenP.next;

		}

		oddP.next = evenH;
		return head;

	}

}
