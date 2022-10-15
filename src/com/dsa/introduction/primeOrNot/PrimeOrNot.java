package com.dsa.introduction.primeOrNot;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int div = 2;
        int count = 0;
        while (div < n) {
            if (n % div == 0) {
                count++;
                break;
            }
            div++;

        }

        if (count == 0) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not prime number");
        }
    }
}
