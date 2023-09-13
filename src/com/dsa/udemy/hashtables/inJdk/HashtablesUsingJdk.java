package com.dsa.udemy.hashtables.inJdk;

import com.dsa.udemy.hashtables.chaining.ChainedHashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashtablesUsingJdk {
    public static void main(String[] args) {
        Employee firoze = new Employee("Md. Firoze", "Hossain", 111);
        Employee rayhan = new Employee("Md. Sykhul", "Islam", 112);
        Employee millat = new Employee("Md. Ahsanul Haque", "Millat", 113);
        Employee imtiaze = new Employee("Ahammed", "Imtiaze", 114);
        Employee mydul = new Employee("Md. Mydul", "Islam", 115);

        Map<String, Employee> hashMap = new HashMap<>();
        hashMap.put("Hossain", firoze);
        hashMap.put("Islam", rayhan);
        hashMap.put("Millat", millat);
        hashMap.put("Imtiaze", imtiaze);

        //Employee employee = hashMap.putIfAbsent("Millat", mydul);
    //    System.out.println(employee);
      //  System.out.println(hashMap.getOrDefault("Someone",mydul));
        System.out.println("Removed: "+hashMap.remove("Islam"));
//        Employee employee = hashMap.put("Millat", mydul);
//        System.out.println(employee);
//
//        System.out.println(hashMap.containsKey("Millat"));
//        System.out.println(hashMap.containsValue(rayhan));

//        Iterator iterator = hashMap.values().iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        hashMap.forEach((k, v) -> System.out.println("Key=" + k + " Employee=" + v));

    }
}
