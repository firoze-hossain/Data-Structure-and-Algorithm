package com.dsa.udemy.lists.doublyLinkedList;


public class DoublyLinkedList {
    public static void main(String[] args) {
        Employee firoze = new Employee("Md. Firoze", "Hossain", 111);
        Employee sykhul = new Employee("Md. Sykhul", "Islam", 112);
        Employee ahsanul = new Employee("Md. Ahsanul", "Haque", 113);
        Employee imtiaze = new Employee("Ahmmed", "Imtiaze", 114);
        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        employeeLinkedList.addToFront(firoze);
        employeeLinkedList.addToFront(sykhul);
        employeeLinkedList.addToFront(ahsanul);
        employeeLinkedList.addToFront(imtiaze);
        employeeLinkedList.printList();
        System.out.println(employeeLinkedList.getSize());
        System.out.println("==============");
        Employee noyon=new Employee("Md. Noyon","Islam",115);
        employeeLinkedList.addToEnd(noyon);
        employeeLinkedList.printList();
        System.out.println(employeeLinkedList.getSize());
        System.out.println("========");
        employeeLinkedList.removedFromFront();
        employeeLinkedList.printList();
        System.out.println(employeeLinkedList.getSize());
        System.out.println("==========");
        employeeLinkedList.removeFromEnd();
        employeeLinkedList.printList();
        System.out.println(employeeLinkedList.getSize());
    }
}
