package com.learning.missionimpossible.immutable.datastructure.HeapProblems;

import java.util.PriorityQueue;

public class MaximumProfit {

    public static void main(String [] args){

        int [] projectCapitals ={0,1,2,3};
        int [] projectProfits = {1,2,3,5};
        int projects =3;
        int initialCapital =0;

        System.out.println("max profit:"+maximumProfit(projectCapitals,projectProfits,projects,initialCapital));
    }

    public static int maximumProfit(int [] projectCapitals,int [] projectProfits,int projects,int initialCapital){


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->(b-a));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->(a-b));

        for(int i=0;i<projectCapitals.length;i++)
            minHeap.add(i);


       for(int i=0;i<projects;i++){

           while(!minHeap.isEmpty() && projectCapitals[minHeap.peek()]<=initialCapital)
               maxHeap.add(minHeap.poll());

           if(maxHeap.isEmpty())
              break;

           initialCapital=initialCapital+projectProfits[maxHeap.poll()];
      }

       return initialCapital;
    }
}
