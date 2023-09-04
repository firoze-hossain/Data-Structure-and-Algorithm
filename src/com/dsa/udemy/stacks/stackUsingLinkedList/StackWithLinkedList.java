package com.dsa.udemy.stacks.stackUsingLinkedList;

public class StackWithLinkedList {
    public static void main(String[] args) {
        Employee firoze = new Employee("Md. Firoze", "Hossain", 111);
        Employee rayhan = new Employee("Md. Sykhul", "Islam", 112);
        Employee millat = new Employee("Md. Ahsanul Haque", "Millat", 113);
        Employee imtiaze = new Employee("Ahammed", "Imtiaze", 114);
        Employee mydul = new Employee("Md. Mydul", "Islam", 115);
        LinkedStack stack = new LinkedStack();
        stack.push(firoze);
        stack.push(rayhan);
        stack.push(millat);
        stack.push(imtiaze);
        stack.push(mydul);
        stack.printStack();
        System.out.println("============");
        System.out.println(stack.pop());
        System.out.println("============");
        stack.printStack();
        System.out.println("=============");
        System.out.println(stack.peek());
        System.out.println("==========");
        stack.printStack();


    }
}
