package com.dsa.introduction.maximumOfThreeGivenNumbers;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("a is the maximum number a = " + a);
            } else {
                System.out.println("C is the maximum number c = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("b is maximum number b = " + b);
            } else {
                System.out.println("c is maximum number c = " + c);
            }
        }

    }
}
