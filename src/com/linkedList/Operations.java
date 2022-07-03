package com.linkedList;

public class Operations {
    public static void addDataAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }
    // for append
    public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
    //insert in b/w
    public static void insertInBetween() {
        LinkedList linkedList = new LinkedList();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode= new Node(30);
        System.out.println("Before:");
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        System.out.println("after:");
        linkedList.print();

    }
    // delete at start
    public static void pop() {
        LinkedList linkedList = new LinkedList();
        Node firstNode = linkedList.push(70);
        Node secondNode = linkedList.push(30);
        Node newNode = linkedList.push(56);
        System.out.println("Before");
        linkedList.print();
        linkedList.pop();
        System.out.println();
        System.out.println("After");
        linkedList.print();
        System.out.println(" ");
        linkedList.size();
    }

    //method to delete last element
    public static void popLast(){
        LinkedList linkedList=new LinkedList();
        Node firstNode= linkedList.push(70);
        Node secondNode= linkedList.push(30);
        Node newNode=linkedList.push(56);
        System.out.println("Before");
        linkedList.print();
        System.out.println(         );
        linkedList.popLast();
        System.out.println("After");
        linkedList.print();
        System.out.println(" ");
        linkedList.size();

    }

    //method to search specific value
    public static void search(){
        LinkedList linkedList=new LinkedList();
        Node firstNode= linkedList.push(70);
        Node secondNode= linkedList.push(30);
        Node newNode=linkedList.push(56);
        System.out.println("Before");
        linkedList.print();
        linkedList.search(30);
        System.out.println(" ");
        linkedList.size();
    }
// insert at specific pos
    public static void insertAtSpecificIndex() {
        LinkedList linkedList = new LinkedList();
        Node firstNode = linkedList.push(70);
        Node secondNode = linkedList.push(30);
        Node newNode = linkedList.push(56);
        System.out.println("Before");
        linkedList.print();
        System.out.println("                                      ");
        linkedList.insertAtSpecificIndex(2, 40);
        System.out.println("After");
        linkedList.print();
        System.out.println(" ");
        linkedList.size();

    }
// delete at specific pos
    public static void deleteAtIndexPosition(){
        LinkedList linkedList = new LinkedList();
        Node firstNode = linkedList.push(70);
        Node secondNode = linkedList.push(30);
        Node newNode = linkedList.push(56);
        System.out.println("Before");
        linkedList.print();
        System.out.println("                                      ");
        linkedList.insertAtSpecificIndex(2, 40);
        System.out.println("After");
        linkedList.print();
        System.out.println(" ");
        linkedList.size();
        System.out.println("      ");
        System.out.println("After Deleting The Value");
        linkedList.deleteAtIndexPosition(40);
        linkedList.print();
        System.out.println(" ");
        linkedList.size();


    }
}
