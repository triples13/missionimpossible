package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

public class LargestAdjacentSum {

    public static void main(String [] args){

        int [] arr = {5,5,10,100,10,5};

    //    findLargestSum(arr,arr.length);
    }

    public int findLargestSum(int [] arr,int n){



       int l = arr[n] + findLargestSum(arr,n-2);
       int r = findLargestSum(arr,n-1);

       return Math.max(l,r);
    }
}
