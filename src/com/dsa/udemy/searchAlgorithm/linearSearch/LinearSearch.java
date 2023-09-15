package com.dsa.udemy.searchAlgorithm.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray = {52, 97, -65, 1, 9, -45, 22};
        System.out.println(linearSearch(intArray, -65));
    }

    public static int linearSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
