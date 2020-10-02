package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.decorator;

public class capuccino  implements basicoffee{

    @Override
    public String getDescription() {

        return "capucinno coffee";
    }

    @Override
    public int getcost() {
        return 3;
    }
}
