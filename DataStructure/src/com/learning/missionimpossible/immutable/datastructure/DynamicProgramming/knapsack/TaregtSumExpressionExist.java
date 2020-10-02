package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

public class TaregtSumExpressionExist {

    static int count =0;
    public static void main(String [] args){

        int [] arr = {1,1,2,3};
        int target = 1;

        findTargetSumExpressionExist(arr,target,0,0);

        System.out.println("total combinations:"+count);
    }

    public static  void findTargetSumExpressionExist(int [] arr, int target, int start,int n){

        if(target==start && n==arr.length) {
            count++;
            return;
        }
        if(n>=arr.length)
            return ;

      findTargetSumExpressionExist(arr,target,start+arr[n],n+1) ;
      findTargetSumExpressionExist(arr,target,start-arr[n],n+1);
    }
}
