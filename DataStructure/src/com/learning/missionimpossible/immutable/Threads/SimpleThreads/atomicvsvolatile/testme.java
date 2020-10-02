package com.learning.missionimpossible.immutable.Threads.SimpleThreads.atomicvsvolatile;

public class testme {

   volatile boolean isTrue;
    testme(){
        isTrue = true;
    }

    public void testvolatile(){

  // there is no gurantee that another thread sees updated value of isTrue immediately
        //so use volatile

        while (isTrue){

            System.out.println("printing");
        }

    }

    public void makefalse(){
        isTrue = false;
    }
}
