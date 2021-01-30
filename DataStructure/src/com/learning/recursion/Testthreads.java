package com.learning.recursion;

import java.util.*;

class PirateTalk{
    public static  void main(String...args){

        List<Integer> integerList= Arrays.asList(6,12,3,9,3,5,1);
         stockPairs(integerList,Long.valueOf(12));
    }

    public static int stockPairs(List<Integer> stocksProfit, long target) {
        // Write your code here

        Map<Long,Integer> hmap = new HashMap<>();

        for(int i=0;i<stocksProfit.size();i++)
            hmap.put(Long.valueOf(stocksProfit.get(i)),i);

        int count =0;

        for(int i=0;i<stocksProfit.size();i++){

            if(hmap.containsKey(target-stocksProfit.get(i)) && i!=hmap.get(target-stocksProfit.get(i))){
                hmap.remove(target-stocksProfit.get(i));
                hmap.remove(Long.valueOf(stocksProfit.get(i)));
                count++;

            }
        }

        return count;
    }
}