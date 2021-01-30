package com.learning.missionimpossible.immutable.datastructure.array.binarysearch.stack;

public class StockProfitTransaction {

    public static void main(String [] args){

        int [] arr= {7,1,5,3,6,4};

        findMaxProfitInAllTransaction(arr);
    }

    public static void  findMaxProfitInAllTransaction(int [] arr){

        int totalProfit =0;

        for(int i=0;i<arr.length-1;i++){

            // move untill we find valley
            while(i<arr.length-1 && arr[i]>arr[i+1])
                 i++;

            int valley = arr[i];

            // move untill we find peak
            while(i<arr.length-1 && arr[i+1]>arr[i])
                i++;

            int peak = arr[i];

            totalProfit =totalProfit +peak-valley;
        }

        System.out.println("total profit:"+totalProfit);
    }
}
