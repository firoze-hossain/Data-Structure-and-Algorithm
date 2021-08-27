package com.roze.array;

public class ArrayExample {
    public static void main(String[] args) {
        int[] newArray = new int[7];
        newArray[0] = 7;
        newArray[1] = -11;
        newArray[2] = 9;
        newArray[3] = 8;
        newArray[4] = 15;
        newArray[5] = 13;
        newArray[6] = 19;
        int index=-1;

        for(int i=0; i<newArray.length;i++) {
            System.out.println(newArray[i]);
            if(newArray[i]==13) {

                index=i;
                break;
            }
        }
        System.out.println("index: "+index);
        System.out.println("hello Firoze");


    }
}
