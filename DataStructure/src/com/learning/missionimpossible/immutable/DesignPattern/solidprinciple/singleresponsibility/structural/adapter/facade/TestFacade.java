package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.facade;

public class TestFacade {

    //facade hides behind complicated system
    // it provides a simple interface to interact with
    public static void main(String [] args){

        FacadeTest facadeTest = new FacadeTest();
        facadeTest.drawRectangle();
        facadeTest.drawSquare();
        facadeTest.drawTriangle();
    }
}
