package com.learning.recursion;

import java.util.Arrays;
import java.util.Scanner;


public class solution {

    public static void main(String[] args) {

        int [] arr = {4,5,4,7,3,5,4,6};
        System.out.println("val:" +calculateTime(arr,8,2));
    }



    private static int calculateTime(int[] arr, int n, int k) {

          int [] dp = new int [n];
          int max = Integer.MIN_VALUE;

           for(int i=1;i<n;i++){

               for(int j=0;j<i;j++){
                   int x = arr[i]^arr[j];

                   if(x==k) {
                       dp[i] = Math.max(dp[i], 1 + dp[j]);
                       max = Math.max(dp[i],max);
                   }
               }
           }

           return max;
    }


}
