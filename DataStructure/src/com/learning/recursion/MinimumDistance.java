package com.learning.recursion;

import java.util.HashMap;
import java.util.Map;

public class MinimumDistance {

    public static void main(String []args){
        Map<Integer,Integer> hmap=new HashMap<>();
        int maximumDistance=Integer.MIN_VALUE;

        int []arr={3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        for(int i=0;i<arr.length;i++){

            if(!hmap.containsKey(arr[i])){
                hmap.put(arr[i],i);
            }
            else{
               int x= hmap.get(arr[i]);
              int  distance=i-x;
              if(distance>maximumDistance){
                  maximumDistance=distance;
              }
            }
        }

        System.out.println("maximum distance:"+maximumDistance);
    }
}
