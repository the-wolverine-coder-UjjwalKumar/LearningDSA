package com.ujjwal_Learning.linkedList;

public class PalinDromeLinkedListLeetCode234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Added Leetcode daily solution
	public boolean isPalindrome(ListNode head) {
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		if (fast != null) { // odd nodes: let right half smaller
			slow = slow.next;
		}
		slow = reverse(slow);
		fast = head;

		while (slow != null) {
			if (fast.val != slow.val) {
				return false;
			}
			fast = fast.next;
			slow = slow.next;
		}
		return true;
	}

	// added palindrome solution
	public ListNode reverse(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}

}
