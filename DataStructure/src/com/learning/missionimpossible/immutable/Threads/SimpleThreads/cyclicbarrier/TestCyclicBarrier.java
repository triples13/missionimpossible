package com.learning.missionimpossible.immutable.Threads.SimpleThreads.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {

    public static  void main(String [] args) throws InterruptedException {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        Thread t1 = new Thread(()->{

            try {
                cyclicBarrier.await();

                System.out.println("awaiting for threads");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });


        Thread t2 = new Thread(()->{

            try {
                cyclicBarrier.await();

                System.out.println("awaiting for threads");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(()->{

            try {
                cyclicBarrier.await();
                System.out.println("awaiting for threads");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }


        });


        t3.start();
        t1.start();

        Thread.sleep(2000);
        t2.start();



    }
}
