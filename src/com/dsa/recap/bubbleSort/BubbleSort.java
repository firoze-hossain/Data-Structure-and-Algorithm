package com.dsa.recap.bubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {9, 5, 2, 1, 6, 7, 4, 8, 3};
        bubbleSort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                //it will sort the array in ascending numerical order
//                if (array[j] > array[j + 1]) {
                //it will sort the array in descending numerical order
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
