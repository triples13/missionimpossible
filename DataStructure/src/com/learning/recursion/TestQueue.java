package com.learning.recursion;

public class TestQueue {

    public static void main(String []args) throws Exception{
        QueueImplementation queue=new QueueImplementation(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();

        System.out.println("element"+queue.getfrontvalue());

    }
}
