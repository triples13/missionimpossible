package com.learning.recursion;

import java.util.ArrayList;
import java.util.List;

public class BurstBallon {


    public static void main(String [] args){

        int [] cost = {3,1,5,8,11,12,13,2,4,9,10};

        List<Integer> myList = new ArrayList<>();
        for(int i=0;i<cost.length;i++)
            myList.add(cost[i]);

        System.out.println( findMaximumCost(myList));
    }

    public static int findMaximumCost(List<Integer> myList){

        int max =0;
        if(myList.size()==1)
            return myList.get(0);


        for(int i=0;i<myList.size();i++){

            int left = i==0 ? 1:myList.get(i-1);
            int right = i==myList.size()-1?1:myList.get(i+1);

            int cost = myList.get(i)*left*right;


            List<Integer> temp = new ArrayList<>(myList);
            temp.remove(i);

            max = Math.max(max,cost+findMaximumCost(temp));
        }

        return  max;
    }
}
