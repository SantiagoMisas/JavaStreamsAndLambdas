package com.testing.JLambdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empId;
    String empName;
    int salary;

     Employee(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}
public class FilterDemo5 {
    public static void main(String[] args) {
        List<Employee> employeeList= Arrays.asList(
        new Employee(101, "Alex", 10000),
        new Employee(102, "Sam", 25000),
        new Employee(103, "Adam", 33000),
        new Employee(104, "John", 42000)
        );

        //Filtar salarios mayores a 25000 y traelos en el map
        List<Integer> result=employeeList.stream().filter(e->e.salary>25000).map(eo->eo.salary).collect(Collectors.toList());
        System.out.println(result);


    }
}
