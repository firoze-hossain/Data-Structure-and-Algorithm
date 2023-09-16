package com.dsa.udemy.searchAlgorithm.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] intArray = {-152, -97, 1, 9, 22, 45, 65};
        //for iterative search method
        System.out.println(iterativeBinarySearch(intArray, 1));
        System.out.println(iterativeBinarySearch(intArray, 45));
        System.out.println(iterativeBinarySearch(intArray, 9999));
        System.out.println(iterativeBinarySearch(intArray, -97));
        System.out.println("===========================================");
        //for recursive search method
        System.out.println(recursiveBinarySearch(intArray, 1));
        System.out.println(recursiveBinarySearch(intArray, 45));
        System.out.println(recursiveBinarySearch(intArray, 9999));
        System.out.println(recursiveBinarySearch(intArray, -97));
    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;
        while (start < end) {
            int midpoint = (start + end) / 2;
            System.out.println("Midpoint= " + midpoint);
            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }
        int midpoint = (start + end) / 2;
        System.out.println("Midpoint= " + midpoint);
        if (input[midpoint] == value) {
            return midpoint;
        } else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        } else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }
}
