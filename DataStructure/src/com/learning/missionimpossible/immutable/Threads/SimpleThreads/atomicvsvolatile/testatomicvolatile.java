package com.learning.missionimpossible.immutable.Threads.SimpleThreads.atomicvsvolatile;

public class testatomicvolatile {

    public static void main(String [] args){

        testme me = new testme();
        Thread t1 = new Thread(()->{
            me.makefalse();
        });

        Thread t2 = new Thread(()->{
            me.testvolatile();
        });


        t2.start();
        t1.start();


    }
}
