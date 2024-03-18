package com.dsa.recap.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //check if stack is empty or not
        // System.out.println(stack.isEmpty());
        //push()-add object to the top
        stack.push("Java");
        stack.push("Spring Boot");
        stack.push("JPA");
        stack.push("Spring Core");
        stack.push("Spring Security");
        // check if stacks really contains object or not
        // System.out.println(stack.isEmpty());
        //print stack elements
        // System.out.println(stack);
        //pop()-remove object on the top, the pop() method return object
        //so we can store it in another place
        // String s = stack.pop();
        // System.out.println("Removed element: "+s);
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        //last pop method will throw "EmptyStackException"
//        stack.pop();
        //this will throw OutOfMemoryError: Java heap space
        for (int i = 0; i < 1000000000; i++) {
            stack.push("Java");
        }

        System.out.println(stack);

        //if we want to find out top most element without removing it
        //we should use peek() method instead of pop()
        //System.out.println("Top most element: "+stack.peek());
        //search() method will take element as input to search and return 1 based index not 0 based
        // System.out.println("Element position: "+stack.search("Spring Security"));

    }
}
