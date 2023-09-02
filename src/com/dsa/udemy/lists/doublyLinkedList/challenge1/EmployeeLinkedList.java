package com.dsa.udemy.lists.doublyLinkedList.challenge1;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);

        if (head == null) {
            tail = employeeNode;
        } else {
            head.setPrevious(employeeNode);
            employeeNode.setNext(head);
        }
        head = employeeNode;
        size++;
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        if (head == null) {
            return false;
        }
        EmployeeNode current = head;
        while (current != null && !current.getEmployee().equals(existingEmployee)) {
            current = current.getNext();
        }
        if (current == null) {
            return false;
        }
        EmployeeNode newNode = new EmployeeNode(newEmployee);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);
        if (head == current) {
            head = newNode;
        } else {
            newNode.getPrevious().setNext(newNode);
        }
        size++;
        return true;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        if (tail == null) {
            head = employeeNode;
        } else {
            tail.setNext(employeeNode);
            employeeNode.setPrevious(tail);
        }
        tail = employeeNode;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeNode removedFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = tail;
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("Null");
    }
}
