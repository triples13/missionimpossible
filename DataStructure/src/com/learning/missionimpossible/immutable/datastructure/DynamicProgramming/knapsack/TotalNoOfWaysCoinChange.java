package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

public class TotalNoOfWaysCoinChange {

    public static void main(String[] args) {


    int[] coin = {1, 2, 3, 5};
    int totalSum = 1;
        System.out.println("total ways:"+ totalWays(coin, totalSum,0));
}

public static int totalWays(int [] coins,int totalSum,int n){
     if(totalSum==0)
        return 1;

    if(n>=coins.length)
        return 0;



    int ways =0;
    if(totalSum-coins[n]>=0)
      ways =  totalWays(coins,totalSum-coins[n],n)+totalWays(coins,totalSum,n+1);

    return ways;
  }
}
