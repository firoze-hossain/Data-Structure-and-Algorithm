package com.dsa.recap.executionTime;

public class ExecutionTime {
    public static void main(String[] args) throws InterruptedException {
        //the starts time of program
        long start = System.nanoTime();
        //******************** Program ****************************
        Thread.sleep(3000);
        //*********************************************************
        //The units I need to see the duration of execution a program
        //If I need ms, I should divide it 1 Million(1000000) or need second, divide it 1 Billion(1000000000)
        // if I need the duration, I should do (current time - start time)/The units I need(like 1000000(convert it ms) or 1000000000(convert it sec))
        long duration = (System.nanoTime() - start) / 1000000;
        System.out.println(duration + "ms");
    }
}
