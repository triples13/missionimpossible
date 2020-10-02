package com.learning.missionimpossible.immutable.Threads.SimpleThreads.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class TestProducerConsumer {

    public static void main(String [] args){


        Queue<Integer>  queue = new LinkedList<>();

        Thread producer = new Thread(()->{


            synchronized (queue){

                int i=0;
                while(true){

                    System.out.println("producing:"+i);
                        queue.add(i);
                        try {
                            Thread.sleep(1000);
                            queue.notify();
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    i++;
                    }

                }

        });

        Thread consumer = new Thread(()->{

            synchronized (queue){
                while(true){

                    if(queue.isEmpty())
                        System.out.println("waiting for producer to fill....");

                    else
                        System.out.println("consuming:" + queue.poll());

                        queue.notify();

                    try {
                        Thread.sleep(1000);
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }

        });

        producer.start();
        consumer.start();

    }
}
