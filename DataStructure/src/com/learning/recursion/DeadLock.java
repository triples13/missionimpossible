package com.learning.recursion;


class Foo{



}
public class DeadLock {
    public static  void main(String []args){

        Foo firstobject=new Foo();
        Foo secondobject=new Foo();
        Runnable task1=()->{
         synchronized (firstobject){

             System.out.println("thread acquireslock1"+Thread.currentThread().getName());
             try {
                 Thread.sleep(100);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }


             synchronized (secondobject){
                 System.out.println("thread acquireslock2"+Thread.currentThread().getName());
             }
         }
        };


        Runnable task2=()->{
            synchronized (secondobject){
                System.out.println("thread acquireslock2"+Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (firstobject){
                    System.out.println("thread acquireslock1"+Thread.currentThread().getName());
                }
            }
        };

        Thread t1=new Thread(task1);
        t1.setName("ram");
        Thread t2=new Thread(task2);
        t2.setName("shayam");
        t1.start();
        t2.start();
    }
}
