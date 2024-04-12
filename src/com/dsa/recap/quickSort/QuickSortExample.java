package com.dsa.recap.quickSort;

public class QuickSortExample {
    public static void main(String[] args) {
        int[] array = {7, 9, 3, 5, 8, 2, 4, 6, 1};
        quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start) return;//this is base case of recursive function
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);// call left partition without pivot recursively
        quickSort(array, pivot + 1, end);// call right partition without pivot recursively
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];//here we define pivot at the end
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        //set the pivot with final place with swapping
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}
