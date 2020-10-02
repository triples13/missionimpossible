package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.decorator;

public class topplingdecorator extends coffeeDecorator {

    private basicoffee basicoffee;
    topplingdecorator(com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.decorator.basicoffee base) {
        super(base);
        this.basicoffee =base;
    }

    @Override
    public String getDescription() {
        return this.basicoffee.getDescription()+"toppling";
    }

    @Override
    public int getcost() {
        return this.basicoffee.getcost()+2;
    }
}
