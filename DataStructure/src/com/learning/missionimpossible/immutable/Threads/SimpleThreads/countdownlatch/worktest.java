package com.learning.missionimpossible.immutable.Threads.SimpleThreads.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class worktest {

    public static void main(String [] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(2);

        Thread thread1 = new Thread( new work(countDownLatch,"teamA"));
        Thread thread2 = new Thread(new work(countDownLatch,"teamB"));

        Thread thread3 = new Thread(new work(countDownLatch,"teamC"));


        thread1.start();
        thread2.start();

        // wait for team A and B to finish
        countDownLatch.await();

        thread3.start();




    }
}

