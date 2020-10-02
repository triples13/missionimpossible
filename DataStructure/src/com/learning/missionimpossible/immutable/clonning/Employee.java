package com.learning.missionimpossible.immutable.clonning;

public class Employee implements  Cloneable {

    private String id;
    private String name;

    private Department department;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    protected Object clone() throws CloneNotSupportedException {
        Employee emp1 = (Employee) super.clone();
        emp1.department = (Department) department.clone();

        return  emp1;
    }

}
