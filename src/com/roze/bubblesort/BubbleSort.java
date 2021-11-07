package com.roze.bubblesort;

public class BubbleSort {
    public static void main(String[] args) {
int intAray[]={5,-9,56,66,8,2,-12};

for (int lastUnsortedIndex=intAray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
    for (int i=0;i<lastUnsortedIndex;i++){
        if (intAray[i]>intAray[i+1]){

            swap(intAray,i,i+1);
        }

    }

}

for (int i=0;i<intAray.length;i++){
    System.out.println(intAray[i]);
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
