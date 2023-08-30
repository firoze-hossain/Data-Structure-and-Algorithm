package com.dsa.udemy.lists.singlyLinkedList;


public class SinglyLinkedList {
    public static void main(String[] args) {
        Employee firoze = new Employee("Md. Firoze", "Hossain", 111);
        Employee sykhul = new Employee("Md. Sykhul", "Islam", 112);
        Employee ahsanul = new Employee("Md. Ahsanul", "Haque", 113);
        Employee imtiaze = new Employee("Ahmmed", "Imtiaze", 114);
        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        System.out.println(employeeLinkedList.isEmpty());
        System.out.println("====================");
        employeeLinkedList.addToFront(firoze);
        employeeLinkedList.addToFront(sykhul);
        employeeLinkedList.addToFront(ahsanul);
        employeeLinkedList.addToFront(imtiaze);
        employeeLinkedList.printList();
        System.out.println("==============");
        System.out.println(employeeLinkedList.getSize());
        System.out.println("==========");
        employeeLinkedList.removedFromFront();
        System.out.println(employeeLinkedList.getSize());
        System.out.println("===============");
        employeeLinkedList.printList();

    }
}
