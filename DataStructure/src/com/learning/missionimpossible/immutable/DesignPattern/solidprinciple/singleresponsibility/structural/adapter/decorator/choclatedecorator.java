package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.decorator;

public class choclatedecorator extends coffeeDecorator {

    private basicoffee basicoffee;
    choclatedecorator(com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.decorator.basicoffee base) {
        super(base);
        basicoffee =base;
    }

    @Override
    public String getDescription() {
        return this.basicoffee.getDescription()+"choclate";
    }

    @Override
    public int getcost() {
        return this.basicoffee.getcost()+1;
    }
}
