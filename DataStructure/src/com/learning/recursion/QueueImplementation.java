package com.learning.recursion;

import java.util.Queue;

public class QueueImplementation {

    private int size;
    private int front=-1;
    private int rear=-1;
    int []queuearray;
    QueueImplementation(int size){
        this.size=size;

        queuearray=new int[size];
    }

    public void enqueue(int data) throws Exception{

        if(isQueueFull()){
            throw  new Exception("queue is full");
        }
        else if(isQueueEmpty()){
            System.out.println("queue was empty");
            front=front+1;

        }

            queuearray[++rear]=data;


    }
    public int dequeue() throws Exception{

        if(isQueueEmpty()){
            throw  new Exception("queue is empty");
        }

        int data=queuearray[front];
        front++;
        return data;
    }
    public boolean isQueueFull()
    {
        boolean isfull=false;
        if(size-1==rear)
        {
            isfull=true;
        }
        return isfull;
    }
    public boolean isQueueEmpty(){
        boolean QueueEmpty=false;

        if(rear==-1){
            QueueEmpty=true;
        }

        return  QueueEmpty;
    }

    public int getfrontvalue(){

        return queuearray[front];
    }
    }


