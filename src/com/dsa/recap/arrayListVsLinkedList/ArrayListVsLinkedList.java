package com.dsa.recap.arrayListVsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long statTime;
        long endTime;
        long elapsedTime;
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);

        }

        /***************************** Linkedlist *******************/
        statTime = System.nanoTime();
        //random access is always worst than ArrayList
        //getting first index value
        //linkedList.get(0);
        //get the middle of the element
        //linkedList.get(500000);
        //get the last element
        // arrayList.get(999999);
        //**Now remove element from first of the list
        //  linkedList.remove(0);
        //remove element from the middle of the list
        // linkedList.remove(500000);
        //remove element from the last of the list
        linkedList.remove(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - statTime;
        System.out.println("LinkedList: " + elapsedTime + " ns");


        /***************************** Arraylist *******************/
        statTime = System.nanoTime();
        //**Random access is always faster than LinkedList**
        //getting first index value
        //  arrayList.get(0);
        //get the middle of the element
        //arrayList.get(500000);
        //get the last element
        //arrayList.get(999999);
        //***Remove Element from the first
        // arrayList.remove(0);
        //remove element from the middle of the list
        //  arrayList.remove(500000);
        //remove element from the last of the list
        arrayList.remove(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - statTime;
        System.out.println("ArrayList: " + elapsedTime + " ns");

    }
}
