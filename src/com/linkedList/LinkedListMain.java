package com.linkedList;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("-------welcome to linkedList---------");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.To add Data at start");
        System.out.println("2.To add Data at End");
        switch (sc.nextInt()){

            case 1:
                Operations.addDataAtStart();
                break;
            case 2:
                Operations.addDataAtEnd();
                break;
        }
    }
}
