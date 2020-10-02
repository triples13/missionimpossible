package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.behaviour.strategy.observer;

public interface IObservable {

    public void add(IObserver iObserver);
    public void remove(IObserver iObserver);
    public void notifyObserver();
    public int getTemperature();
    public void setTemperature(int temperature);
}
