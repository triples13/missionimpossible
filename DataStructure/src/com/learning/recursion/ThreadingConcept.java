package com.learning.recursion;

public class ThreadingConcept {

    public static void main(String []args){
        MyThread mythread=new MyThread();
        MyThread mythread1=new MyThread();
        Thread t1=new Thread(mythread,"thread 1");
        Thread t2=new Thread(mythread,"thread 2");
        t1.start();
        t2.start();
    }

}

class MyThread implements Runnable{

    public void run(){

        synchronized (this){
            System.out.println("thread executing non static:"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       //whenever a thread acquires lock on a class then no other thread can acquire lock on synchronized block


        synchronized (MyThread.class){
            System.out.println("thread executing: static class "+Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
  /*      try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2();*/
    }

    public   synchronized void m1() throws InterruptedException {

        System.out.println("thread executing:"+Thread.currentThread().getName());
        Thread.sleep(1000);
    }

    public static synchronized  void m2(){
        System.out.println("thread executing method:"+Thread.currentThread().getName());
    }
}
