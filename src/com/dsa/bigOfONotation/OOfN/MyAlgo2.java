package com.dsa.bigOfONotation.OOfN;

public class MyAlgo2 {
    public static int myAlgo2(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            if (sum >= 1000) {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(myAlgo2(40));
    }
}
