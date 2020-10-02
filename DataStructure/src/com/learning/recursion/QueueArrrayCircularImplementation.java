package com.learning.recursion;

public class QueueArrrayCircularImplementation {

    private int front=-1;
    private int rear=-1;
    private int size;
    int []queuearray;
    QueueArrrayCircularImplementation(int size){
        this.size=size;
        this.queuearray=new int[size];
    }

    public void enqueue(int data) throws  Exception{
        if(isQueueFull()){
            throw new Exception("queue is full");
        }
        else if(isQueueEmpty()){
            front=rear=0;
        }
        queuearray[rear]=data;
        rear=(rear+  1)%size;
    }
    public boolean isQueueEmpty(){
        boolean queueempty=false;
        if(rear==-1){
            queueempty=true;
        }
        return queueempty;

    }

    public boolean isQueueFull(){
        boolean queuefull=false;
        if(front==rear){
            queuefull=true;
        }
        return queuefull;
    }


}
