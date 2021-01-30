package com.learning.recursion;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Test{

    static boolean [] visited;
    static int totalCost = Integer.MAX_VALUE;
    public static void main(String []args){

        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int [] arr= new int [size];

        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();

        visited = new boolean[arr.length];

        System.out.print(findMinimumJumps(arr,0));

    }



    public static int findMinimumJumps(int [] arr,int pos){

        if(pos>arr.length-1 || pos <0){
            System.out.print(pos);
            return 0;
        }
        if(pos==arr.length-1)
            return arr[pos];

        visited[pos] = true;
        int forwardCost =0;
        int backwardCost =0;
        if(pos+2<=arr.length-1 && !visited[pos+2])
            forwardCost = arr[pos] + findMinimumJumps(arr,pos+2);
        if(pos-1>=0 && !visited[pos-1])
            backwardCost =arr[pos] +findMinimumJumps(arr,pos-1);


        return Math.min(forwardCost,backwardCost);
    }
}