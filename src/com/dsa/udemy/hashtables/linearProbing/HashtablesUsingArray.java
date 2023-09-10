package com.dsa.udemy.hashtables.linearProbing;

public class HashtablesUsingArray {
    public static void main(String[] args) {
        Employee firoze = new Employee("Md. Firoze", "Hossain", 111);
        Employee rayhan = new Employee("Md. Sykhul", "Islam", 112);
        Employee millat = new Employee("Md. Ahsanul Haque", "Millat", 113);
        Employee imtiaze = new Employee("Ahammed", "Imtiaze", 114);
        Employee mydul = new Employee("Md. Mydul", "Islam", 115);
        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put("Hossain", firoze);
        hashtable.put("Islam", rayhan);
        hashtable.put("Millat", millat);
        hashtable.put("Imtiaze", imtiaze);
        hashtable.printHashtable();
        System.out.println("==============");
        System.out.println(hashtable.get("Islam"));
        System.out.println(hashtable.get("Imtiaze"));
    }
}
