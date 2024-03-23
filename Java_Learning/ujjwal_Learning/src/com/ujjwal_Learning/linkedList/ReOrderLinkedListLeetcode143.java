package com.ujjwal_Learning.linkedList;

import java.util.Stack;

public class ReOrderLinkedListLeetcode143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

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
	
	public void reorderList1(ListNode head) {
        if(head.next != null && head != null) {

            ListNode slow = head;
            ListNode fast = head.next;

            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }


            if(fast.next != null){
                slow = slow.next;
            }

            ListNode temp = slow.next;
            ListNode newHead = temp;
            slow.next = null;

            newHead = reverse(newHead, null);

            ListNode curr = head;

            while(newHead != null){
                ListNode node = curr.next;
                curr.next = newHead;
                newHead = node;
                curr = curr.next;
            }
        }
    }
	
    public ListNode reverse(ListNode head, ListNode prev){
        if(head == null) return prev;
        ListNode newHead = head.next;
        head.next = prev;
        return reverse(newHead, head);
    }

}
