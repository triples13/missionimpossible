package com.learning.designpattern;


public class AdapterCreation extends Employee implements  Customer{


    @Override
    public String getCustomerAddress() {
        return this.getEmployeeAddress();
    }

    @Override
    public int getCustomerId() {
        return this.getEmployeeId();
    }

    @Override
    public String getCutomerName() {
        return this.getEmplyoeeName();
    }
}
