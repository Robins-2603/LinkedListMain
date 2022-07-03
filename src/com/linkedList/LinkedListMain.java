package com.linkedList;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("-------welcome to linkedList---------");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.To add Data at start");
        System.out.println("2.To add Data at End");
        System.out.println("3.To insert Data in between two values");
        System.out.println("4. To delete the first element in list");
        System.out.println("5. To delete the last element in list");
        System.out.println("6. To search the specific element in list");
        System.out.println("7. To insert the data at specific index position");
        System.out.println("8. To delete the data at specific index position");
        switch (sc.nextInt()){

            case 1:
                Operations.addDataAtStart();
                break;
            case 2:
                Operations.addDataAtEnd();
                break;
            case 3:
                Operations.insertInBetween();
                break;
            case 4:
                Operations.pop();
                break;
            case 5:
                Operations.popLast();
                break;
            case 6:
                Operations.search();
                break;
            case 7:
                Operations.insertAtSpecificIndex();
                break;
            case 8:
                Operations.deleteAtIndexPosition();
                break;
        }
    }
}
