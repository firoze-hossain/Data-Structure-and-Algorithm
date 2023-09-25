package com.dsa.udemy.heaps.priorityQueues;

import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.add(25);
        priorityQueue.add(-22);
        priorityQueue.add(1343);
        priorityQueue.add(54);
        priorityQueue.add(0);
        priorityQueue.add(-3492);
        priorityQueue.add(429);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove(54));
        System.out.println(priorityQueue.peek());
        System.out.println("===========");
        Object[] intNums = priorityQueue.toArray();
        for (Object num : intNums) {
            System.out.print(num + " ");
        }

    }
}
