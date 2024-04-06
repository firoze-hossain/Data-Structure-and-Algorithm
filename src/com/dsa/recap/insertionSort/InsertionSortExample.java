package com.dsa.recap.insertionSort;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] array = {6, 8, 5, 9, 1, 3, 7, 2, 4};
        insertionSort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static void insertionSort(int[] array) {
        //it will start from index one
        for (int i = 1; i < array.length; i++) {
            //then store index 1 value in temp
            int temp = array[i];
            //then declare variable with previous index of i
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                //shift left value to right
                array[j + 1] = array[j];
                j--;
            }
            //fill the empty with temp value
            array[j + 1] = temp;
        }
    }
}
