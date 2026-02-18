package com.javalearn17.DataStructureAndAlgorithms.linkedlist;

//This is standard approach 
class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}
}

class LinkedList {
	private Node head;

	// Add node
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// Remove consecutive duplicates
	public void removeDuplicates() {
		Node temp = head;
		while (temp != null && temp.next != null) {
			if (temp.data == temp.next.data) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
	}

	// Print elements
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
}

public class RemoveDuplicates {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("Input:");
		list.printList();

		list.removeDuplicates();

		System.out.println("Output:");
		list.printList();
	}
}