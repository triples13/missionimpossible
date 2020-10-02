package com.learning.missionimpossible.immutable.clonning;

public class TestClonning {

    public static void main(String [] args) throws CloneNotSupportedException {



        office ofc = new office();
        ofc.setId("1245");
        ofc.setLocation("bagmane");


        Department department = new Department();
        department.setDepartmentName("it");
        department.setId("123");
        department.setOffice(ofc);


        Employee emp1 = new Employee();
        emp1.setName("ramesh");
        emp1.setDepartment(department);

        Employee emp2 = (Employee) emp1.clone();

        emp1.getDepartment().getOffice().setLocation("manyatya");


        System.out.println("emp2 office location:"+emp2.getDepartment().getOffice().getLocation());

    }
}
