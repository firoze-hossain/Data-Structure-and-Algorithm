package com.roze.bubblesort;
//bubble sort algorithm implementation with scanner classs

import java.util.Scanner;

public class BubbleSortWithScan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number of integers to sort: ");
        int n=sc.nextInt();
        int intArray[]=new int[n];
        System.out.println("Enter " + n + " integers: ");
        for(int i=0;i<n;i++){
            intArray[i]=sc.nextInt();
        }
        for(int lastUnsortedIndex=intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for (int i=0;i<lastUnsortedIndex;i++){
           if(intArray[i]>intArray[i+1]){
               swap(intArray,i,i+1);
           }
            }
        }
        System.out.println("Sorted list of integers: ");
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int[] array,int i,int j){
        if(i==j){
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }
}
