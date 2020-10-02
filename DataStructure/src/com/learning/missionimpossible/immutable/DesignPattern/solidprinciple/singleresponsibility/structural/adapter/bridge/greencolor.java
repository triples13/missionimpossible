package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.bridge;

public class greencolor  implements  color{

    String col;
    @Override
    public void color(String s) {
        col=s;
    }

    @Override
    public String getcolor() {
        return col;
    }
}
