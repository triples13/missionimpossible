package com.learning.testinterview;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class testing {

    public static void main(String [] args){

        List<Integer> myList = Arrays.asList(8,7,3,10,6,8,9,3);
        int k=3;

        System.out.println( getMinWIndow(myList,k));
    }
    public static int getMinWIndow(List<Integer> myList ,int k){

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b)->(a-b));

        priorityQueue.addAll(myList);

        int count =0;

        while(! priorityQueue.isEmpty() && count<k ){

            priorityQueue.poll();
            count++;
        }

        return priorityQueue.peek();
    }
}
