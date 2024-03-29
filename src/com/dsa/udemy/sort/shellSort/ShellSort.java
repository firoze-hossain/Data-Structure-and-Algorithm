package com.dsa.udemy.sort.shellSort;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {55, -22, 85, 36, -77, 2, 7};

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;

                }
                arr[j] = newElement;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
