package com.learning.recursion;

import java.util.LinkedList;
import java.util.Queue;

public class StackOneQueue {
    Queue<Integer> integerQueue=new LinkedList<>();

    public static void main(String []args){
        StackOneQueue stack=new StackOneQueue();
        stack.push(34);
        stack.push(23);
        stack.push(56);
        stack.push(7);
        stack.push(1);
        System.out.println("data:"+stack.pop());
        stack.push(71);
        System.out.println("data:"+stack.pop());
    }


    public int pop(){
        int size=integerQueue.size();
        int counter=1;
        int temp=0;

        while(counter<size)
        {
            temp=integerQueue.poll();
            integerQueue.add(temp);
            counter++;
        }

        return integerQueue.poll();

    }

    public void push(int data){
        integerQueue.add(data);
    }
}
