package com.javalearn17.DataStructureAndAlgorithms.linkedlist;


class LinkedListNotDivByFour {

    // Node class scoped privately inside the list
    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Head is now an instance field (not static)
    private Node head;

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
        newNode.prev = temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void removeEleNotDivByFour() {
        Node temp = head;

        while (temp != null) {
            if (temp.data % 4 != 0) {
                Node toDelete = temp;
                temp = temp.next; // Move forward before updating links

                if (toDelete.prev != null) {
                    toDelete.prev.next = toDelete.next;
                } else {
                    head = toDelete.next; // Updating head if first element
                }

                if (toDelete.next != null) {
                    toDelete.next.prev = toDelete.prev;
                }
            } else {
                temp = temp.next;
            }
        }
    }
}

public class LinkedListUnlinkEleNotDivByFour {
    public static void main(String[] args) {
        LinkedListNotDivByFour list = new LinkedListNotDivByFour();
        list.add(10);
        list.add(12);
        list.add(3);
        list.add(8);
        list.add(13);

        System.out.println("Original list:");
        list.printList();

        list.removeEleNotDivByFour();

        System.out.println("\nAfter removing numbers not divisible by 4:");
        list.printList();
    }
}