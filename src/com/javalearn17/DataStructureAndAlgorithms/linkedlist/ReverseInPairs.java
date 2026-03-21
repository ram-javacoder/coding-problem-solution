package com.javalearn17.DataStructureAndAlgorithms.linkedlist;

class ListNodeReverse {
    int val;
    ListNodeReverse next;

    ListNodeReverse(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseInPairs {

    public static ListNodeReverse reverseInPairs(ListNodeReverse head) {

        // If list empty or only one node
        if (head == null || head.next == null) {
            return head;
        }

        ListNodeReverse dummy = new ListNodeReverse(0);
        dummy.next = head;

        ListNodeReverse prev = dummy;

        while (prev.next != null && prev.next.next != null) {

            ListNodeReverse first = prev.next;
            ListNodeReverse second = prev.next.next;

            // Swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev to next pair
            prev = first;
        }

        return dummy.next;
    }

    // Utility method to print list
    public static void printList(ListNodeReverse head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" → ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        // Creating list: 1 → 2 → 3 → 4 → 5
        ListNodeReverse head = new ListNodeReverse(1);
        head.next = new ListNodeReverse(2);
        head.next.next = new ListNodeReverse(3);
        head.next.next.next = new ListNodeReverse(4);
        head.next.next.next.next = new ListNodeReverse(5);

        System.out.print("Original List: ");
        printList(head);

        head = reverseInPairs(head);

        System.out.print("\nReversed in Pairs: ");
        printList(head);
    }
}