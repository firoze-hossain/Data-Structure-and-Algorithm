package com.dsa.recap.hashtable;

import java.util.Hashtable;

public class HashtableIntegerKeyExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);
        table.put(100, "Firoze");
        table.put(123, "Hossain");
        table.put(321, "Ahmed");
        table.put(555, "Millat");
        table.put(777, "Rayhan");
        for (Integer key : table.keySet()) {
            //System.out.println(key + "\t" + table.get(key));
            //get key, hash value of key and value
            System.out.println(key + "\t" + key.hashCode() + "\t" + table.get(key));
            //get key, index of key and value
            // System.out.println(key + "\t" + key.hashCode() % 10 + "\t" + table.get(key));
        }

    }
}
