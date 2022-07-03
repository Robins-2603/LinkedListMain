package com.linkedList;

public class LinkedList {
    Node head;
    Node tail;

    public void addDataAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            Node temp = head;// 56=>30=>70
            this.head = newNode;
            newNode.next = temp;
        }
    }
    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
        }
    }
}
