package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.behaviour.strategy.chainofresponsiblity;

public class TestChainOfResponsiblity {

    public static void main(String [] args){

        Denominition denominition50 = new Dollar50Denominition(4);

        Denominition denominition20 = new Dollar20Denominition(4);

        Denominition denominition10 = new Dollar10Denominition(4);

        denominition50.findNextCurrency(denominition20);

        denominition20.findNextCurrency(denominition10);

        denominition50.dispenseCurrency(260);

    }
}
