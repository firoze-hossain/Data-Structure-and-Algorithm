package com.dsa.bigOfONotation;

import java.util.Scanner;

public class OOfOne {
    public static int myAlgo1(int x) {
        int num = x + 10;
        num = num / 2;
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number: ");
        int res = sc.nextInt();
        System.out.println(myAlgo1(res));
    }
}
