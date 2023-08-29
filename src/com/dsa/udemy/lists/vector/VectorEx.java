package com.dsa.udemy.lists.vector;

import com.dsa.udemy.lists.arrayLists.Employee;

import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new com.dsa.udemy.lists.arrayLists.Employee("Md. Firoze", "Hossain", 111));
        employeeList.add(new com.dsa.udemy.lists.arrayLists.Employee("Md. Sykhul", "Islam", 112));
        employeeList.add(new com.dsa.udemy.lists.arrayLists.Employee("Md. Ahsanul", "Haque", 113));
        employeeList.add(new Employee("Ahmmed", "Imtiaze", 114));
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
