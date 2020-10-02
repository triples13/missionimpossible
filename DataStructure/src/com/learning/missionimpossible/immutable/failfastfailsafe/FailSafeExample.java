package com.learning.missionimpossible.immutable.failfastfailsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

    public static void main(String [] args){

        List<String> stringList = new CopyOnWriteArrayList<>();
        stringList.add("hello");
        stringList.add("shashank");
        stringList.add("ramehs");

        Iterator<String> listIterator = stringList.iterator();

       while(listIterator.hasNext()){

           System.out.println(listIterator.next());
           stringList.add("asasas");
       }
    }
}
