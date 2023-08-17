package com.dsa.udemy.sort.sortingArraysUsingJdk;

import java.util.Arrays;

public class SortingArraysUsingJdk {
    public static void main(String[] args) {
        int array[] = {8, -75, 36, 52, -12, 45};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
