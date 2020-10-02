package com.learning.recursion;

public class BurstBaloonDp {
    public static void main(String [] args){
        int [] arr = {3,1,5,8};


    }


    public static void calculateDp(int [] num){

        int [] B = new int [num.length];
        int l = num.length;
        int r = num.length;
        int [][] dp = new int [l][r];

       /* for(int window=1;window<num.length;window++){

            int left = 0;

            for( ;left< num.length-window+1;left++){

                int right = left;

                for(int k = left ;k<right;k++){

                    dp[left][right] = Math.max(dp[left][right],dp[k][])
                }


            }
        }*/
    }
}
