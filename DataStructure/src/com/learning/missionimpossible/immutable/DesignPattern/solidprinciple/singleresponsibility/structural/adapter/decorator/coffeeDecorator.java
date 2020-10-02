package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.decorator;

public class coffeeDecorator implements basicoffee {

    private basicoffee basicoffee;
    coffeeDecorator(basicoffee base) {
        basicoffee =base;
    }
    @Override
    public String getDescription() {
       return this.basicoffee.getDescription();
    }

    @Override
    public int getcost() {
        return this.basicoffee.getcost();
    }
}
