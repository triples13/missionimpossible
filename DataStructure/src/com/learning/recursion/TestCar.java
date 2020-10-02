package com.learning.recursion;

import java.util.*;
import java.util.stream.Collectors;

public class TestCar {

    public static int x;

    public static void hello() {

    }

    public static void main(String[] args) {
        List<Employee> listofEMployee = Arrays.asList(new Employee(1, 23),
                new Employee(2, 37),
                new Employee(3, 76));

        List<Employee> listofEMployee1 = Arrays.asList(new Employee(4, 33),
                new Employee(8, 7),
                new Employee(9, 78));

        List<Office> officeList=Arrays.asList(new Office(1,listofEMployee),
                new Office(2,listofEMployee1));

       listofEMployee.stream().sorted(Comparator.comparing(Employee::getEmployeeId)).collect(Collectors.toList());
     /*   Map hmap=officeList.stream().map(e->{
            return e.getEmployee().stream().collect(Collectors.toList());
            }).collect(Collectors.toList()).stream().map(*/

    }
}

    class Employee{

        public Employee(int employeeId, int employeeNo) {
            this.employeeId = employeeId;
            this.employeeNo = employeeNo;
        }

         static int employeeId;
        static  int employeeNo;

        public   int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public int getEmployeeNo() {
            return employeeNo;
        }

        public void setEmployeeNo(int employeeNo) {
            this.employeeNo = employeeNo;
        }
    }

    class Office{
       int officeId;
       List<Employee> employee;

        public Office(int officeId, List<Employee> employee) {
            this.officeId = officeId;
            this.employee = employee;
        }

        public int getOfficeId() {
            return officeId;
        }

        public void setOfficeId(int officeId) {
            this.officeId = officeId;
        }

        public List<Employee> getEmployee() {
            return employee;
        }

        public void setEmployee(List<Employee> employee) {
            this.employee = employee;
        }
    }





