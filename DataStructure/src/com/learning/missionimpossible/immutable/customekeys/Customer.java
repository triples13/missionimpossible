package com.learning.missionimpossible.immutable.customekeys;

import java.util.Objects;

public class Customer {

   private  String id;
    private String name;
    private String rollNo;

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

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

   /* @Override
    public boolean equals(Object o) {
         return true;
    }

    @Override
    public int hashCode() {
        int result = id==null?1:id.hashCode();
        result = 31*result+ name==null?0:name.hashCode();
        result = 31*result+rollNo==null?0:rollNo.hashCode();

        return  result;
    }*/
}
