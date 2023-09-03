package com.dsa.udemy.stacks.stackUsingArray;

public class StackUsingArray {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(new Employee("Md. Firoze", "Hossain", 111));
        arrayStack.push(new Employee("Md. Sykhul", "Islam", 112));
        arrayStack.push(new Employee("Md. Ahsanul Haque", "Millat", 113));
        arrayStack.push(new Employee("Ahammed", "Imtiaze", 114));
        arrayStack.push(new Employee("Md. Mydul", "Islam", 115));
        arrayStack.printStack();
        System.out.println("==================");
        System.out.println(arrayStack.peek());
        System.out.println("===========");
        System.out.println("Popped: " + arrayStack.pop());
        System.out.println("==========");
        arrayStack.printStack();
        System.out.println("=========");
        System.out.println(arrayStack.peek());
    }
}
