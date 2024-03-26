package com.dsa.recap.dynamicArray;

public class DynamicArray {
    //declare few properties
    //how many elements
    int size;
    //total capacity of array
    //by default I make it 10
    int capacity = 10;
    //internal array
    // when need extra capacity we copy from this array to new array
    Object[] array;

    //declare constructor without capacity
    public DynamicArray() {
        //pass default capacity
        this.array = new Object[capacity];
    }

    //declare constructor with customize capacity
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    //declare few methods for doing dynamic array's operation
    public void add(Object data) {
        //first we have to check size and capacity
        //if size>=capacity we will grow it's capacity
        if (size >= capacity) {
            grow();
        }
        //otherwise we will add element/data at last of array
        array[size] = data;
        size++;
    }

    //insert element in a given index
    public void insert(int index, Object data) {
        //first we have to check size and capacity
        //if size>=capacity we will grow it's capacity
        if (size >= capacity) {
            grow();
        }
        //for loop in full size occupied array in reverse order
        for (int i = size; i > index; i--) {
            //this will shift all elements in right for make space for new element
            array[i] = array[i - 1];
        }
        //then insert data in given index
        array[index] = data;
        //increment size of elements
        size++;
    }

    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            //check the arr[i] element is is the given input data
            if (array[i] == data) {
                //then shift element by one right to left
                //it will traverse array at array(size-i-1)
                for (int j = 0; j < (size - i - 1); i++) {
                    //the next index element will be placed in previous index
                    array[i + j] = array[i + j + 1];
                }
                //after shift all elements from right to left the right last index will be null
                array[size - 1] = null;
                //decrement the size of element
                size--;
                //now time to reduce the capacity of array
                //if size becomes one-third or more less of capacity then call shrink() method
                if (size <= (int) capacity / 3) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {
        //traverse array when the specific element is not found
        for (int i = 0; i < size; i++) {
            //data at specific array index matched then it will return index
            if (array[i] == data) {
                return i;
            }
        }
        //if not matched it will return -1
        return -1;
    }

    //expand the size of the array
    private void grow() {
        //instantiate a new array
        int newCapacity = (int) capacity * 2;
        //declare new array to increase it capacity and hold the old array's element
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            //set old array's element in new array
            newArray[i] = array[i];
        }
        //then new capacity's value initiate in older one
        capacity = newCapacity;
        //then new array's value initiate in older array
        array = newArray;
    }

    //reduce the size of the array
    private void shrink() {
        //it is same like grow() method
        //but have to (capacity/2) instead of (capacity*2)
        //instantiate a new array
        int newCapacity = (int) capacity / 2;
        //declare new array to increase it capacity and hold the old array's element
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            //set old array's element in new array
            newArray[i] = array[i];
        }
        //then new capacity's value initiate in older one
        capacity = newCapacity;
        //then new array's value initiate in older array
        array = newArray;
    }

    //if there any element in array it returns false, or returns true for empty of array
    public boolean isEmpty() {
        return size == 0;
    }

    //create get() method to random access
    public Object get(int index) {
        return array[index];
    }

    public String toString() {
        String str = "";
        //if we want to see our full array we have to use capacity instead of size
        for (int i = 0; i < capacity; i++) {
//        for (int i = 0; i < size; i++) {
            str += array[i] + ", ";
        }
        //now remove comma and one space (, ) from String
        //we can se subString() method
        //then first check our string is not empty
        if (str != "") {
            //last two character remove one comma and space
            //add elements in a square bracket
            str = "[" + str.substring(0, str.length() - 2) + "]";
        }
        //if array is empty return []
        else {
            str = "[]";
        }
        return str;
    }
}
