package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.behaviour.strategy.observer;

public class TestObserver {

    public static void  main(String [] args){

        IObservable iObservable = new WeatherStationObservable();

        iObservable.setTemperature(46);

        IObserver observer  = new DigitalDisplay(iObservable);
        iObservable.add(observer);
        iObservable.notifyObserver();

        Idisplay idisplay = (Idisplay) observer;

        idisplay.display();




    }
}
