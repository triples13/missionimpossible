package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String address;
    private List<Employee> employeeList;
    private int salary;

    public Employee(){
        employeeList = new ArrayList<>();
    }

    public void add(Employee e)
    {
        employeeList.add(e);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
