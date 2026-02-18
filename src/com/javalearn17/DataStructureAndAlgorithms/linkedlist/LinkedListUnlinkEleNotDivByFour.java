package com.javalearn17.DataStructureAndAlgorithms.linkedlist;


class LinkedListUnlinkEleNotDivByFour {
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;

    // Method to add elements to the doubly linked list
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

    // Method to remove elements not divisible by 4
    public void removeNotDivisibleBy4() {
        Node temp = head;

        while (temp != null) {
            if (temp.data % 4 != 0) {
                Node toDelete = temp;
                
                // Move temp to next before deleting
                temp = temp.next;

                // Unlink the node
                if (toDelete.prev != null) {
                    toDelete.prev.next = toDelete.next;
                } else {
                    head = toDelete.next; // If deleting head	
                }

                if (toDelete.next != null) {
                    toDelete.next.prev = toDelete.prev;
                }
            } 
            else {
                temp = temp.next;
            }
        }
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
     
    
    public static void main(String[] args) {
        LinkedListUnlinkEleNotDivByFour dll = new LinkedListUnlinkEleNotDivByFour();
        
        // Adding elements
        dll.add(10);
        dll.add(12);
        dll.add(8);
        dll.add(15);
        dll.add(20);
        dll.add(33);
        dll.add(16);
        		
        System.out.println("Original List:");
        dll.printList();

        
        dll.removeNotDivisibleBy4();

        System.out.println("After removing elements not divisible by 4:");
        dll.printList();
    }
}

