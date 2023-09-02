package com.dsa.udemy.lists.singlyLinkedList.integerLinkedList;


public class SinglyLinkedList {
    public static void main(String[] args) {
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        IntegerLinkedList list = new IntegerLinkedList();
        list.insertedSort(three);
        list.printList();
        list.insertedSort(two);
        list.printList();
        list.insertedSort(one);
        list.printList();
        list.insertedSort(four);
        list.printList();
    }
}
