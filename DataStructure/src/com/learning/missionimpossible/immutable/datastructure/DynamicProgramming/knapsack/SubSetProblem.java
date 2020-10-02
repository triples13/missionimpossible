package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

public class SubSetProblem {

    public static void main(String [] args){

        SubSetProblem subSetProblem = new SubSetProblem();

        int [] arr = {2,3,7,8,10};
        int target = 30;

        System.out.println("does exist:"+ findSubSetExist(arr,target,0));

    }

    public static  boolean findSubSetExist(int [] arr, int target, int n){

        if(target==0 )
            return  true;

        if(n>=arr.length)
            return false;

        if(target>0)
           return findSubSetExist(arr, target - arr[n], n + 1) || findSubSetExist(arr,target,n+1);


        return false;
    }
}
