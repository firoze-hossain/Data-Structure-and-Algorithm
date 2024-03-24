package com.dsa.recap.linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String>linkedList=new LinkedList<>();
        //stack using linkedList
        //Stack-LIFO-Last In First Out
//        linkedList.push("Java");
//        linkedList.push("Spring Boot");
//        linkedList.push("JPA");
//        linkedList.push("MySQL");
//        linkedList.push("Angular");
//        System.out.println(linkedList);
        //to remove last element of stack we can use pop() method
//        linkedList.pop();
//        System.out.println(linkedList);
        //queue using linkedList
        //Queue-FIFO-First In First Out
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        System.out.println(linkedList);
        //to remove first element of stack we can use poll() method
       // linkedList.poll();
        System.out.println(linkedList);
        // we can add element in linkedlist using add(index-0 based,Object obj) method
       // linkedList.add(5,"E");
       // System.out.println(linkedList);

        //add element in first with addFirst() Method
        linkedList.addFirst("0");
        System.out.println(linkedList);
        //add element in last with addLast() Method
        linkedList.addLast("G");
        System.out.println(linkedList);

        //we can remove first element using removeFirst() method
        linkedList.removeFirst();
        System.out.println(linkedList);linkedList.indexOf("B");
        //we can remove last element  using removeFirst() method
        linkedList.removeLast();
        System.out.println(linkedList);

        //we can get index of element using indexOf(Object obj)
        //search element it will take O(n)-Linear time
        System.out.println(linkedList.indexOf("B"));

    }
}
