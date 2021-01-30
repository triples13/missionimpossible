package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

public class LargestAdjacentSumDp {

    public static void main(String [] args){
        int arr[] = {5, 5, 10, 100, 10, 5};

         //5  5  10 100  10   5
   //incl  5  5  15 105  25   120  -> include and element exclude[i-1]+arr[i]
 //exclude X  5   5 15  115   115  -> max(include(i-1) && exclude (i-1));

        System.out.println("maximum sum:"+ findMaxSum(arr));
    }

    public static int findMaxSum(int [] arr){

        int [] [] dp = new int [2][arr.length];

        for(int i=0;i<dp[0].length;i++){

            if(i==0) {
                dp[0][i] = arr[i];
                dp[1][i] = 0;
            }
            else{

                dp[0][i] = dp[1][i-1]+arr[i];
                dp[1][i] = Math.max(dp[0][i-1],dp[1][i-1]);
            }
        }


        return Math.max(dp[0][dp[0].length-1],dp[1][dp[0].length-1]);
    }
}
