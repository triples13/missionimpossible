package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestPairChain {

    public static  void main(String [] args){

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> inner1 = new ArrayList<>();
        inner1.add(5);
        inner1.add(24);
        ArrayList<Integer> inner2 = new ArrayList<>();
        inner2.add(39);
        inner2.add(60);
        ArrayList<Integer> inner3 = new ArrayList<>();
        inner3.add(15);
        inner3.add(28);
        ArrayList<Integer> inner4 = new ArrayList<>();
        inner4.add(27);
        inner4.add(40);
        ArrayList<Integer> inner5 = new ArrayList<>();
        inner5.add(50);
        inner5.add(90);

        list.add(inner1);
        list.add(inner2);
        list.add(inner3);
        list.add(inner4);
        list.add(inner5);

        System.out.println(list);

        System.out.println("longest:"+findLongest(list));

    }

// similar to longest increasing subsequence
    public static int findLongest(ArrayList<ArrayList<Integer>> A){

        int [] dp = new int [A.size()];
        int m = A.size();

        int max = Integer.MIN_VALUE;
        dp[0]=1;
        for(int i=1;i<m;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){

                if(A.get(i).get(0)>A.get(j).get(1) && dp[i]<dp[j]+1){
                    dp[i]  =  1+dp[j];
                }
            }
        }

        for(int i=0;i<dp.length;i++)
            max = Math.max(max,dp[i]);

        return max;
    }
}

