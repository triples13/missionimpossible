package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.facade;

public class Triangle implements  shape {
    @Override
    public void draw() {
        System.out.println("drawing triangle");
    }
}
