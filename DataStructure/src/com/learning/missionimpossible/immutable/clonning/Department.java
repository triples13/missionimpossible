package com.learning.missionimpossible.immutable.clonning;

public class Department  implements  Cloneable{

    private String id;
    private String departmentName;

    private office office;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public com.learning.missionimpossible.immutable.clonning.office getOffice() {
        return office;
    }

    public void setOffice(com.learning.missionimpossible.immutable.clonning.office office) {
        this.office = office;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       Department department = (Department) super.clone();
       department.office = (office) office.clone();

       return department;
    }
}
