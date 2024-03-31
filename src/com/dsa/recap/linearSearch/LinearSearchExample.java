package com.dsa.recap.linearSearch;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 6, 7, 4, 1, 2, 3};
        int index = linearSearch(arr, 1);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found!!!");
        }
    }

    //for linear search it is not necessary for elements to be sorted
    private static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
