package com.learning.missionimpossible.immutable.datastructure.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TestClass {

    public static  void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  lines = br.readLine();

        String[] strs = lines.trim().split("\\s+");

        int size = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);


        String  lines1 = br.readLine();

        String[] strs1 = lines1.trim().split("\\s+");


        int [] arr = new int [size];



        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(strs1[i]);
        }

        System.out.println(findMinimumCost(arr,k));
    }

    public static int findMinimumCost(int [] arr, int k){

        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((e1,e2)->(e2.getValue()-e1.getValue()));
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((e1,e2)->(e1.getValue()-e2.getValue()));

        Map<Integer,Integer> hmap = new HashMap<>();

        for(int i=0;i<arr.length;i++)
            hmap.put(i,arr[i]);

        maxHeap.addAll(hmap.entrySet());
        minHeap.addAll(hmap.entrySet());

        int counter =0;

        int minCost = Integer.MAX_VALUE;

        while(counter<k ){

            Map.Entry<Integer,Integer> maxDivide = maxHeap.poll();
            int x =  maxDivide.getValue();
            if(x%2!=0)
                x = x/2+1;
            else
                x= x/2;

            arr[maxDivide.getKey()] =x;


            Map.Entry<Integer,Integer> minMutiply = minHeap.poll();
             int y = minMutiply.getValue();
              y= y*2;
              arr[minMutiply.getKey()] =y;


              int sum=0;
              for(int z=0;z<arr.length;z++)
                  sum=sum+arr[z];


              maxDivide.setValue(x);
              maxHeap.add(maxDivide);
              minMutiply.setValue(y);
              minHeap.add(minMutiply);

              minCost = Math.min(minCost,sum);

              counter++;
        }

        return  minCost;

    }
}
