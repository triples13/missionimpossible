package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.behaviour.strategy.observer;

public class DigitalDisplay implements  Idisplay,IObserver {

    IObservable iObservable;

    DigitalDisplay(IObservable iObservable)
    {
        this.iObservable = iObservable;
    }

    private int temperature;

    @Override
    public void display() {
        System.out.println("new temperature received:"+temperature);
    }

    @Override
    public void update() {
        temperature = iObservable.getTemperature();
    }
}
