package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;


/*

There are a row of n houses, each house can be painted with one of the three colors: red, blue or green.
The cost of painting each house with a certain color is different. You have to paint all the houses
 such that no two adjacent houses have the same color.

The cost of painting each house with a certain color is represented by a n x 3 cost matrix.
For example, costs[0][0] is the cost of painting house 0 with color red; costs[1][2] is the cost of
painting house 1 with color green, and so on... Find the minimum cost to paint all houses.
 */
public class PaintHouse {

    public static void main(String [] args){

        int [][] dp = {{24,32,12},{61,78,89},{33,29,42}};

       findMinimumCost(dp);

    }

    public static  void findMinimumCost(int [][] dp){

        int [][] cost = new int[dp.length][dp[0].length];
        for(int i=0;i<dp.length;i++) {

            if (i == 0) {
                cost[i][0] = dp[i][0];
                cost[i][1] = dp[i][1];
                cost[i][2] = dp[i][2];
            } else {
                cost[i][0] = dp[i][0] + Math.min(cost[i - 1][1], cost[i - 1][2]  );
                cost[i][1] = dp[i][1] + Math.min(cost[i - 1][0], cost[i - 1][2]);
                cost[i][2] = dp[i][2] + Math.min(cost[i - 1][0], cost[i - 1][1]);

            }
        }

        int x = dp.length-1;
        System.out.println("minimum cost:"+Math.min(cost[x][0],Math.min(cost[x][1],cost[x][2])));
    }
}
