package com.dsa.udemy.lists.doublyLinkedList.challenge1;


public class DoublyLinkedList {
    public static void main(String[] args) {
        Employee firoze = new Employee("Md. Firoze", "Hossain", 111);
        Employee sykhul = new Employee("Md. Sykhul", "Islam", 112);
        Employee ahsanul = new Employee("Md. Ahsanul", "Haque", 113);
        Employee imtiaze = new Employee("Ahmmed", "Imtiaze", 114);
        Employee mydul = new Employee("Md. Mydul", "Islam", 115);
        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        employeeLinkedList.addToFront(firoze);
        employeeLinkedList.addToFront(sykhul);
        employeeLinkedList.addToFront(ahsanul);
        employeeLinkedList.addToFront(imtiaze);
        employeeLinkedList.printList();
        System.out.println(employeeLinkedList.getSize());
        System.out.println("=======");
        employeeLinkedList.addBefore(mydul,imtiaze);
        employeeLinkedList.printList();
        System.out.println(employeeLinkedList.getSize());

    }
}
