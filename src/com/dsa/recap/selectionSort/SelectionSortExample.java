package com.dsa.recap.selectionSort;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] array = {5, 9, 7, 8, 3, 4, 6, 1, 2};
        selectionSort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                //it sorts the array in ascending order
//                if (array[min] > array[j]) {
                //it sorts the array in descending order
                if (array[min] < array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
