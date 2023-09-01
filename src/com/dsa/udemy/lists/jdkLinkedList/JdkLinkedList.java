package com.dsa.udemy.lists.jdkLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JdkLinkedList {
    public static void main(String[] args) {
        Employee millat = new Employee("Md. Ahsanul Haque", "Millat", 11);
        Employee rayhan = new Employee("Md. Sykhul Islam", "Rayhan", 12);
        Employee firoze = new Employee("Md. Firoze", "Hossain", 13);
        Employee imtiaze = new Employee("Ahammed", "Imatiaze", 14);
        Employee noyon = new Employee("Md. Mahiuddin", "Noyon", 15);
        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(millat);
        list.addFirst(rayhan);
        list.addFirst(firoze);
        list.addFirst(imtiaze);
        System.out.println("===Add First Method====");
        Iterator iterator = list.iterator();
        System.out.print("HEAD ->");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print("<=>");
        }
        System.out.println("Null");
        System.out.println("===Add Last Method===");
        list.addLast(noyon);
        iterator = list.iterator();
        System.out.print("HEAD ->");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print("<=>");
        }
        System.out.println("Null");
        System.out.println("===removeFirst=====");
        list.removeFirst();
        iterator = list.iterator();
        System.out.print("HEAD ->");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print("<=>");
        }
        System.out.println("Null");
        System.out.println("===removeLast=========");
        list.removeLast();
        iterator = list.iterator();
        System.out.print("HEAD ->");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print("<=>");
        }
        System.out.println("Null");


    }
}
