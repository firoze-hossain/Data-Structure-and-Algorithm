package com.dsa.recap.dynamicArray;

//But for dynamic array it is efficient to use ArrayList
public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);
        // DynamicArray dynamicArrayWithCapacity=new DynamicArray(5);
        //print the default capacity
        //System.out.println(dynamicArray.capacity);
        //print provided capacity
        //  System.out.println(dynamicArrayWithCapacity.capacity);

        //add some elements for testing
        dynamicArray.add("Firoze");
        dynamicArray.add("Hossain");

        // grow the array's capacity
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        System.out.println(dynamicArray);
        //random access using get(index) method
        System.out.println("Random accessed element: " + dynamicArray.get(3));

        //shrink the array capacity
        dynamicArray.delete("D");
        dynamicArray.delete("C");
        dynamicArray.delete("B");
        //we don't need to call to string method to see
        //it will default call to string to print element in array
        // System.out.println(dynamicArray);
        //check size of array
        System.out.println("Size: " + dynamicArray.size);
        //check capacity of array
        System.out.println("Capacity: " + dynamicArray.capacity);
        //now check isEmpty() method
        //  System.out.println("Empty: " + dynamicArray.isEmpty());
        //search element
        //  System.out.println("Searched element at index: " + dynamicArray.search("Hossain"));
        //inserting new element in given index
        // dynamicArray.insert(0, "Java");
        //now delete data
        // dynamicArray.delete("Java");


        System.out.println(dynamicArray);
    }
}
