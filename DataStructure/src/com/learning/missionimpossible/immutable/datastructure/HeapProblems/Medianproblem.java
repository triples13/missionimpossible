package com.learning.missionimpossible.immutable.datastructure.HeapProblems;

import javax.print.attribute.standard.Media;
import java.util.PriorityQueue;

public class Medianproblem {


   static PriorityQueue<Integer> maxHeap;
   static PriorityQueue<Integer> minHeap;
    public static void main(String [] args){

        maxHeap = new PriorityQueue<>((a,b)->(b-a));
        minHeap = new PriorityQueue<>((a,b)->(a-b));

        Medianproblem medianproblem = new Medianproblem();

        medianproblem.insertNum(3);
        medianproblem.insertNum(1);
        System.out.println("The median is: " + medianproblem.findMedian());
        medianproblem.insertNum(5);
        System.out.println("The median is: " + medianproblem.findMedian());
        medianproblem.insertNum(4);
        System.out.println("The median is: " + medianproblem.findMedian());
    }

    public void insertNum(int num){

        if(maxHeap.isEmpty() || maxHeap.peek()>=num)
            maxHeap.add(num);
       else
           minHeap.add(num);

        if(maxHeap.size()>minHeap.size()+1)
            minHeap.add(maxHeap.poll());
        else if (minHeap.size()>maxHeap.size())
            maxHeap.add(minHeap.poll());
    }

    public int findMedian(){

        if(maxHeap.size()==minHeap.size())
           return (maxHeap.peek()+minHeap.peek())/2 ;

        else
            return maxHeap.peek();


    }
}
