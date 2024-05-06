package com.ujjwal_Learning.linkedList;

public class RemoveNodeGreaterValueLeetcode2487 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode removeNodes(ListNode head) {
		return helper(head);
	}

	public ListNode helper(ListNode node) {
		if (node == null)
			return null;

		node.next = helper(node.next);

		if (node.next != null && node.val < node.next.val) {
			return node.next;
		}

		return node;
	}
}
