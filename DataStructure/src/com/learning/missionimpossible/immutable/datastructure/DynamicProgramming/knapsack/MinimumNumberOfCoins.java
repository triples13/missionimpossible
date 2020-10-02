package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfCoins {

    public static void main(String [] args){

        int [] coin = {1,2,3,5};
        int totalSum=31;
        System.out.println("minimum coins needed:"+minimumNumberofCoins(coin,totalSum,0));
    }

    public static int minimumNumberofCoins(int [] coins, int totalSum,int n){

        if(totalSum==0)
            return 0;

        if(n>=coins.length)
            return Integer.MAX_VALUE;


    int coin1 =0;
    int coin2 =0;

        if(totalSum-coins[n]>=0) {
            coin1 = 1 + minimumNumberofCoins(coins, totalSum - coins[n], n);
            coin2 = minimumNumberofCoins(coins, totalSum, n + 1);
        }


        return Math.min(coin1,coin2);



    }
}
