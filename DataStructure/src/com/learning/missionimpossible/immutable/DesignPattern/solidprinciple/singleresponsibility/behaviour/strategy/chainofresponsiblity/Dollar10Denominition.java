package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.behaviour.strategy.chainofresponsiblity;

public class Dollar10Denominition implements  Denominition {

    int totalNumberOfNotes;
    private Denominition denominition;

    Dollar10Denominition(int totalNumberOfNotes){
        this.totalNumberOfNotes = totalNumberOfNotes;
    }
    @Override
    public void findNextCurrency(Denominition denominition) {
        this.denominition = denominition;
    }

    @Override
    public void dispenseCurrency(int requestedAmount) {

        if(requestedAmount>=10){
            int noOfNotes = requestedAmount/10;
            int remainingAmount = requestedAmount%10;

            totalNumberOfNotes = totalNumberOfNotes-noOfNotes;

            if(remainingAmount==0)
                System.out.println("total no of 10 dollars  notes disperesed:"+noOfNotes);

            if(remainingAmount>0 && totalNumberOfNotes==0 || remainingAmount<10 && totalNumberOfNotes>0) {
                System.out.println("money cant be dispersed");
            }
        }
        else
            System.out.println("money cant be dispensed");
    }
}
