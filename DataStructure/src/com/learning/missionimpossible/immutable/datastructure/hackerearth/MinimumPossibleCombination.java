package com.learning.missionimpossible.immutable.datastructure.hackerearth;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumPossibleCombination {


    public static void main(String [] args){

        Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();

        for(int i=0;i<testCases;i++)
        {
            int len = scn.nextInt();

            int [] arr = new int [len];
            for(int j=0;j<len;j++)
                arr[j] = scn.nextInt();

            findMinimum(arr);

        }
    }

    public static void findMinimum(int [] arr){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->(a-b));

    int minimium = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
            minHeap.add(arr[i]);


        int pos = 0;
        while(!minHeap.isEmpty()){

            int k = minHeap.poll();

            if(k*arr.length<minimium)
            {
                minimium = k*arr.length;
                pos =k;
            }
        }

        System.out.println(pos);

    }


}
