package com.dsa.recap.interpolationSearch;

public class InterpolationSearchExample {
    public static void main(String[] args) {
        //uniformly distributed
        //The best case
        //the value is increased by one
        //there happens only (one guess)
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = interpolationSearch(arr, 8);
        //the more difficult data set
        //there happens(five guesses)
        //int[] arr = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        //int index = interpolationSearch(arr, 256);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int interpolationSearch(int[] arr, int value) {
        int high = arr.length - 1;
        int low = 0;
        while (value >= arr[low] && value <= arr[high] && low <= high) {
            //the formula of find the probe
            int probe = low + (high - low) * (value - arr[low]) / (arr[high] - arr[low]);
            System.out.println("Probe: " + probe);
            if (value == arr[probe]) {
                return probe;
            } else if (value > arr[probe]) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
}
