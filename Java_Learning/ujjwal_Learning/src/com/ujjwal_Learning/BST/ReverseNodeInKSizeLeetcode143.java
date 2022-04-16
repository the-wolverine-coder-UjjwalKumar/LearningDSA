package com.ujjwal_Learning.BST;

import java.util.Stack;

import com.ujjwal_Learning.linkedList.ListNode;

public class ReverseNodeInKSizeLeetcode143 {

	public void reorderList(ListNode head) {
		int n = 0;
		Stack<ListNode> track = new Stack<>();
		ListNode temp = head;

		while (temp != null) {
			track.push(temp);// pushing the node into the stack
			temp = temp.next;
			n += 1;// counting the length
		}

		temp = head;

		for (int i = 0; i < n / 2; i++)// traversing to only the half length
		{
			ListNode str = temp.next;// storing the next node

			temp.next = track.peek();// current node pointing to the next node
			track.pop().next = str;// maintaining the link

			temp = temp.next.next;// as the pair consist of 2, we are covering 2 node at a time
		}
		temp.next = null;// to remove the cycle or the cyclic dependency of the elements
	}

}
