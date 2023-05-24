package com.dsa.udemy.arrays.bigOfOValues;

public class BigOfOValues {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 55;
        arr[1] = -65;
        arr[2] = 7;
        arr[3] = 13;
        arr[4] = -23;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
