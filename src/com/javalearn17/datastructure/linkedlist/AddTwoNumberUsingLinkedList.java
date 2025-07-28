package com.javalearn17.datastructure.linkedlist;


/*Problem Explanation: Add Two Numbers (as Linked Lists)
You're given two linked lists representing two non-negative integers, where:

The digits are stored in reverse order.

Each node contains a single digit.

You need to add the two numbers and return the sum as a linked list, also in reverse order.

l1 = [2,4,3]  → represents the number 342 (because it’s in reverse order)
l2 = [5,6,4]  → represents the number 465

342 + 465 = 807 → result should be [7,0,8] (again, reverse order)
*/



class ListNode {

	int val;
	ListNode next;

	ListNode(int x) {

		val = x;
	}

}

public class AddTwoNumberUsingLinkedList {

	public static void main(String args[]) {

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		ListNode result = addTwoNumbers(l1, l2);
		System.out.print("[ ");
		while (result != null) {

			System.out.print(result.val);
			if (result.next != null) {
				System.out.print(", ");
			}

			result = result.next;

		}
		System.out.println(" ]");

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {
			int sum = carry;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;

			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;

			}
			carry = sum / 10;
			current.next = new ListNode(sum % 10);
			current = current.next;

		}

		return dummy.next;
	}

}
