package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.decorator;

public class Test {

    //decorator design pattern used to provide wrapper outside a basic functionality

    // we have basiccofee interface and two classes capucciono and espresoo

    // we can have multiple combination of espersso+choclate, espresso+choclate+toppling, espresso+toppling etc

    // instead of that we created a decorator and extend topping and choclate decorator

    // we can find total cost

    // decorator is like a layer outside a layer  so the layer has to contain below loyer and should be a type
    // of below layer so we created a basicdecorator of basic coffe and it conatins cofeee
    // wrapper can be provoded in order and can be added at run time

    public static void main(String [] args){

        capuccino cap = new capuccino();

        topplingdecorator topplingdecorator = new topplingdecorator(cap);

        choclatedecorator choclatedecorator = new choclatedecorator(topplingdecorator);

        System.out.println("total cost of combination of capucinno with choclate and toppling:"+choclatedecorator.getcost());

        espresso espresso = new espresso();

        choclatedecorator choclatedecorator1 = new choclatedecorator(espresso);

        System.out.println("total cost of esperssor with choclate:"+choclatedecorator1.getcost());
    }
}
