package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

public class BucketProblemDp {

    public static int [] [] store;
    public static void main(String [] args){

        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};

        int maxCapacity = 50;

          store = new int [value.length+1][maxCapacity+1];

        System.out.println("max profit:" +findMaximumCapacity(weight,value,maxCapacity));
    }


    public static int findMaximumCapacity(int [] weight,int [] value,int maximumCapacity){


        for(int i=0;i<=weight.length;i++){

            for(int j=0;j<= maximumCapacity;j++){

                if(i==0 || j==0)
                    store[i][j] = 0;
                else if (weight[i-1]<=j)
                    store[i][j] = Math.max(value[i-1]+store[i-1][j-weight[i-1]],store[i-1][j]);
                else
                    store[i][j] = store[i-1][j];
            }
        }

        return  store[value.length][maximumCapacity];
    }


}
