package com.javalearn17.DataStructureAndAlgorithms.linkedlist;

class ReverseList {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}

	}

	ListNode head;

	public void add(int x) {
		ListNode newNode = new ListNode(x);
		while (head == null) {
			head = newNode;
			return;
		}
		ListNode temp = head;
		while (temp.next != null) {
			temp = temp.next;

		}
		temp.next = newNode;

	}

	public void printElement() {
		ListNode temp = head;
		while (temp != null) {

			System.out.print(temp.val + " -> ");

			temp = temp.next;
		}
		System.out.println("Null");

	}

	public void reverseElement() {
		ListNode prev = null;
		ListNode current = head;
		ListNode next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		head = prev;

	}
}

public class ReverseListDemo {

	public static void main(String args[]) {
		ReverseList r = new ReverseList();
		r.add(1);
		r.add(2);
		r.add(2);
		r.add(3);
		r.add(4);
		r.add(4);
		System.out.println("Original Elements: ");
		r.printElement();
		System.out.println("After reversing the elements: ");
		r.reverseElement();
		r.printElement();
	}

}
