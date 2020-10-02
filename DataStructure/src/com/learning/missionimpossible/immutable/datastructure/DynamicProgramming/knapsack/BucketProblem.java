package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

public class BucketProblem {

    public static void main(String[] args) {

        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};

        int maxCapacity = 50;

        System.out.println("maximum profit:"+findMaximumProfit(weight, value, maxCapacity, 0));
    }


    public static int findMaximumProfit(int[] weight, int[] value, int maximumCapacity, int n) {

        if (maximumCapacity <= 0 || n >= value.length)
            return 0;
        int profit1 = 0;
        int profit2 = 0;

        if (weight[n] <=maximumCapacity) {
            profit1 = value[n] + findMaximumProfit(weight, value, maximumCapacity - weight[n], n + 1);
            profit2 = findMaximumProfit(weight, value, maximumCapacity, n + 1);
        }

        return Math.max(profit1, profit2);
    }
}
