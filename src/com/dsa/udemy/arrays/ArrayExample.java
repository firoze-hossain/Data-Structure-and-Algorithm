package com.dsa.udemy.arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int intArray[] = new int[5];
        intArray[0] = 1;
        intArray[1] = 9;
        intArray[2] = -88;
        intArray[3] = 12;
        intArray[4] = -5;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
