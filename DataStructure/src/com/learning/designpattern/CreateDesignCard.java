package com.learning.designpattern;

public class CreateDesignCard {

    public static void DesignCard(Customer customer){
       int id=customer.getCustomerId();
       String name=customer.getCutomerName();
       String address=customer.getCustomerAddress();

        System.out.println("design card creating for :"+id+":"+name+":"+address);

    }
}
