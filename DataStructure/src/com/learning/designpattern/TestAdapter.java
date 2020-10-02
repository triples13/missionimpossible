package com.learning.designpattern;



public class TestAdapter {
    public static void main(String []args){
        CreateDesignCard createDesign=new CreateDesignCard();
        AdapterCreation adapter =new AdapterCreation();
        adapter.setEmployeeAddress("munnekolal");
        adapter.setEmployeeId(23);
        adapter.setEmplyoeeName("shashank");
        createDesign.DesignCard(adapter);
    }
}
