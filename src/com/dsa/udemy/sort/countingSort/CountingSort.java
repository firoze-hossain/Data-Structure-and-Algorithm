package com.dsa.udemy.sort.countingSort;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = {2, 9, 10, 6, 8, 2, 3, 6, 7, 9};
        countingSort(array, 1, 10);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void countingSort(int input[], int min, int max) {
        int countingArray[] = new int[(max - min) + 1];
        for (int i = 0; i < input.length; i++) {
            countingArray[input[i] - min]++;
        }
        int j = 0;
        for (int k = min; k <= max; k++) {
            while (countingArray[k - min] > 0) {
                input[j++] = k;
                countingArray[k - min]--;
            }
        }
    }
}
