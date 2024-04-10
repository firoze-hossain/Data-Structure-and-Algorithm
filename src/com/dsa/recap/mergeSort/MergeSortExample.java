package com.dsa.recap.mergeSort;

public class MergeSortExample {
    public static void main(String[] args) {
        int[] array = {5, 4, 8, 7, 9, 1, 3, 6, 2};
        mergeSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i = 0;//for left array
        int j = 0;//for right array
        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
