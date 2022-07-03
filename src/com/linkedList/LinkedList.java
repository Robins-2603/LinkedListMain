package com.linkedList;

public class LinkedList {
    Node head;
    Node tail;

    public Node push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }
    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node temp;
            temp = head;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
        }
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            this.tail.next = newNode;
        }
        tail = newNode;
    }
    // insert in between
    public void insertInBetween(Node previousNode ,Node newNode){
        Node tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
    }
    public void pop(){
        if(this.head==null){

        }
        Node temp =head;
        head = temp.next;
        temp =null;
    }
// to delete last element
    public void popLast(){
        if (head == null)
            System.out.println("No elements to delete..");
        else if (head.next == null)
            head = null;
        else {
            Node temp = head;

            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
        }
    }
}
