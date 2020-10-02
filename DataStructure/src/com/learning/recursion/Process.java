package com.learning.recursion;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class manufacturer{

    List arrayList=new ArrayList();
    int count =0;
    int limit=5;
    public void producer() throws InterruptedException {

        synchronized (this) {
            while (true) {
                if (arrayList.size()==limit) {
                    System.out.println("waiting for consumer to empty");
                    wait();
                }
                else{
                  arrayList.add(count++);
                    notify();
                }

            }
        }
    }

    public void consumer() throws InterruptedException {

        Thread.sleep(1000);
        synchronized (this){

            while (true){
                if (arrayList.isEmpty()){
                    System.out.println("waiting for producer to fill");
                    wait();
                }
                else{
                   arrayList.remove(--count);
                    notify();
                }
            }

        }
    }
    }
public class Process {
    public static void main(String []args){

        manufacturer  manu=new manufacturer();
  Runnable r1=()->{
      try {
          manu.producer();
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  };
  Runnable r2=()->{

      try {
          manu.consumer();
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  };

  Thread t1=new Thread(r1);
  t1.start();

  Thread t2=new Thread(r2);
  t2.start();
}
}
