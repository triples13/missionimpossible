package com.learning.missionimpossible.immutable.Threads.SimpleThreads.mutex;

import java.util.concurrent.Semaphore;

public class MutexExample {
    public static void main(String [] args){


        Semaphore semaphore = new Semaphore(1);
        Student student = new Student(semaphore);

        Thread t1 = new Thread(()->{

            try {
                student.purchaseTicket();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(()->{

            try {
                student.purchaseTicket();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(()->{

            try {
                student.purchaseTicket();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.setName("first");
        t2.setName("second");
        t3.setName("third");
        t1.start();
        t2.start();
        t3.start();

    }
}

class Student{

    Semaphore mutex;

    Student(Semaphore semaphore){
        this.mutex = semaphore;
    }



    public void purchaseTicket() throws InterruptedException {

        System.out.println("thread:"+Thread.currentThread().getName()+" "+"waiting to acquire lock");
        mutex.acquire();

        System.out.println("thread:"+Thread.currentThread().getName()+" "+"doing job");

        mutex.release();

        System.out.println("thread:"+Thread.currentThread().getName()+" " +"has done the job");
    }

}
