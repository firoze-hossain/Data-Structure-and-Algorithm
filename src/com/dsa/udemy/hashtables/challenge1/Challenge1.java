package com.dsa.udemy.hashtables.challenge1;

public class Challenge1 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int[] addToNum = {59382, 43, 6894, 500, 99, -58};
        for (int i = 0; i < addToNum.length; i++) {
            num[hash(addToNum[i])] = addToNum[i];
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
