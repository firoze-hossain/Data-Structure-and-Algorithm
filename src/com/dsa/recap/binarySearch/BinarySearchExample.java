package com.dsa.recap.binarySearch;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        int target = 60;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        //use of predefined binarySearch() method of Arrays
        // int index = Arrays.binarySearch(arr, target);
        //create custom binarySearch() method
        int index = binarySearch(arr, target);
        if (target == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println("Element found at " + index);
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            System.out.println("Middle: " + middle);
            int value = arr[middle];
            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else {
                return middle;//element found
            }
        }
        return -1;// if element not found
    }
}
