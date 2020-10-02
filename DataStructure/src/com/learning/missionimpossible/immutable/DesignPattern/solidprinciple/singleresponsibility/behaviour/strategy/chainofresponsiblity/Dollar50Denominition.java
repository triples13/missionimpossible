package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.behaviour.strategy.chainofresponsiblity;

import java.util.ArrayList;
import java.util.List;

public class Dollar50Denominition implements  Denominition {

    private Denominition denominition;
    int totalNumberOfNotes;

    Dollar50Denominition(int totalNumberOfNotes){
        this.totalNumberOfNotes =totalNumberOfNotes;
    }

    @Override
    public void findNextCurrency(Denominition denominition) {

        this.denominition = denominition;
    }

    @Override
    public void dispenseCurrency(int requestedAmount) {

          if(requestedAmount>=50){
              int noOfNotes = requestedAmount/50;
              int remainingAmount = requestedAmount%50;

              totalNumberOfNotes = totalNumberOfNotes-noOfNotes;

              if(remainingAmount==0)
                  System.out.println("total no of 50 dollars notes disperesed:"+noOfNotes);

              else if(remainingAmount>0 && totalNumberOfNotes==0 || remainingAmount<50 && totalNumberOfNotes>0) {
                  System.out.println("total no of 50 dollars  notes disperesed:"+noOfNotes);
                  this.denominition.dispenseCurrency(remainingAmount);
              }
          }
          else
                 this.denominition.dispenseCurrency(requestedAmount);



    }


}

interface A{

}
class B implements A{

}

class C extends B{

}
