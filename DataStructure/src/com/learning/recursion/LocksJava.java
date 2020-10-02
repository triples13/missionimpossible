package com.learning.recursion;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class LocksJava {

    ReentrantLock reenter=new ReentrantLock();

    public static void main(String []args){

        LocksJava locks=new LocksJava();
        Thread t1=new Thread(()->{
            try {
                locks.sayHello();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();

        Thread t2=new Thread(()->{
            try {
                locks.sayHello();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t2.start();
    }

    public  void sayHello() throws InterruptedException {





        if (reenter.tryLock(2000, TimeUnit.MILLISECONDS)) {

            for (int i = 0; i < 10; i++) {

                try {
                    System.out.println("thread exexxuting is is:" + Thread.currentThread().getName());
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("get hold count:" + reenter.getHoldCount());
            reenter.unlock();

            System.out.println("get hold count:" + reenter.getHoldCount());

        } else {
            System.out.println("Thread uncessful in getting lock");
            System.out.println("Thread name:" + Thread.currentThread().getName());
        }
    }
}
