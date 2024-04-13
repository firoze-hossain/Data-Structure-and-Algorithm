package com.dsa.recap.hashtable;

import java.util.Hashtable;

public class HashtableStringKeyExample {
    public static void main(String[] args) {
        // Hashtable<String, String> table = new Hashtable<>(10);
        Hashtable<String, String> table = new Hashtable<>();
        //Hashtable<String, String> table = new Hashtable<>(21);
        table.put("100", "Firoze");
        table.put("123", "Hossain");
        table.put("321", "Ahmed");
        table.put("555", "Millat");
        table.put("777", "Rayhan");
        //get one value using key
        //System.out.println(table.get("321"));
        //for remove element
        //table.remove("321");
        //get key value pair using for enhance loop
        //the keySet() method helps to get all keys and return as set for iteration
        for (String key : table.keySet()) {
            //System.out.println(key + "\t" + table.get(key));
            //get key, hash value of key and value
            // System.out.println(key + "\t" + key.hashCode() + "\t" + table.get(key));
            //get key, index of key and value
            //System.out.println(key + "\t" + key.hashCode()%10 + "\t" + table.get(key));
            System.out.println(key + "\t" + key.hashCode() % 11 + "\t" + table.get(key));
            //System.out.println(key + "\t" + key.hashCode()%21 + "\t" + table.get(key));
        }
    }
}
