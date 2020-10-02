package com.learning.designpattern;

public class TestHouseBuilder {

    public static void main(String []args) {
        House p = new House.HouseBuilder().setHouseType("bricks").getHouseBuilder();
        System.out.println(p.getHouseType());
    }

}
