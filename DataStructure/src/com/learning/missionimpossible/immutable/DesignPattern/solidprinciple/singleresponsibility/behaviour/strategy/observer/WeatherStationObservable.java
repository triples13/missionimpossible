package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.behaviour.strategy.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements  IObservable {

    private List<IObserver> iObserverList;

    int temperature;

    WeatherStationObservable(){
        iObserverList = new ArrayList<>();
    }


    @Override
    public void add(IObserver iObserver) {
        this.iObserverList.add(iObserver);
    }

    @Override
    public void remove(IObserver iObserver) {
       this.iObserverList.remove(iObserver);
    }

    @Override
    public void notifyObserver() {
        iObserverList.stream().forEach(iObserver -> {
            iObserver.update();
        });
    }

    public int getTemperature(){
        return this.temperature;
    }

    public void setTemperature(int temperature)
    {
       this.temperature = temperature;
    }
}

