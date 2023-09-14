package com.dsa.udemy.hashtables.bucketSort;

import java.util.*;

public class BucketSort {
    public static void main(String[] args) {
        int[] intArray = {96, 56, 32, 74, 12, 58, 45, 98};
        bucketSort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];
        for (int i = 0; i < buckets.length; i++) {
            // using ArrayList as Buckets
            //buckets[i] = new ArrayList<>();
            // using LinkedList as Buckets
            //buckets[i] = new LinkedList<>();
            // using Vector as Buckets
            buckets[i] = new Vector<>();

        }
        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }
        for (List bucket : buckets) {
            Collections.sort(bucket);
        }
        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                input[j++] = value;
            }
        }

    }

    public static int hash(int value) {
        return value / (int) 10;
    }
}
