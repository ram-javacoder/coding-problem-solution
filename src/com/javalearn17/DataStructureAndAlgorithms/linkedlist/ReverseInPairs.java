package com.javalearn17.DataStructureAndAlgorithms.linkedlist;

class ReverseLinkedList {

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

    Node head;

    public void add (int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
    }

    public void printElements() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value);
            if(temp.next != null) {
                System.out.print(", ");
            }
            temp = temp.next;
        }

    }

    public Node reverseList (Node head) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = prev.next.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }

        return dummy.next;
    }
}


public class ReverseInPairs {

    public static void main (String args[]) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println("Inputs : ");
        list.printElements();

        list.head = list.reverseList(list.head);
        System.out.println("\nOutputs : ");
        list.printElements();


    }

}

