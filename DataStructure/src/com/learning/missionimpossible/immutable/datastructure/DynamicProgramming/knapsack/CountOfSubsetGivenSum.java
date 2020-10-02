package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

public class CountOfSubsetGivenSum {

    public static void main(String [] args){

        int [] arr = {4,3,7,8};
        int target = 15;

        System.out.println("no of subsets:"+ findNumberOfGivenSubsets(arr,target,0));
    }

    public static int findNumberOfGivenSubsets(int [] arr, int target, int n){

        if(target==0 )
            return  1;

        if(n>=arr.length)
            return 0;

        return  findNumberOfGivenSubsets(arr,target-arr[n],n+1)+findNumberOfGivenSubsets(arr,target,n+1);
    }


}
