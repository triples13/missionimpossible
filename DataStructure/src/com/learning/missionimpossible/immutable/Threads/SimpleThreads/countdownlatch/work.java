package com.learning.missionimpossible.immutable.Threads.SimpleThreads.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class work implements  Runnable {

    CountDownLatch countDownLatch;
    String teamName;
    work(CountDownLatch countDownLatch,String teamName){

        this.countDownLatch =countDownLatch;
        this.teamName = teamName;
    }

    @Override
    public void run() {

        System.out.println("team Name"+teamName);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        countDownLatch.countDown();
    }
}
