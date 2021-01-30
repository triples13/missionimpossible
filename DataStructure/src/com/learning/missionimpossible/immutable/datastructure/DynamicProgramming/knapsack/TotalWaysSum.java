package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

import java.util.ArrayList;
import java.util.List;

public class TotalWaysSum {

    static int count=0;
    public static void main(String [] args){



        System.out.println("total:"+ findTotal(8,3,1));
    }

    public static int findTotal(int n, int k,int start){

        if(start>k)
            return 0;
        if(n==0)
            return 1;

        if(n<0)
            return 0;


      return  findTotal(n-start,k,start)+findTotal(n,k,start+1);
        }

}
