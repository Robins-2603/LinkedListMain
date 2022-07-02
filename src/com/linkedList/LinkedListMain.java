package com.linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("-------welcome to linkedList---------");
// creating Node object
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
// initializing head
        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
// traversing to check
        Node temp = head;
        while (temp!=null) {
            System.out.println( temp.data);
            temp = temp.next;
        }
    }


}
