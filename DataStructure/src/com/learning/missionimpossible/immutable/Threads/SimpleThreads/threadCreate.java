package com.learning.missionimpossible.immutable.Threads.SimpleThreads;

public class threadCreate {


    public static void main(String[] args) {

        Thread t1 = new Thread(()->{

            for(int i=0;i<10;i++)
                System.out.println("i1:"+i);
        });
        t1.start();

        Thread t2 = new Thread(()->{

            for(int i=0;i<10;i++)
                System.out.println("i2:"+i);
        });

        t2.start();


    }
}


