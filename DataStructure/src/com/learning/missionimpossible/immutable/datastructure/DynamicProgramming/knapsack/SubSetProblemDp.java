package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

public class SubSetProblemDp {

    public static void main(String [] args){
        int [] arr = {2,3,7,8,10};
        int target = 10;

        System.out.println("sum exist:"+findSubSetExist(arr,target));
    }

    public static boolean findSubSetExist(int [] arr,int target){

        boolean [] [] dpTable = new boolean [arr.length+1][target+1];


        for(int i=0;i<=arr.length;i++){

            for(int j=0;j<=target;j++){

                if(j==0)
                    dpTable[i][j] = true;
                else if(i==0)
                    dpTable[i][j] = false;

                else if (arr[i-1]<=j){
                    dpTable[i][j] = dpTable[i-1][j-arr[i-1]] || dpTable[i-1][j];
                }
                else
                    dpTable[i][j] = dpTable[i-1][j];
            }
        }

        return dpTable[arr.length][target];

     }
}
