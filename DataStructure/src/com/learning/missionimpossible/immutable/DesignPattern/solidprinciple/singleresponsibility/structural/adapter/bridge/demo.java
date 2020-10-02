package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.bridge;

public class demo {

    public static void  main(String [] args){

        color c= new greencolor();
        c.color("green");

        shape s=new square();
        s.createShape();
        s.applyColor(c);

        // we can create different shapes and apply  green color

        //we can apply different colors to square shape

        // we seperated out two hiearchy and had one hiearchy as composition in abstraction implementation
        // decouples abstraction and implementation

        // jdbc is an example of bridge design pattern , because jdbc acts as a bridge betwen dbs and
        //client code  both can vary independently and jdbc acts a bridge between both

    }
}
