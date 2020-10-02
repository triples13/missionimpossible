package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

import static com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.SubSetProblem.findSubSetExist;

public class EqualSumPartition {

    public static void main(String [] args){

        int [] arr= {2,3,4,6};

        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum=sum+arr[i];

        System.out.println("subset exist:" +findIfEqualPartitionExist(arr,sum,0));

    }

    public static boolean findIfEqualPartitionExist(int []arr, int target,int n){

        if(target%2!=0)
            return false;
       else
        return  findSubSetExist(arr,target/2,0);
    }
}
