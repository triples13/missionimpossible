package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSequenceDp {

    public static void main(String [] args){
        List<Integer> x = Arrays.asList(0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15);

        System.out.println("longest:" +findLongestIncreasingSubsequence(x));
    }

    public static int findLongestIncreasingSubsequence(List<Integer> x){


        int [] dp = new int [x.size()];

        for(int i=0;i<x.size();i++){

           for(int j=0;j<i;j++){

               if(x.get(j)<x.get(i) && dp[i]<dp[j]+1)
                   dp[i]=1+dp[j];

           }
        }

      return dp[dp.length-1];
    }
}
