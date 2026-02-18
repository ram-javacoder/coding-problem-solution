package com.javalearn17.DataStructureAndAlgorithms.linkedlist;

public class RemoveDuplicateSortingLinkedList {

	// Definition of the ListNode class
	static class ListNode {
		int value;
		ListNode next;

		ListNode(int value) {
			this.value = value;
			this.next = null;
		}
	}

	// Function to remove duplicates from a sorted LinkedList
	public static ListNode removeDuplicates(ListNode head) {
		// Edge case: If the list is empty, return null
		if (head == null) {
			return null;
		}

		// Pointer to traverse the LinkedList
		ListNode current = head;

		// Traverse the list until the end
		while (current != null && current.next != null) {
			// If the current node has the same value as the next node, skip the next node
			if (current.value == current.next.value) {
				current.next = current.next.next; // Remove duplicate
			} else {
				current = current.next; // Move to the next node
			}
		}

		return head; // Return the modified list without duplicates
	}

	// Function to print the LinkedList
	public static void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.value + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// Create a sorted LinkedList with duplicate elements
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next.next = new ListNode(5);

		System.out.println("Original LinkedList:");
		printList(head);

		// Remove duplicates
		head = removeDuplicates(head);

		System.out.println("LinkedList after removing duplicates:");
		printList(head);
	}
}