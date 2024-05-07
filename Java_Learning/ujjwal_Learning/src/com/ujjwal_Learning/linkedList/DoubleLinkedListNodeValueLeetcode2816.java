package com.ujjwal_Learning.linkedList;

public class DoubleLinkedListNodeValueLeetcode2816 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode doubleIt(ListNode head) {
	       if (head.val > 4)
	            head = new ListNode(0, head);
	        for(ListNode node = head; node != null; node = node.next) {
	            node.val = (node.val * 2) % 10;
	            if (node.next != null && node.next.val > 4)
	                node.val++;
	        }
	        return head;
	    }

}
