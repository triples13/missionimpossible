package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.behaviour.strategy.chainofresponsiblity;

public interface Denominition {

    public void findNextCurrency(Denominition denominition);

    public void dispenseCurrency(int requestedAmount);
}
