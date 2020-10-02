package com.learning.recursion;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class A implements Runnable {

    private  boolean  runningLoop = false;

    public boolean getRunningLoop() {
        return runningLoop;
    }

    public void setRunningLoop(boolean runningLoop) {
        this.runningLoop = runningLoop;
    }






    @Override
    public void run() {

        while (!runningLoop) {

            for (int i = 0; i < 10; i++) {

                System.out.println("thread a:" + i);
            }
        }
    }
}
class B implements Runnable{

    @Override
    public void run() {

        A a=new A();
        a.setRunningLoop(true);
        System.out.println("run me value:.............."+a.getRunningLoop());
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread b:"+i);
        }
    }


}
public class LearningThread {

    public static  void main(String []args){

       /* Thread a=new Thread(new A());
        a.start();

       Thread b=new Thread(new B());
        b.start();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new A().setRunningLoop(true);
        System.out.println("hey i am in main thread");*/

        //ExecutorService executorService= Executors.newSingleThreadExecutor();
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Runnable runnable1=()->{
            System.out.println("new thread"+Thread.currentThread().getName());
        };

        Runnable runnable2=()->{
            System.out.println("new thread"+Thread.currentThread().getName());
        };

        Runnable runnable3=()->{
            System.out.println("new thread"+Thread.currentThread().getName());
        };
        executorService.submit(runnable1);
        executorService.submit(runnable2);
        executorService.submit(runnable3);
    }


}
