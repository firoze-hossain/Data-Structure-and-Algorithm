package com.dsa.udemy.queues.circularQueuePt1;


public class QueueUsingArray {
    public static void main(String[] args) {
        Employee firoze = new Employee("Md. Firoze", "Hossain", 111);
        Employee rayhan = new Employee("Md. Sykhul", "Islam", 112);
        Employee millat = new Employee("Md. Ahsanul Haque", "Millat", 113);
        Employee imtiaze = new Employee("Ahammed", "Imtiaze", 114);
        Employee mydul = new Employee("Md. Mydul", "Islam", 115);
        ArrayQueue queue = new ArrayQueue(5);


        queue.add(firoze);
        queue.add(rayhan);
        queue.remove();
        queue.add(millat);
        queue.remove();
        queue.add(imtiaze);
        queue.remove();
        queue.add(mydul);
        queue.remove();
        queue.add(firoze);

        queue.printQueue();
//        queue.add(firoze);
//        queue.add(rayhan);
//        queue.add(millat);
//        queue.add(imtiaze);
//        queue.add(mydul);
//        queue.printQueue();
//        System.out.println("=========");
//        queue.remove();
//        queue.remove();
//        queue.printQueue();
//        System.out.println("=======");
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.printQueue();
//        System.out.println("=========");
//        queue.add(firoze);
//        queue.add(rayhan);
//        queue.printQueue();
//        System.out.println("======");
//        System.out.println(queue.peek());
    }
}
