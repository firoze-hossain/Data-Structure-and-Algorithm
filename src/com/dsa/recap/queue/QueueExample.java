package com.dsa.recap.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //In java queue is an interface
        //so can not instantiate it
        //we can implement by another class
        // In java collection hierarchy two class implements it
        // LinkedList and PriorityQueue
        // but PriorityQueue processed element based on some priority
        //so better use to LinkedList
        Queue<String> queue = new LinkedList<>();
        //first Add element
        //it means enqueue(add)
        // Two methods to add
        //add()->add element at the tail(throws exception)
        //so better use to offer() method-it does not throw exception
        queue.offer("Firoze");
        queue.offer("Rayhan");
        queue.offer("Millat");
        queue.offer("Imtiaze");
        System.out.println(queue);

        //to remove method form the head there's two method
        // poll()->remove element without throwing exception and remove()->but it throws exception
//        queue.poll();
//        queue.poll();
//        queue.poll();
//        queue.poll();
        // queue.poll();//it returns empty array.. but does not throws exception
        // queue.remove();//throws NoSuchElementException
        System.out.println(queue);
        //there's two method two find element at the top
        //element()-> it throws exception
        //peek()-> it does not occur exception
        System.out.println(queue.peek());

        //as queue extends collection interface
        //we get additional method to perform some other action
        //contain(is element present-it returns boolean)
        System.out.println(queue.contains("Millat"));
        //isEmpty()-> the queue is empty or not it checks
        System.out.println(queue.isEmpty());
        //want to know size of queue-size() method
        System.out.println(queue.size());
    }
}
