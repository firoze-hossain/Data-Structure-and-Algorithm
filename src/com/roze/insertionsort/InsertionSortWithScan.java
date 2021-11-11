package com.roze.insertionsort;

import java.util.Scanner;

public class InsertionSortWithScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the integers to be sorted: ");
        int n = sc.nextInt();
        int[] intArray = new int[n];
        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
        System.out.println("Sorted list of integers: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
