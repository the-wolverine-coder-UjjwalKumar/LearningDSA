package com.ujjwal_Learning.linkedList;

public class MergeInBetweenLinkedListLeetcode1669 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeInBetween1(ListNode list1, int a, int b, ListNode list2) {
		ListNode prevA = null;
		ListNode nextB = null;
		int aCount = 0;
		int bCount = 0;

		ListNode temp = list1;
		while (bCount <= b) {

			if (aCount == a - 1) {
				prevA = temp;
			}

			if (bCount == b) {
				nextB = temp.next;
			}

			if (prevA != null && nextB != null)
				break;

			aCount++;
			bCount++;

			temp = temp.next;
		}

		ListNode list2lastNode = null;
		ListNode temp2 = list2;
		while (temp2.next != null) {
			temp2 = temp2.next;
		}

		if (prevA != null) {
			prevA.next = list2;
		}

		if (nextB != null) {
			temp2.next = nextB;
		}

		return list1;

	}

	// added solution for merging the nodes 
	public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
		ListNode first = list1;
		ListNode second = list1;
		ListNode ans = first;
		int i = 1;
		int j = 0;
		while (i < a) {
			first = first.next;
			i++;
		}
		while (j < b) {
			second = second.next;
			j++;
		}
		first.next = list2;
		ListNode secon = list2;
		while (secon.next != null) {
			secon = secon.next;
		}
		secon.next = second.next;

		// System.out.println(first.next.val);
		// System.out.println(second.val);

		return ans;
	}

}
