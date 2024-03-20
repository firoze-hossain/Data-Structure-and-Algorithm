package com.dsa.recap.priorityQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        //Standard way
        //it keeps element as they are adding in queue
        // and it serves element with first come first serve
        // Queue<Double> queue = new LinkedList<>();

        //Priority Based
        //it keeps the element in queue in a sorting order(Default ascending)
        // or we can say as highest priority element first than lower before we serving(poll() ,peek() etc)
        // Queue<Double>queue=new PriorityQueue<>();

        //we can set the priority in descending order also
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.16);
        queue.offer(1.5);
        queue.offer(4.0);
        queue.offer(3.0);
        queue.offer(2.9);
        //now serving the element with polling
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("*************");

        //For text case(it keeps in alphabetically)
        //Queue<String>queueText=new PriorityQueue<>();

        //we can set the priority in descending alphabetically order also
        Queue<String> queueText = new PriorityQueue<>(Collections.reverseOrder());
        queueText.offer("B");
        queueText.offer("A");
        queueText.offer("C");
        queueText.offer("F");
        queueText.offer("D");
        ;
        while (!queueText.isEmpty()) {
            System.out.println(queueText.poll());
        }

    }
}
