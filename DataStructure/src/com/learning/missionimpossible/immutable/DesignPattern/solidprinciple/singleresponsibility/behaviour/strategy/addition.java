package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.behaviour.strategy;

public class addition implements  operations {
    @Override
    public int dosomething(int a, int b) {
        return a+b;
    }
}
