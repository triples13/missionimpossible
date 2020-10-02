package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.composite;

public class TestEmployee {

    public static void main(String [] args){


        //composite design pattern lets you compose an object tree
        // every leaf node behaves in same way as parent node

        Employee ceo = new Employee();
        ceo.setName("shashank");
        ceo.setSalary(120000);

        Employee director = new Employee();
        director.setName("venki");
        director.setSalary(1234);
        ceo.add(director);


        Employee manager = new Employee();
        manager.setName("manasi");
        manager.setSalary(123);

        director.add(manager);

        int salary =ceo.getSalary();

        for(Employee e : ceo.getEmployeeList()){

            salary=salary+e.getSalary();
        }

        System.out.println("total salary:"+salary);
    }
}
