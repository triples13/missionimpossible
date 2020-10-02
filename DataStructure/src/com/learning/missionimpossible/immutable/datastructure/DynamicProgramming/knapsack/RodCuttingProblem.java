package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

public class RodCuttingProblem {

    public static void main(String [] args){

        int [] length = {1,2,3,4,5,6,7,8};
        int [] price = {1,5,8,9,10,17,17,20};

        int rodLength = 8;

        System.out.println("maxm cost:"+maximumRodLengthPrice(length,price,8,0));
    }

    public static int maximumRodLengthPrice(int [] length, int [] price,int rodLength, int n){

        if(rodLength==0)
            return 0;
        if(n>=price.length)
            return 0;
        int price1=0,price2=0;
        if(length[n]<=rodLength) {
            price1 = price[n] + maximumRodLengthPrice(length, price, rodLength - length[n], n);

            price2=maximumRodLengthPrice(length,price,rodLength,n+1);
        }

        return Math.max(price1,price2);
    }
}
