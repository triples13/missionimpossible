package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

public class RodCuttingProblemDp {

    public static void main(String [] args){

        int [] rodLengths = {1,2,3,4,5,6,7,8};
        int [] price = {1,5,8,9,10,17,17,20};

        int rodLength = 8;

        System.out.println("maximum pprofit:"+maxCost(rodLengths,price,rodLength,0));
    }

    public static int maxCost(int [] rodLengths,int [] price,int rodLength,int n){

        int [][] dp = new int [rodLength+1][price.length+1];


        for(int i=0;i<=price.length;i++){

            for(int j=0;j<=rodLength;j++){

                if(i==0 || j==0)
                    dp[i][j]=0;

                else if(j-rodLengths[i-1]>=0) {
                    //price if we take ith is price[i-1] + price if we dont take ith
                    // or dont take ith

                    // unbounded knapsack so dp[i] instead of dp[i-1]
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - rodLengths[i - 1]], dp[i - 1][j]);
                }

                else
                    dp[i][j]= dp[i-1][j];
            }
        }

        return dp[rodLength][price.length];
    }
}
