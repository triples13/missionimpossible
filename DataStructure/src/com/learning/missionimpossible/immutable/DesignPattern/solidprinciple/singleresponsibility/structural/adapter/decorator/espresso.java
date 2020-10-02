package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.decorator;

public class espresso implements  basicoffee {
    @Override
    public String getDescription() {
        return "espresso coffee";
    }

    @Override
    public int getcost() {
        return 2;
    }
}
