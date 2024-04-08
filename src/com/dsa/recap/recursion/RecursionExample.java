package com.dsa.recap.recursion;

public class RecursionExample {
    public static void main(String[] args) {
        // walk(5);
        // System.out.println(factorial(4));
        System.out.println(power(2, 4));
    }

    //find the power of a number
    public static int power(int base, int exponent) {
        if (exponent < 1) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    //find out factorial of a number using recursion
    private static int factorial(int num) {
        if (num < 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    //now using recursive procedure
    private static void walk(int steps) {
        //first we have to write base case condition
        if (steps < 1) return;
        System.out.println("walking steps");
        walk(steps - 1);//recursive
    }

    //iterative process
//    private static void walk(int steps) {
//        //using for loop
//        for(int i=0;i<steps;i++){
//            System.out.println("walking steps");
//        }
//    }


}
