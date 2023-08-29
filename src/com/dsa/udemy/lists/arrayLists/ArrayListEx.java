package com.dsa.udemy.lists.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Md. Firoze", "Hossain", 111));
        employeeList.add(new Employee("Md. Sykhul", "Islam", 112));
        employeeList.add(new Employee("Md. Ahsanul", "Haque", 113));
        employeeList.add(new Employee("Ahmmed", "Imtiaze", 114));
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("=======================");
        System.out.println(employeeList.get(1));
        System.out.println("===================");
        System.out.println(employeeList.isEmpty());
        System.out.println("======================");
        employeeList.set(1, new Employee("Md. Sykhul", "Islam Rayhan", 112));
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("==================");
        System.out.println(employeeList.size());
        System.out.println("===================");
        employeeList.add(3, new Employee("Md. Mydul", "Islam", 115));
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("=============");
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }
        System.out.println("==============");
        System.out.println(employeeList.contains(new Employee("Md. Firoze", "Hossain", 111)));
        System.out.println("==============");
        System.out.println(employeeList.indexOf(new Employee("Md. Ahsanul", "Haque", 113)));
        System.out.println("===============");
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
