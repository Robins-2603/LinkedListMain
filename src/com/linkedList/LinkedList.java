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
// to search the data
    public void search(int searchData)
    {
        if(head.data == searchData)
            System.out.println(searchData + " is Found");
        else
        {
            Node temp=head;

            boolean isFound=false;

            while(temp!=null)
            {
                if(temp.data == searchData)
                {
                    isFound = true;
                    break;
                }

                temp=temp.next;
            }
            System.out.println("                      ");
            if(isFound == true)
                System.out.println(searchData+ " is Found");
            else
                System.out.println(searchData+" is not found..");
        }

    }

    public int size() {
        int count = 0; // No data 1 element

        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Size of Array is :"+count);
        return count;
    }

    public void insertAtSpecificIndex(int userIndex, int data) {

        // User trying to insert @ first position
        if (userIndex == 0)
            push(data);

            // // User trying to insert @ last position
        else if (userIndex == size())
            append(data);

            // User trying to insert @ invalid position
        else if (userIndex < 0 || userIndex >= size())
            System.out.println("Invalid index");
            // User trying to insert @ specific index
        else {
            // Creating New Node
            Node newNode = new Node(data);

            // To track traversing
            int index = 0;

            // Pointers to track left & right side elements
            Node left = head;
            Node right = left.next;

            // Traverse or Move till last element before user entered index
            while (index < userIndex - 1) {
                left = left.next;
                right = right.next;
                index++;
            }

            // Connnecting new Node with right side elements
            newNode.next = right;
            // Connnecting left side elements with new Node
            left.next = newNode;

        }
    }
// delete at specific pos
    public void deleteAtIndexPosition(int data) {
        Node temp = head;               //56,30,40,70
        if (head.key == data) {
            pop();
        } else if (tail.key == data) {
            popLast();
        } else {
            while (temp != null) {
                if (temp.next.key == data) {
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
    }
}
