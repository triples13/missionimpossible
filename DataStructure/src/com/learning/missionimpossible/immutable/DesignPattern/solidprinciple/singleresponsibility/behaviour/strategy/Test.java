package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.behaviour.strategy;

public class Test {

    public static  void main(String [] args){

        operations operations = new substraction();

        Context context = new Context(operations);
        System.out.println("operation outcome:"+ context.work(2,3));
    }
}
