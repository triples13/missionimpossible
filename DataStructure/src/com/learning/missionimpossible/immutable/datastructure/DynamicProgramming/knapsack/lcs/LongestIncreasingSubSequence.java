package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubSequence {

    static int globalCount = Integer.MIN_VALUE;
    public static void main(String [] args){

        List<Integer> x = Arrays.asList(0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15);
        System.out.println("count:"+findCount(x,Integer.MIN_VALUE,0));
    }

    public static int findCount(List<Integer> A, int prev,int current){


        if(current>=A.size())
            return 0;


        int taken =0;
         if(A.get(current)>prev)
             taken = 1+findCount(A,A.get(current),current+1);//take the element in increasing subsequence

             int notTaken = findCount(A, prev, current+1);// don't take the element in increasing subsequence

             return Math.max(taken,notTaken);
    }
}
