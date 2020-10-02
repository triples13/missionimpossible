package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

public class DifferenceSubset {

    public static void main(String [] args){
        int [] arr = {1,1,2,3};
        int diff = 1;

        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum=sum+arr[i];

        System.out.println("no of subsets with given difference: "+ findDifferenceSubsets(arr,(sum+diff)/2,0));
    }

    public static int findDifferenceSubsets(int [] arr,int target,int n){

        if(target==0)
            return 1;
        if(n>=arr.length)
            return 0;

        return findDifferenceSubsets(arr,target-arr[n],n+1)+findDifferenceSubsets(arr,target,n+1);
    }
}
