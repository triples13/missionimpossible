package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.behaviour.strategy.chainofresponsiblity;

public class Dollar20Denominition implements Denominition {

    int totalNumberOfNotes;

    private Denominition denominition;

    Dollar20Denominition(int totalNumberOfNotes){
        this.totalNumberOfNotes = totalNumberOfNotes;
    }
    @Override
    public void findNextCurrency(Denominition denominition) {
        this.denominition = denominition;
    }

    @Override
    public void dispenseCurrency(int requestedAmount) {

        if(requestedAmount>=20){
            int noOfNotes = requestedAmount/20;
            int remainingAmount = requestedAmount%20;

            totalNumberOfNotes = totalNumberOfNotes-noOfNotes;

            if(remainingAmount==0)
                System.out.println("total no of 20 dollars  notes disperesed:"+noOfNotes);

            else if(remainingAmount>0 && totalNumberOfNotes==0 || remainingAmount<50 && totalNumberOfNotes>0) {
                System.out.println("total no of 20 dollars  notes disperesed:"+noOfNotes);
                this.denominition.dispenseCurrency(remainingAmount);
            }
        }
        else
            this.denominition.dispenseCurrency(requestedAmount);
    }
}
