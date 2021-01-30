package com.learning.missionimpossible.immutable.datastructure.array.binarysearch.stack;

public class StockProfit {

    public static void main(String [] args){

        int [] arr = {7,1,5,3,6,4};

        findMaximumProfit(arr);
    }

    public static void findMaximumProfit(int [] arr){


        int maxProfit = Integer.MIN_VALUE;

        int minProfit = arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]-minProfit>maxProfit)
                maxProfit = arr[i]-minProfit;
            else if(arr[i]<minProfit)
                minProfit = arr[i];
        }

        System.out.println("max profit:"+maxProfit);
    }
}
