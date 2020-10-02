package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.behaviour.strategy;

public class Context {

    operations oper;

    Context(operations oper){
        this.oper = oper;
    }

    public int work(int a,int b)
    {
       return oper.dosomething(a,b);
    }
}
