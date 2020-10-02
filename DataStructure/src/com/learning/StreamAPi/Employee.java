package com.learning.StreamAPi;

public class Employee {

    private String employeeId;
    private String employeeName;
    private int employeeAge;

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public Employee(String employeeId, String employeeName,int employeeAge) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge=employeeAge;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
