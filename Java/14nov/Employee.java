package com.cg.assignments;


import java.util.Arrays;
import java.util.Comparator;
 
class Employee {
    String name;
    int salary;
 
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
 
    public String getName() {
        return name;
    }
 
    public int getSalary() {
        return salary;
    }
 
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
 
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Aravind", 250000),
                new Employee("Reddy", 602000),
                new Employee("Ram", 402000),
                new Employee("bheem", 310000)
        };
 
        Arrays.sort(employees, Comparator.comparingInt(Employee::getSalary));
 
        System.out.println(Arrays.toString(employees));
    }
}