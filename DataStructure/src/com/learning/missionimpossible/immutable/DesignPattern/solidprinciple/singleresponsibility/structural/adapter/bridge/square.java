package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.bridge;

public class square implements  shape {

    @Override
    public void applyColor(color c) {
        System.out.println("applied color"+c.getcolor());
    }

    @Override
    public void createShape() {
        System.out.println("square shape");
    }
}
